package lesson5.task1;

public class DbLogger extends Logger {
    @Override
    public Create log( String message ) {
        return new Db();
    }
}
