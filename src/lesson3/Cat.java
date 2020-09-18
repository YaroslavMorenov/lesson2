package lesson3;

public class Cat extends Animal {
    String say = "мяу";

    public Cat( String food,String location ) {
        super(food,location);
    }

    public String getSay() {
        return say;
    }

    public void setSay( String say ) {
        this.say = say;
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
        return "Cat food= " + getFood() + ", location= " + getLocation();
    }
}