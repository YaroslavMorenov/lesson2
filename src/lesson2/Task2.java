package lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число ");
        int number = in.nextInt();
        int result = 0;
        String numbers = Integer.toString(number);
        for (int i = 0; i < numbers.length(); i++) {
            result += Integer.parseInt(String.valueOf(numbers.charAt(i)));
        }
        System.out.println(result);
    }
}
