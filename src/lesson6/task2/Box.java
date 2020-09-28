package lesson6.task2;

import java.util.Arrays;

public class Box<A> {
    private Object[] box = new Object[0];

    public void add( A item ) {
        if ((box.length == 0)) {
            Object[] result = new Object[box.length + 1];
            for (int i = 0; i < box.length; i++) {
                result[i] = box[i];
            }
            result[box.length] = item;
            box = result;
            item = null;
        } else {
            if ((item instanceof Orange) & (box[0] instanceof Orange) | (item instanceof Apple) & (box[0] instanceof Apple)) {
                Object[] result = new Object[box.length + 1];
                for (int i = 0; i < box.length; i++) {
                    result[i] = box[i];
                }
                result[box.length] = item;
                box = result;
                item = null;
            } else {
                System.out.println("разные фрукты");
            }
        }
    }

    public double getWeight() {
        double temp = 0;
        if (box.length == 0) {
            temp = 0;
        } else {
            if (box[0] instanceof Orange) {
                temp = (box.length * Orange.weight);
            } else if (box[0] instanceof Apple) {
                temp = (box.length * Apple.weight);
            }
        }
        return temp;
    }

    public boolean compare( Box compareBox ) {
        return (this.getWeight() == compareBox.getWeight());
    }

    public void print() {
        System.out.println(Arrays.toString(box));
    }
}

