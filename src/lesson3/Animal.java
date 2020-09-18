package lesson3;

public class Animal {
    String food;
    String location;

    public Animal( String food,String location ) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise( String animal ) {
        System.out.println(animal + " спит");
    }

    public void eat() {

    }

    public void sleep() {

    }

    public String getFood() {
        return food;
    }

    public void setFood( String food ) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation( String location ) {
        this.location = location;
    }
}