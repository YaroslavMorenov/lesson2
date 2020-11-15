package lesson6.task1;

public class LinkedListCollection<E> {
    NewEl<E> first;
    NewEl<E> last;
    private int size = 0;

    public void add(E element) {
        NewEl<E> l = last;
        NewEl<E> newEl = new NewEl<>(l,element,null);
        last = newEl;
        if(l == null) {
            first = newEl;
        } else {
            l.next = newEl;
        }
        size++;
    }

    public E getElement(int index) {
        NewEl<E> x = first;
        for(int i = 0; i < index; i++) {
            x = x.next;
        }
        return x.item;
    }

    public void remove(int index) {
        NewEl<E> x = first;
        for(int i = 0; i < index; i++) {
            x = x.next;
        }
        unlink(x);
    }

    public void remove(E item) {
        if(item == null) {
            for(NewEl<E> x = first; x != null; x = x.next) {
                if(x.item == null) {
                    unlink(x);
                }
            }
        } else {
            for(NewEl<E> x = first; x != null; x = x.next) {
                if(item.equals(x.item)) {
                    unlink(x);
                }
            }
        }
    }

    public int getSize() {
        return size;
    }

    public void clear() {
        last = null;
        first = null;
        size = 0;
    }

    public void print() {
        StringBuilder toPrint = new StringBuilder();
        for(int i = 0; i < size; i++) {
            toPrint.append(getElement(i).toString()).append("; ");
        }
        System.out.println("Итоговая коллекция: " + toPrint);
    }

    private void unlink(NewEl<E> e) {
        NewEl<E> next = e.next;
        NewEl<E> prev = e.prev;

        if(prev == null) {
            first = next;
        } else {
            prev.next = next;
            e.prev = null;
        }

        if(next == null) {
            last = prev;
        } else {
            next.prev = prev;
            e.next = null;
        }

        e.item = null;
        size--;
    }

    private static class NewEl<E> {
        E item;
        NewEl<E> next;
        NewEl<E> prev;

        NewEl(NewEl<E> prev,E element,NewEl<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
