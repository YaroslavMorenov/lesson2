package lesson5.task2;

public class CreateHDD implements Factory {

    @Override
    public Components createComponent() {
        return new HDD();
    }
}
