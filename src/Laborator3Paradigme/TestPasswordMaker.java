package Laborator3Paradigme;


public class TestPasswordMaker {
    public static void main(String[] args) {
        // Testez cu diferite nume
        String[] names = {"John", "Maria", "Alexandru", "Ana"};

        for (String name : names) {
            PasswordMaker pm = new PasswordMaker(name);
            String password = pm.getPassword();

            System.out.println("Nume: " + name);
            System.out.println("Parola generata: " + password);
            System.out.println("MagicString: " + pm.getMagicString());
            System.out.println("------------------------");
        }

        // Test cu același nume pentru a vedea că se generează parole diferite
        System.out.println("Test cu același nume (John) - parole diferite:");
        for (int i = 0; i < 3; i++) {
            PasswordMaker pm = new PasswordMaker("John");
            System.out.println("Parola " + (i+1) + ": " + pm.getPassword());
        }
    }
}
