package lesson4.task2;

public class Main {
    public static void main( String[] args ) {
        Engine engine = new Engine(200,"VAZ");
        Car gruz = new Lorry("Маз","Грузовик",2000,engine);
        gruz.start();
        gruz.printInfo();
        gruz.stop();
        Engine engine1 = new Engine(900,"VAG");
        Car sport = new Sportcar("Porche","Sport",1500,engine1,5);
        sport.printInfo();
        sport.start();
        sport.stop();
    }
}
