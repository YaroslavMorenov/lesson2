package lesson2;

import java.util.Scanner;

public class Task6 {
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число ");
        int number = in.nextInt();
        if (number == 0) {
            System.out.println("Нулевое число");
        }
        if (number < 0) {
            if (number % 2 == 0) {
                System.out.println("Отрицательное четное число");
            } else {
                System.out.println("Отрицательное нечетное число");
            }
        }
        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("Положительное четное число");
            } else {
                System.out.println("Положительное нечетное число");
            }
        }
    }
}

