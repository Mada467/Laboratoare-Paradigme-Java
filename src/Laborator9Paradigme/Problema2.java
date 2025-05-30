package Laborator9Paradigme;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problema2 {
    public static void main(String[] args) {
        // Lista dată cu numerele: 9, 10, 3, 4, 7, 3, 4
        List<Integer> listaOriginala = Arrays.asList(9, 10, 3, 4, 7, 3, 4);

        System.out.println("Lista originală:");
        System.out.println(listaOriginala);
        System.out.println();

        // Construirea listei noi cu patratele valorilor distincte
        List<Integer> listaPatrateDistincte = listaOriginala.stream()
                .distinct()
                .map(numar -> numar * numar)
                .collect(Collectors.toList());

        System.out.println("Lista cu pătratele valorilor distincte:");
        System.out.println(listaPatrateDistincte);
    }
}