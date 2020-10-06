package lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число ");
        int number = in.nextInt();
        int result = 0;
        while (number != 0) {
            result += (number % 10);
            number /= 10;
        }
        System.out.println(result);
    }
}
