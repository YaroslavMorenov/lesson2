package lesson5.task1;

public class FileLogger extends Logger implements Create {
    @Override
    public void createLog( String message ) {
        System.out.println("Log into file: " + message);
    }
}
