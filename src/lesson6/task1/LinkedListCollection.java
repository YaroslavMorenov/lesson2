package lesson6.task1;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCollection<E> {
    private List<E> list = new LinkedList<E>();

    public int size() {
        return list.size();
    }

    public void add( E item ) {
        list.add(item);
    }

    public void remove( int index ) {
        list.remove(index);
    }

    public void remove( E item ) {
        list.remove(item);
    }

    E get( int index ) {
        return list.get(index);
    }

    public void clear() {
        list.clear();
    }

    public void print() {
        System.out.println(list);
    }
}
