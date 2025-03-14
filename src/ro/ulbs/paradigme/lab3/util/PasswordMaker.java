package ro.ulbs.paradigme.lab3.util;
import java.util.Random;
public class PasswordMaker {
    private static final int MAGIC_NUMBER = new Random().nextInt(6) + 5; // [5,10]
    private final String magicString;
    private final String name;
    private final Random random;

    public PasswordMaker(String name) {
        this.magicString = StringRandomizer.getRandomString(20);
        this.name = name;
        this.random = new Random();
    }
    public String getPassword() {
        String part1 =StringRandomizer.getRandomString(MAGIC_NUMBER);
        String part2 = getRandomSubstring(magicString, 10);
        String part3 = String.valueOf(name.length());
        String part4 = String.valueOf(random.nextInt(51)); // [0,50]

        return part1 + part2 + part3 + part4;
    }
    private String getRandomSubstring(String source, int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(source.charAt(random.nextInt(source.length())));
        }
        return sb.toString();
    }
}
