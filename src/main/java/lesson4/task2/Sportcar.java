package lesson4.task2;

public class Sportcar extends Car {

    private int drive;

    public Sportcar( String brand,String carClass,int weight,Engine engine,int drive ) {
        this.brand = brand;
        this.carClass = carClass;
        this.weight = weight;
        this.engine = engine;
        this.drive = drive;
    }

    @Override
    public void start() {
        System.out.println("Спорткар поехал");
    }

    @Override
    public void stop() {
        System.out.println("Спорткар остановился");
    }

    @Override
    public void printInfo() {
        System.out.println(brand + " " + carClass + " " + weight + " " + engine + " " + drive);
    }
}
