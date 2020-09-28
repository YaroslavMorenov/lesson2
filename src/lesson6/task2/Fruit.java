package lesson6.task2;

import java.util.Arrays;

public class Fruit<A> {
    private A nameFruit;
    private Object[] fruit = new Object[0];

        @Override
        public String toString() {
                return "Fruit{" +
                        "nameFruit=" + nameFruit +
                        ", fruit=" + Arrays.toString(fruit) +
                        '}';
        }
}
