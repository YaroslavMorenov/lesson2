package lesson3Phone;

import java.util.Arrays;

public class Phone {
    protected String number;
    protected String model;
    protected double weight;

    public Phone( String number,String model,double weight ) {
        this("898771132","TestModel");
    }

    public Phone( String number,String model ) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
        this.number = "Number";
        this.model = "Model";
        this.weight = 123.12;
    }

    public void receiveCall( String nameOpponent ) {
        System.out.println("Звонит " + nameOpponent);
    }

    public void receiveCall( String nameOpponent,String number ) {
        System.out.println("Звонит " + nameOpponent + " с телефона " + number);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage( String... number ) {
        System.out.println(Arrays.toString(number));
    }
}