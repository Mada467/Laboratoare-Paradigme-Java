package Laborator8Paradigme;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Problema1 {
    public static void main(String[] args) {
        Workbook wb = new HSSFWorkbook();
        Sheet sheet = wb.createSheet("new sheet");
        Row row = sheet.createRow(0);
        row.createCell(0).setCellValue("Nr crt");
        row.createCell(1).setCellValue("Nume");
        row.createCell(2).setCellValue("Prenume");
        row.createCell(3).setCellValue("Nota1");
        row.createCell(4).setCellValue("Nota2");
        row.createCell(5).setCellValue("Nota3");
        row = sheet.createRow(1);
        row.createCell(0).setCellValue("1");
        row.createCell(1).setCellValue("Popa");
        row.createCell(2).setCellValue("Andrei");
        row.createCell(3).setCellValue("7");
        row.createCell(4).setCellValue("8");
        row.createCell(5).setCellValue("9");
        row = sheet.createRow(2);
        row.createCell(0).setCellValue("2");
        row.createCell(1).setCellValue("Vecerdea");
        row.createCell(2).setCellValue("Bianca");
        row.createCell(3).setCellValue("7");
        row.createCell(4).setCellValue("8");
        row.createCell(5).setCellValue("7");
        row = sheet.createRow(3);
        row.createCell(0).setCellValue("3");
        row.createCell(1).setCellValue("Prodan");
        row.createCell(2).setCellValue("Ana-Maria");
        row.createCell(3).setCellValue("6");
        row.createCell(4).setCellValue("9");
        row.createCell(5).setCellValue("9");
        row = sheet.createRow(4);
        row.createCell(0).setCellValue("4");
        row.createCell(1).setCellValue("Dumitrescu");
        row.createCell(2).setCellValue("Paul");
        row.createCell(3).setCellValue("9");
        row.createCell(4).setCellValue("6");
        row.createCell(5).setCellValue("6");
        row = sheet.createRow(5);
        row.createCell(0).setCellValue("5");
        row.createCell(1).setCellValue("Ionescu");
        row.createCell(2).setCellValue("Mihai");
        row.createCell(3).setCellValue("8");
        row.createCell(4).setCellValue("8");
        row.createCell(5).setCellValue("9");

// Write the output to a file
        try (OutputStream fileOut = new FileOutputStream("workbook.xls")) {
            wb.write(fileOut);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
