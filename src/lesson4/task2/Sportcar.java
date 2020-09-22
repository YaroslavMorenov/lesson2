package lesson4.task2;

public class Sportcar extends Car {
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
        System.out.println(brand + " " + carClass + " " + weight + " " + engine);
    }
}
