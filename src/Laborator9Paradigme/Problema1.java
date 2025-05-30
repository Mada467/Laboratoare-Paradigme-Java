package Laborator9Paradigme;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Problema1 {
    public static void main(String[] args) {
        // Crearea listei de 10 numere întregi aleatoare în intervalul [5..25]
        List<Integer> numereAleatoare = genereazaNumereAleatoare(10, 5, 25);

        // Afișarea listei de numere generate
        System.out.println("Lista de numere aleatoare generată:");
        System.out.println(numereAleatoare);
        System.out.println();

        // a) Calcularea sumei elementelor folosind Java Streams
        int suma = numereAleatoare.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("a) Suma elementelor din listă este: " + suma);
        System.out.println();

        // b) Calcularea valorii maxime și minime în listă
        int valoareMaxima = numereAleatoare.stream()
                .max((a, b) -> Integer.compare(a, b))
                .get();

        int valoareMinima = numereAleatoare.stream()
                .min((a, b) -> Integer.compare(a, b))
                .get();

        System.out.println("b) Valoarea maximă din listă: " + valoareMaxima);
        System.out.println("   Valoarea minimă din listă: " + valoareMinima);
        System.out.println();

        // c) Crearea unei noi liste cu elemente din intervalul [10..20]
        List<Integer> listeFiltrata = numereAleatoare.stream()
                .filter(numar -> numar >= 10 && numar <= 20)
                .collect(Collectors.toList());

        System.out.println("c) Lista cu elemente din intervalul [10..20]:");
        System.out.println(listeFiltrata);
        System.out.println();

        // d) Transformarea listei de întregi în listă de Double
        List<Double> listaDouble = numereAleatoare.stream()
                .map(numar -> (double) numar)
                .collect(Collectors.toList());

        System.out.println("d) Lista transformată în Double:");
        System.out.println(listaDouble);
        System.out.println();

        // e) Verificarea dacă în listă se găsește valoarea 12
        boolean contine12 = numereAleatoare.contains(12);

        System.out.println("e) Lista conține valoarea 12: " + contine12);
    }

    public static List<Integer> genereazaNumereAleatoare(int dimensiune, int minim, int maxim) {
        List<Integer> listaNumere = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < dimensiune; i++) {
            // Generează un număr aleator în intervalul [minim, maxim] (inclusiv)
            int numarAleator = random.nextInt(maxim - minim + 1) + minim;
            listaNumere.add(numarAleator);
        }

        return listaNumere;
    }
}