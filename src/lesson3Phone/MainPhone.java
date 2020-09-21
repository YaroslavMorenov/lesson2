package lesson3Phone;

public class MainPhone {
    public static void main( String[] args ) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        System.out.println(phone1.model + '\t' + phone1.number + '\t' + phone1.weight);
        Phone[] phones = new Phone[3];
        phones[0] = new Phone();
        phones[1] = new Phone();
        phones[2] = new Phone();
        for (Phone forPhones : phones) {
            forPhones.receiveCall("VasyaNEW");
            forPhones.getNumber();
            forPhones.sendMessage("123","231","355");
        }
    }
}