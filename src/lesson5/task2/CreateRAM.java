package lesson5.task2;

public class CreateRAM implements Factory {
    @Override
    public Components createComponent() {
        return new RAM();
    }
}
