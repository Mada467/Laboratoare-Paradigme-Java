package ro.ulbs.paradigme.lab2.forme;

public class Form {
    private final String color;
    private static int counter = 0;

    public Form() {
        this.color = "white";
        counter++;
    }

    public Form(String color) {
        this.color = color;
        counter++;
    }

    public float getArea() {
        return 0;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "This form has the color " + color;
    }
}

