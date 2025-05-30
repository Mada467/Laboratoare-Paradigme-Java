package Laborator2Paradigme.FormeGeometrice;



// b) Clasa Triangle - moștenește din Form
public class Triangle extends Form {
    private float height;
    private float base;

    public Triangle() {
        super();
        this.height = 0;
        this.base = 0;
    }

    public Triangle(float height, float base, String color) {
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public float getArea() {
        return (height * base) / 2;
    }

    @Override
    public String toString() {
        return super.toString() + " and is a triangle with height=" + height + " and base=" + base;
    }

    public boolean equals(Triangle other) {
        // Verifică dacă au aceeași înălțime, bază și culoare
        return this.height == other.height &&
                this.base == other.base &&
                this.getColor().equals(other.getColor());
    }
}
