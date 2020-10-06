package lesson3Animal;

public class Dog extends Animal {
    private String say;

    public Dog( String food,String location,String say ) {
        super(food,location);
        this.say = say;
    }

    @Override
    public void makeNoise( String animal ) {
        super.makeNoise(animal);
    }

    @Override
    public void eat() {
        System.out.println("Собака ест");
    }

    @Override
    public String toString() {
        return "Dog food= " + getFood() + ", location= " + getLocation();
    }
}