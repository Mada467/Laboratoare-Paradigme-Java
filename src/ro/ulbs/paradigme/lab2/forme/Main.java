package ro.ulbs.paradigme.lab2.forme;

public class Main {
    public static void main(String[] args) {
        Form defaultForm = new Form();
        Form redForm = new Form("red");
        Triangle triangle = new Triangle("blue", 5, 10);
        Circle circle = new Circle("green", 7);
        Square square = new Square("yellow", 4);

          System.out.println(defaultForm);
        System.out.println("Area: " + defaultForm.getArea());

        System.out.println(redForm);
        System.out.println("Area: " + redForm.getArea());

        System.out.println(triangle);
        System.out.println("Area: " + triangle.getArea());

        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());

        System.out.println(square);
        System.out.println("Area: " + square.getArea());
    }
}


