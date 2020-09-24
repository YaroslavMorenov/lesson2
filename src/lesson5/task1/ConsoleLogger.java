package lesson5.task1;

public class ConsoleLogger extends Logger {

    @Override
    public Create log( String message ) {
        return new Console();
    }
}
