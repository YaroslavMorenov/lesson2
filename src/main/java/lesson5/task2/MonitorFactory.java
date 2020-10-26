package lesson5.task2;

public class MonitorFactory extends ComponentsFactory {
    @Override
    public Components createComponents() {
        return new Monitor();
    }
}
