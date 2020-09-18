package lesson3;

import java.util.Arrays;

public class Phone {
    String number;
    String model;
    double weight;

    public Phone( String number,String model,double weight ) {
        this("877111","test");
    }

    public Phone( String number,String model ) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
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