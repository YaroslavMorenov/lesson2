package lesson5.task1;

import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double first = sc.nextInt();
        System.out.println("Введите действие: ");
        String operand = sc.next();
        System.out.println("Введите второе число: ");
        double second = sc.nextInt();
        try {
            System.out.println("Введите путь DB | CONSOLE | FILE: ");
            EnumLog log = null;
            try {
                log = EnumLog.valueOf(sc.next());
            } catch (Exception e) {
                System.out.println("Не возможно сохранить " + e);
            }
            Logger logger = null;
            switch (log) {
                case DB:
                    logger = new DbLogger();
                    break;
                case FILE:
                    logger = new FileLogger();
                    break;
                case CONSOLE:
                    logger = new ConsoleLogger();
                    break;
                default:
            }
            switch (operand) {
                case "*":
                    Calculator.multiplication(first,second,logger);
                    break;
                case "+":
                    Calculator.plus(first,second,logger);

                    break;
                case "-":
                    Calculator.minus(first,second,logger);

                    break;
                case "/":
                    Calculator.division(first,second,logger);

                    break;
                default:
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
