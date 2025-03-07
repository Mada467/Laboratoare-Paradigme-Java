public class Main {
    public static void main(String[] args) {
        Form defaultForm = new Form();
        Form redForm = new Form("red");
        triangle triangle = new triangle("blue", 5, 10);
        circle circle = new circle("green", 7);
        square square = new square("yellow", 4);

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


