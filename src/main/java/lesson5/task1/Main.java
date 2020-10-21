package lesson5.task1;

import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        String path;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double first = sc.nextInt();
        System.out.println("Введите действие: ");
        String operand = sc.next();
        System.out.println("Введите второе число: ");
        double second = sc.nextInt();
        System.out.println("Введите путь DB | CONSOLE | FILE: ");
        path = sc.next();
        Calculator calculator = new Calculator(first,second,operand);
        Factory log = new Factory(path);
        log.getPath().createLog(calculator.getMessage());
    }
}
