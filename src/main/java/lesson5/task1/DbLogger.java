package lesson5.task1;

public class DbLogger extends Logger implements Create {
    @Override
    public void createLog( String message ) {
        System.out.println("Log into database: " + message);
    }
}
