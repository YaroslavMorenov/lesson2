package lesson3;

public class Horse extends Animal {
    String say = "иго-го";

    public Horse( String food,String location ) {
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
        return "Horse food= " + getFood() + ", location= " + getLocation();
    }
}