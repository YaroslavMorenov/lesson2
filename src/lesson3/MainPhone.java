package lesson3;

public class MainPhone {
    public static void main( String[] args ) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        System.out.println(phone1.model + '\t' + phone1.number + '\t' + phone1.weight);
        phone1.receiveCall("Vasya");
        phone1.getNumber();
        phone2.receiveCall("Sasha");
        phone2.getNumber();
        phone3.receiveCall("Dima");
        phone3.getNumber();
        phone1.receiveCall("Vasya","123441");
        phone1.sendMessage("123","231","355");
    }
}