package lesson5.task1;

public class ConsoleLogger extends Logger implements Create {
    @Override
    public void createLog( String message ) {
        System.out.println("Log into console " + message);
    }
}
