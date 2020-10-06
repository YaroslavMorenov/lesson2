package lesson4.task1;

public class Circle implements Shape {
    private double r;

    public Circle( double r ) {
        this.r = r;
    }

    @Override
    public double square() {
        return Math.PI * Math.pow(r,2);
    }
}
