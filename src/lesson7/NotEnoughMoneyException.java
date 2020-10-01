package lesson7;

public class NotEnoughMoneyException extends RuntimeException {

    public NotEnoughMoneyException( String message ) {
        super(message);
    }
}
