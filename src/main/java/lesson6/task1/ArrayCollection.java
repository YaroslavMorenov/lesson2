package lesson6.task1;

import java.util.Arrays;

public class ArrayCollection<E> {
    private Object[] array = new Object[0];

    public void add(E item) {
        add(size(),item);
    }

    private void add(int index,E element) {
        Object[] result = (E[]) new Object[size() + 1];
        for(int i = 0; i < index; i++) {
            result[i] = array[i];
        }
        for(int i = index + 1; i < result.length; i++) {
            result[i] = array[i - 1];
        }
        result[index] = element;
        array = result;
    }

    public int size() {
        return array.length;
    }

    public void remove(int index) {
        Object[] del = new Object[array.length - 1];
        index = index + 1;
        for(int i = 0; i < index; i++) {
            del[i] = array[i];
        }
        for(int i = index; i < array.length; i++) {
            del[i - 1] = array[i];
        }
        array = del;
    }

    public void remove(E item) {
        int itemIndex = -1;
        for(int i = 0; i < size(); i++) {
            if(array[i].equals(item)) {
                itemIndex = i;
                break;
            }
        }
        if(itemIndex != -1) {
            remove(itemIndex);
        }
    }

    public E get(int index) {
        return (E) array[index];
    }

    public void clear() {
        array = new Object[0];
    }

    public void print() {
        System.out.println(Arrays.toString(array));
    }
}

