package lesson6.task1;

import java.util.Arrays;

public class ArrayCollection<E> {
    private Object[] array = new Object[0];

    public int size() {
        return array.length;
    }

    public void add( E item ) {
        Object[] add = new Object[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            add[i] = array[i];
        }
        add[array.length] = item;
        array = add;
    }

    public void remove( int index ) {
        Object[] del = new Object[array.length - 1];
        index = index + 1;
        for (int i = 0; i < index; i++) {
            del[i] = array[i];
        }
        for (int i = index; i < array.length; i++) {
            del[i - 1] = array[i];
        }
        array = del;
    }

    public void remove( E item ) {
        for (int i = 0; i < array.length; i++) {
            if (item == array[i]) {
                array[i] = null;
            }
        }
    }

    public E get( int index ) {
        return (E) array[index];
    }

    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }

    public void print() {
        System.out.println(Arrays.toString(array));
    }
}

