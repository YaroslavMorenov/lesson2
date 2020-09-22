package lesson4.task1;

public class ShapeMain {
    public static void main( String[] args ) {
        Shape[] shape = new Shape[3];
        shape[0] = new Triangle(3,2,5);
        shape[1] = new Circle(2);
        shape[2] = new Rectangle(5,10);
        for (Shape sh : shape) {
            System.out.println("Площадь фигуры: " + sh.square());
        }
    }
}
