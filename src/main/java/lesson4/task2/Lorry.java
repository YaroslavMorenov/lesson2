package lesson4.task2;

public class Lorry extends Car {
    private String brand;
    private String carClass;
    private double weight;
    private String engine;

    public Lorry( String brand,String carClass,double weight,String engine ) {
        this.brand = brand;
        this.carClass = carClass;
        this.weight = weight;
        this.engine = engine;
    }

    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void printInfo() {
        System.out.println(brand + " " + carClass + " " + weight + " " + engine);
    }
}
