package lesson6.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<E extends Fruit> {
    ArrayList<E> box = new ArrayList<>();

    public void addFruit(E element) {
        box.add(element);
    }

    public int getWeight() {
        int totalWeight = 0;
        for(E fruit : box) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public boolean compare(Box<? extends Fruit> newBoxToCompare) {
        double currentBox = this.getWeight();
        double boxToCompareWith = newBoxToCompare.getWeight();
        if(currentBox == boxToCompareWith) {
            return true;
        } else {
            return false;
        }
    }
}

