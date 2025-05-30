package Laborator9Paradigme;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problema3 {
    public static void main(String[] args) {
        // Textul dat
        String text = "Acesta este un program scris cu java 8 si expresii lambda";

        // Transformarea textului în listă de cuvinte
        List<String> cuvinte = Arrays.asList(text.split(" "));

        System.out.println("Lista de cuvinte originală:");
        System.out.println(cuvinte);
        System.out.println();

        // a) Filtrarea cuvintelor cu lungimea >= 5 caractere
        List<String> cuvinteLungi = cuvinte.stream()
                .filter(cuvant -> cuvant.length() >= 5)
                .collect(Collectors.toList());

        System.out.println("a) Cuvinte cu lungimea >= 5 caractere:");
        System.out.println(cuvinteLungi);
        System.out.println();

        // b) Ordonarea listei noi
        List<String> cuvinteLungiOrdonate = cuvinteLungi.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("b) Lista ordonată:");
        System.out.println(cuvinteLungiOrdonate);
        System.out.println();

        // c) Găsirea unui element care începe cu 'p'
        String cuvantCuP = cuvinte.stream()
                .filter(cuvant -> cuvant.startsWith("p"))
                .findFirst()
                .orElse("Nu s-a găsit");

        System.out.println("c) Cuvânt care începe cu 'p': " + cuvantCuP);
    }
}
