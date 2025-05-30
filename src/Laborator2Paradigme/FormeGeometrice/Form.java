package Laborator2Paradigme.FormeGeometrice;



// a) Clasa Form - clasa de bază
public class Form {
    private String color;

    public Form() {
        this.color = "white";
    }

    public Form(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public float getArea() {
        return 0;
    }

    // Metodă toString()
    public String toString() {
        return "This form has the color " + color;
    }
}