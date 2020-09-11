package lesson2;

import java.util.Scanner;

public class Task5 {
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int first = in.nextInt();
        System.out.println("Введите второе число ");
        int second = in.nextInt();
        System.out.println("Введите третье число ");
        int third = in.nextInt();
        if (first < second && first < third) {
            System.out.println(first);
        } else if (second < first && second < third) {
            System.out.println(second);
        } else {
            System.out.println(third);
        }
    }

}
