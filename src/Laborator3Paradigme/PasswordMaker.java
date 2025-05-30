package Laborator3Paradigme;


import java.util.Random;

public class PasswordMaker {
    private static final int MAGIC_NUMBER = 7; // valoare între 5 și 10
    private final String magicString;
    private String name;
    private StringRandomizer randomizer;
    private Random random;

    public PasswordMaker(String name) {
        this.name = name;
        this.randomizer = new StringRandomizer();
        this.random = new Random();
        // Generez magicString aleatoriu de minim 20 caractere
        this.magicString = randomizer.generateRandomString(25);
    }

    public String getPassword() {
        StringBuilder password = new StringBuilder();

        // 1. String random de lungime MAGIC_NUMBER
        String randomPart1 = randomizer.generateRandomString(MAGIC_NUMBER);
        password.append(randomPart1);

        // 2. 10 caractere random din magicString
        String randomPart2 = randomizer.generateFromString(magicString, 10);
        password.append(randomPart2);

        // 3. Lungimea numelui convertită la String
        String nameLength = String.valueOf(name.length());
        password.append(nameLength);

        // 4. Număr întreg aleatoriu din intervalul [0,50]
        int randomNumber = random.nextInt(51); // 0 inclusiv, 51 exclusiv = [0,50]
        password.append(randomNumber);

        return password.toString();
    }

    // Getter pentru a vedea magicString-ul (opțional, pentru debugging)
    public String getMagicString() {
        return magicString;
    }
}
