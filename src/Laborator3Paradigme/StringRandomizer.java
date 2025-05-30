package Laborator3Paradigme;

import java.util.Random;

public class StringRandomizer {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private Random random;

    public StringRandomizer() {
        this.random = new Random();
    }

    /**
     * Genereaza un string aleatoriu de lungimea specificata
     */
    public String generateRandomString(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(index));
        }
        return sb.toString();
    }

    /**
     * Genereaza un string aleatoriu din caracterele unui string dat
     */
    public String generateFromString(String source, int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(source.length());
            sb.append(source.charAt(index));
        }
        return sb.toString();
    }
}
