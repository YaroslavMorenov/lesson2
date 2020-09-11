package lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число ");
        int number = in.nextInt();
        int n1 = number % 10;
        int n2 = number %100/10;
        int n3 = number /100;
        System.out.println(n1+n2+n3);
    }
}
