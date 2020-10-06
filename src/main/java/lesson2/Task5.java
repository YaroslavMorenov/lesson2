package lesson2;
import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main( String[] args ) {
        int[] numbers;
        numbers = new int[3];
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= numbers.length; i++) {
            System.out.println("Введите " + i + "-е число");
            numbers[i - 1] = in.nextInt();
        }
        int minNumber = numbers[0];
        for (int n = 0; n < numbers.length; n++) {
            if (minNumber > numbers[n]) {
                minNumber = numbers[n];
            }
        }
        System.out.println(minNumber);
    }
}
