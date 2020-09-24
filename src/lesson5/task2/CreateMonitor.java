package lesson5.task2;

public class CreateMonitor implements Factory {

    @Override
    public Components createComponent() {
        return new Monitor();
    }
}
