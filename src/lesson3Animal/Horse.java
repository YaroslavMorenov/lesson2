package lesson3Animal;

public class Horse extends Animal {
    private String say;

    public Horse( String food,String location,String say ) {
        super(food,location);
        this.say = say;
    }

    @Override
    public void makeNoise( String animal ) {
        super.makeNoise(animal);
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест");
    }

    @Override
    public void sleep() {

    }

    @Override
    public String toString() {
        return "Horse food= " + getFood() + ", location= " + getLocation();
    }
}