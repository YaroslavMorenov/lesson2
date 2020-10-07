package lesson4.task2;

public abstract class Car {
    protected String brand;
    protected String carClass;
    protected double weight;
    protected Engine engine;

    public abstract void start();

    public abstract void stop();

    public void turnRight() {
        System.out.println("Поворот на право");
    }

    public void turnLeft() {
        System.out.println("Поворот на лево");
    }

    public abstract void printInfo();
}

