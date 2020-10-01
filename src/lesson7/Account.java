package lesson7;

public class Account {
    public int id;
    public String holder;
    public int amount;

    public Account( int id,String holder,int amount ) {
        this.id = id;
        this.holder = holder;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return (id + "|" + holder + "|" + amount);
    }
}
