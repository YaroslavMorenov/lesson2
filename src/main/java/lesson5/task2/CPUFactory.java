package lesson5.task2;

public class CPUFactory extends ComponentsFactory {

    @Override
    public Components createComponents() {
        return new CPU();
    }
}
