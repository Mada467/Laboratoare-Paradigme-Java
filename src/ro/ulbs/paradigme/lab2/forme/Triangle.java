package ro.ulbs.paradigme.lab2.forme;

class triangle extends Form {
    private float height, base;

    public triangle() {
        super();
        this.height = 0;
        this.base = 0;
    }

    public triangle(String color, float height, float base) {
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public float getArea() {

        float v = (1 / 2 )* base * height;
        return v;
    }

    @Override
    public String toString() {
        return super.toString() + ", Triangle with base " + base + " and height " + height;
    }
    public  boolean equals()
    {
        return false;
    }

}
