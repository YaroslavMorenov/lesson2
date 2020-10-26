package lesson5.task2;

public class HDD implements Components {
    private String manufacturer;
    private String sizeOfHDD;
    private TypeHDD typeHDD;
    private String formFactor;

    public HDD() {
    }

    public HDD( String manufacturer,String sizeOf,TypeHDD typeHDD,String formFactor ) {
        this.manufacturer = manufacturer;
        this.sizeOfHDD = sizeOf;
        this.typeHDD = typeHDD;
        this.formFactor = formFactor;
    }

    public void setHDD( String manufacturer,String sizeOf,TypeHDD typeHDD,String formFactor ) {
        this.manufacturer = manufacturer;
        this.sizeOfHDD = sizeOf;
        this.typeHDD = typeHDD;
        this.formFactor = formFactor;
    }

    @Override
    public String toString() {
        return "HDD{" +
                "manufacturer='" + manufacturer + '\'' +
                ", sizeOf='" + sizeOfHDD + '\'' +
                ", typeHDD=" + typeHDD +
                ", formFactor='" + formFactor + '\'' +
                '}';
    }

    @Override
    public void output() {
        System.out.println(toString());
    }
}
