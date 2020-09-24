package lesson5.task2;

public class CreateGraph implements Factory {
    @Override
    public Components createComponent() {
        return new Graph();
    }
}
