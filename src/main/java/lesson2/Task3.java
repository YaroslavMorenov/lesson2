package lesson2;

import java.util.Scanner;

public class Task3 {
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число ");
        int number = in.nextInt();
        if (number < 0) {
            number++;
        }
        System.out.println(number);
    }
}
