package lesson5.task2;

public class HDD implements Components {
    private String manufacturer;
    private String sizeOf;
    private TypeHDD typeHDD;
    private String formFactor;

    public HDD() {
    }

    public HDD( String manufacturer,String sizeOf,TypeHDD typeHDD,String formFactor ) {
        this.manufacturer = manufacturer;
        this.sizeOf = sizeOf;
        this.typeHDD = typeHDD;
        this.formFactor = formFactor;
    }

    public void setHDD( String manufacturer,String sizeOf,TypeHDD typeHDD,String formFactor ) {
        this.manufacturer = manufacturer;
        this.sizeOf = sizeOf;
        this.typeHDD = typeHDD;
        this.formFactor = formFactor;
    }

    @Override
    public void output() {
        System.out.println("Накопитель");
    }
}
