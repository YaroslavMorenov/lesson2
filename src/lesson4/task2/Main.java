package lesson4.task2;

public class Main {
    public static void main( String[] args ) {
        Engine engine = new Engine();
        engine.setManufacturer("Двигатель");
        engine.setPower(100);
        Car gruz = new Lorry("Маз","Грузовик",2000,"Мощный");
        gruz.start();
        gruz.printInfo();
        gruz.stop();
        Car sport = new Sportcar();
        sport.printInfo();
        sport.start();
        sport.stop();
    }
}
