package lesson5.task1;

public class Calculator {
    private String message;

    public String getMessage() {
        return message;
    }

    public Calculator( double first,double second,String operand ) {
        switch (operand) {
            case "*":
                message = String.valueOf(first * second);
                break;
            case "+":
                message = String.valueOf(first + second);
                break;
            case "-":
                message = String.valueOf(first - second);
                break;
            case "/":
                message = String.valueOf(first / second);
                break;
            default:
        }
    }
}
