package lesson5.task1;

public class Calculator {
    public static void plus( double first,double second,Logger logger ) {
        Create create = logger.log("");
        create.createLog();
        System.out.println(" " + (first + second));
    }

    public static void minus( double first,double second,Logger logger ) {
        Create create = logger.log("");
        create.createLog();
        System.out.println(" " + (first - second));
    }

    public static void division( double first,double second,Logger logger ) {
        Create create = logger.log("");
        create.createLog();
        System.out.println(" " + (first / second));
    }

    public static void multiplication( double first,double second,Logger logger ) {
        Create create = logger.log("");
        create.createLog();
        System.out.println(" " + (first * second));
    }
}
