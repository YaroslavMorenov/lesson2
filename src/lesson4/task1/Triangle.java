package lesson4.task1;

public class Triangle implements Shape {
    private double a, b, c;

    public Triangle( double a,double b,double c ) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double square() {
        return a + b + c;
    }
}
