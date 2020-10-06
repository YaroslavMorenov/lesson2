package lesson3Animal;

public class MainAnimal {
    public static void main( String[] args ) {
        Veterinarian veterinarian = new Veterinarian();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Мясо и кости","Улица","гав");
        animals[1] = new Cat("Вискас и молоко","Квартира","Мяу");
        animals[2] = new Horse("Сено","Ферма","игого");

        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}