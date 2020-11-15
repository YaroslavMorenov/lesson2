package lesson6.task1;

public class Main {
    public static void main(String[] args) {
        ArrayCollection<String> arrayCollection = new ArrayCollection();
        arrayCollection.add("1");
        arrayCollection.add("2");
        arrayCollection.add("3");
        arrayCollection.add("4");
        arrayCollection.add("5");
        arrayCollection.add("6");
        arrayCollection.add("7");
        arrayCollection.print();
        System.out.println(arrayCollection.size());
        arrayCollection.remove(0);
        arrayCollection.print();
        arrayCollection.remove("3");
        arrayCollection.print();
        System.out.println(arrayCollection.get(1));
        arrayCollection.clear();
        arrayCollection.print();


        LinkedListCollection<String> list = new LinkedListCollection<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.print();
        System.out.println(list.getSize());
        list.remove(0);
        list.print();
        list.remove("4");
        list.print();
        System.out.println(list.getElement(1));
        list.clear();
        list.print();
    }
}
