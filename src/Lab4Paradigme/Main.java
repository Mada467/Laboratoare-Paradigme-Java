package Lab4Paradigme;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Popescu Andrei", "Grupa 1"));
        studenti.add(new Student("Ionescu Maria", "Grupa 2"));
        studenti.add(new Student("Dumitrescu Vlad", "Grupa 1"));
        studenti.add(new Student("Georgescu Ana", "Grupa 3"));
        studenti.add(new Student("Stan Mihai", "Grupa 2"));

        // b1) Sortare alfabetică pe grupe
        studenti.sort(Comparator.comparing(Student::getGrupa).thenComparing(Student::getNume));
        System.out.println("Sortare alfabetică pe grupe:");
        studenti.forEach(System.out::println);

        // b2) Sortare descrescătoare a mediilor pentru integraliști
        List<Student> integralisti = studenti.stream()
                .filter(Student::isIntegralist)
                .sorted(Comparator.comparingDouble(Student::getMedie).reversed())
                .toList();
        System.out.println("\nIntegraliști (ordine descrescătoare a mediilor):");
        integralisti.forEach(System.out::println);

        // b3) Sortare crescătoare a numărului de restanțe pentru restanțieri
        List<Student> restantieri = studenti.stream()
                .filter(s -> !s.isIntegralist())
                .sorted(Comparator.comparingInt(Student::getRestante))
                .toList();
        System.out.println("\nRestanțieri (ordine crescătoare a numărului de restanțe):");
        restantieri.forEach(System.out::println);
    }
}
