package lesson3Animal;

public class Cat extends Animal {
    private String say;

    public Cat( String food,String location,String say ) {
        super(food,location);
        this.say = say;
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
        System.out.println("Кошка ест");
    }

    @Override
    public String toString() {
        return "Cat food= " + getFood() + ", location= " + getLocation();
    }
}