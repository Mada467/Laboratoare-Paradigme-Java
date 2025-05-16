package Laborator8Paradigme;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Problema2 {
    public static void main(String[] args) {
        Workbook wb = new HSSFWorkbook();
        Sheet sheet = wb.createSheet("Sheet_1");

        // Creare stiluri pentru celule
        // Stil pentru headerul verde
        HSSFCellStyle greenHeaderStyle = (HSSFCellStyle) wb.createCellStyle();
        greenHeaderStyle.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
        greenHeaderStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        // Font pentru header (bold)
        HSSFFont boldFont = (HSSFFont) wb.createFont();
        boldFont.setBold(true);
        greenHeaderStyle.setFont(boldFont);

        // Stil pentru celulele galbene (Max și Average)
        HSSFCellStyle yellowStyle = (HSSFCellStyle) wb.createCellStyle();
        yellowStyle.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
        yellowStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        // Primul rând - Header
        Row row = sheet.createRow(0);

        Cell cell;

        cell = row.createCell(0);
        cell.setCellValue("Name");
        cell.setCellStyle(greenHeaderStyle);

        cell = row.createCell(1);
        cell.setCellValue("Surname");
        cell.setCellStyle(greenHeaderStyle);

        cell = row.createCell(2);
        cell.setCellValue("Grade 1");
        cell.setCellStyle(greenHeaderStyle);

        cell = row.createCell(3);
        cell.setCellValue("Grade 2");
        cell.setCellStyle(greenHeaderStyle);

        cell = row.createCell(4);
        cell.setCellValue("Grade 3");
        cell.setCellStyle(greenHeaderStyle);

        cell = row.createCell(5);
        cell.setCellValue("Grade 4");
        cell.setCellStyle(greenHeaderStyle);

        cell = row.createCell(6);
        cell.setCellValue("Max");
        cell.setCellStyle(greenHeaderStyle);

        cell = row.createCell(7);
        cell.setCellValue("Average");
        cell.setCellStyle(greenHeaderStyle);

        // Al doilea rând - Amit
        row = sheet.createRow(1);

        row.createCell(0).setCellValue("Amit");
        row.createCell(1).setCellValue("Shukla");
        row.createCell(2).setCellValue("9");
        row.createCell(3).setCellValue("8");
        row.createCell(4).setCellValue("7");
        row.createCell(5).setCellValue("5");

        cell = row.createCell(6);
        cell.setCellValue("9");
        cell.setCellStyle(yellowStyle);

        cell = row.createCell(7);
        cell.setCellValue("7");
        cell.setCellStyle(yellowStyle);

        // Al treilea rând - Lokesh
        row = sheet.createRow(2);

        row.createCell(0).setCellValue("Lokesh");
        row.createCell(1).setCellValue("Gupta");
        row.createCell(2).setCellValue("8");
        row.createCell(3).setCellValue("9");
        row.createCell(4).setCellValue("6");
        row.createCell(5).setCellValue("7");

        cell = row.createCell(6);
        cell.setCellValue("9");
        cell.setCellStyle(yellowStyle);

        cell = row.createCell(7);
        cell.setCellValue("7.5");
        cell.setCellStyle(yellowStyle);

        // Al patrulea rând - John
        row = sheet.createRow(3);

        row.createCell(0).setCellValue("John");
        row.createCell(1).setCellValue("Adwards");
        row.createCell(2).setCellValue("8");
        row.createCell(3).setCellValue("8");
        row.createCell(4).setCellValue("7");
        row.createCell(5).setCellValue("6");

        cell = row.createCell(6);
        cell.setCellValue("8");
        cell.setCellStyle(yellowStyle);

        cell = row.createCell(7);
        cell.setCellValue("7");
        cell.setCellStyle(yellowStyle);

        // Al cincilea rând - Brian
        row = sheet.createRow(4);

        row.createCell(0).setCellValue("Brian");
        row.createCell(1).setCellValue("Schultz");
        row.createCell(2).setCellValue("7");
        row.createCell(3).setCellValue("6");
        row.createCell(4).setCellValue("8");
        row.createCell(5).setCellValue("9");

        cell = row.createCell(6);
        cell.setCellValue("9");
        cell.setCellStyle(yellowStyle);

        cell = row.createCell(7);
        cell.setCellValue("8");
        cell.setCellStyle(yellowStyle);

        // Ajustarea automată a lățimii coloanelor pentru o mai bună vizualizare
        for (int i = 0; i < 8; i++) {
            sheet.autoSizeColumn(i);
        }

        // Write the output to a file
        try (OutputStream fileOut = new FileOutputStream("workbook1.xls")) {
            wb.write(fileOut);
            System.out.println("Fișierul Excel a fost creat cu succes!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}