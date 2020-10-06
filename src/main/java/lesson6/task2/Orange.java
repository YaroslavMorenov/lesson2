package lesson6.task2;

import java.util.Arrays;

public class Orange<A> extends Fruit {
    protected static float weight = 1.5f;
    protected A nameFruit;

    public Orange( A nameFruit ) {
    }

    private Object[] box = new Object[0];

    @Override
    public String toString() {
        return "Orange{" +
                "nameFruit=" + nameFruit +
                ", box=" + Arrays.toString(box) +
                '}';
    }
}
