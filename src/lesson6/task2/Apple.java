package lesson6.task2;

import java.util.Arrays;

public class Apple<A> extends Fruit {
    protected static float weight = 1.0f;
    protected A nameFruit;

    public Apple( A nameFruit ) {
    }

    private Object[] box = new Object[0];

    @Override
    public String toString() {
        return "Apple{" +
                "nameFruit=" + nameFruit +
                ", box=" + Arrays.toString(box) +
                '}';
    }
}
