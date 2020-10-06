package lesson5.task2;

public class CreateCPU implements Factory {

    @Override
    public Components createComponent() {
        return new CPU();
    }
}
