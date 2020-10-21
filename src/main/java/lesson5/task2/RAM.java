package lesson5.task2;

public class RAM extends ComponentsFactory implements Components {
    private String manufacturer;
    private int memorySize;
    private int frequency;
    private String typeOfRam;
    private int sizeOfRam;

    public RAM() {
    }

    public RAM( String manufacturer,int memorySize,int frequency,String typeOfRam,int sizeOfRam ) {
        this.manufacturer = manufacturer;
        this.memorySize = memorySize;
        this.frequency = frequency;
        this.typeOfRam = typeOfRam;
        this.sizeOfRam = sizeOfRam;

    }

    @Override
    public String toString() {
        return "RAM{" +
                "manufacturer='" + manufacturer + '\'' +
                ", memorySize=" + memorySize +
                ", frequency=" + frequency +
                ", typeOfRam='" + typeOfRam + '\'' +
                ", sizeOfRam=" + sizeOfRam +
                '}';
    }

    @Override
    public void output() {
        System.out.println(toString());
    }
}
