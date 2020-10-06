package lesson6.task2;

public class Main {
    public static void main( String[] args ) {
        Box box = new Box<>();
        Apple<String> apple1 = new Apple<>("Зеленое");
        Apple<String> apple2 = new Apple<>("Красное");
        Orange<String> orange1 = new Orange<>("Зеленое");
        Orange<String> orange2 = new Orange<>("Красный");
        box.add(apple1);
        box.add(apple2);
        box.add(orange1);

        Box box2 = new Box<>();
        box2.add(orange1);
        box2.add(orange2);

        box.print();
        box2.print();

        System.out.println("Вес коробки " + box.getWeight());
        System.out.println("Вес коробки " + box2.getWeight());

        System.out.println(box.compare(box2));

        box.print();
        box2.print();
    }
}
