package lesson5.task2;

public class CPU implements Components {
    private int clockFrequency;
    private int countCore;
    private int cacheMemory;
    private String name;
    private String manufacturer;

    public CPU() {
    }

    public CPU( int clockFrequency,int countCore,int cacheMemory,String name,String manufacturer ) {
        this.clockFrequency = clockFrequency;
        this.countCore = countCore;
        this.cacheMemory = cacheMemory;
        this.name = name;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "clockFrequency=" + clockFrequency +
                ", countCore=" + countCore +
                ", cacheMemory=" + cacheMemory +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    @Override
    public void output() {
        System.out.println(toString());
    }
}
