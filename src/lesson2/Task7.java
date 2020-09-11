package lesson2;

import java.util.Scanner;

public class Task7 {
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите код города ");
        int number = in.nextInt();
        double moscow = 4.15;
        double rostov = 1.98;
        double krasnodar = 2.69;
        float kirov = 5.00f;
        switch (number) {
            case 905:
                System.out.println("Стоимость разговора:" + moscow * 10);
                break;
            case 194:
                System.out.println("Стоимость разговора:" + rostov * 10);
                break;
            case 491:
                System.out.println("Стоимость разговора:" + krasnodar * 10);
                break;
            case 800:
                System.out.println("Стоимость разговора:" + kirov * 10);
                break;
            default:
                System.out.println("Город не найден");
        }
    }
}
