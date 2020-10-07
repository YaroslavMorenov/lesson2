package lesson4.task2;

public class Lorry extends Car {

    public Lorry( String brand,String carClass,int weight,Engine engine ) {
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
