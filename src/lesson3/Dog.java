package lesson3;

public class Dog extends Animal {
    String say = "гав";

    public Dog( String food,String location ) {
        super(food,location);
    }

    @Override
    public void makeNoise( String animal ) {
        super.makeNoise(animal);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public String toString() {
        return "Dog food= " + getFood() + ", location= " + getLocation();
    }
}