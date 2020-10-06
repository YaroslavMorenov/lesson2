package lesson4.task1;

public class Rectangle implements Shape {
    private double a, b;

    public Rectangle( double a,double b ) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double square() {
        return a * b;
    }
}
