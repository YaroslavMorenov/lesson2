package lesson5.task2;

public class RAMFactory extends ComponentsFactory {
    @Override
    public Components createComponents() {
        return new RAM();
    }
}
