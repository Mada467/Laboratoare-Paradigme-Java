package ro.ulbs.paradigme.lab2.forme;

class circle extends Form {
    private float radius;

    public circle() {
        super();
        this.radius = 0;
    }

    public circle(String color, float radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public String toString() {
        return super.toString() + ", Circle with radius " + radius;
    }
}
