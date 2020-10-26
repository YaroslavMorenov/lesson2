package lesson5.task2;

public class HDDFactory extends ComponentsFactory {
    @Override
    public Components createComponents() {
        return new HDD();
    }
}
