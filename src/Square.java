class square extends Form {
    private float side;

    public square() {
        super();
        this.side = 0;
    }

    public square(String color, float side) {
        super(color);
        this.side = side;
    }

    @Override
    public float getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return super.toString() + ", Square with side " + side;
    }
}
