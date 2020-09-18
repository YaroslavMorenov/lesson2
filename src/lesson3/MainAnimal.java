package lesson3;

public class MainAnimal {
    public static void main( String[] args ) {
        Veterinarian veterinarian = new Veterinarian();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Мясо и кости","Улица");
        animals[1] = new Cat("Вискас и молоко","Квартира");
        animals[2] = new Horse("Сено","Ферма");

        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}