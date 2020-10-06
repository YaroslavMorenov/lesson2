package lesson2;

import java.util.Scanner;

public class Task6 {
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число ");
        int number = in.nextInt();
        if (number == 0) {
            System.out.println("Нулевое число");
        } else {
            StringBuilder result = new StringBuilder();
            if (number > 0) {
                result.append("Положительное");
            } else {
                result.append("Отрицательное");
            }
            if (number % 2 == 0) {
                result.append(" четное");
            } else {
                result.append(" нечетное");
            }
            result.append(" число");
            System.out.println(result.toString());
        }
    }
}

