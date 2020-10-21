package lesson5.task1;

public class Factory {
    private String path;

    public Factory( String path ) {
        this.path = path;
    }

    public Logger getPath() {
        EnumLog type = EnumLog.valueOf(path);
        switch (type) {
            case DB:
                return new DbLogger();
            case FILE:
                return new FileLogger();
            case CONSOLE:
                return new ConsoleLogger();
            default:
                return null;
        }
    }
}
