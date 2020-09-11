package lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число ");
        int number = in.nextInt();
        System.out.println((number%10));
    }
}
