package lesson5.task2;

public class GraphFactory extends ComponentsFactory {
    @Override
    public Components createComponents() {
        return new Graph();
    }
}
