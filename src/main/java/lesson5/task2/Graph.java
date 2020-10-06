package lesson5.task2;

public class Graph implements Components {
    private String manufacturer;
    private String typeOfRam;
    private String sizeOf;
    private CoolingGraph coolingGraph;

    public Graph() {
    }

    public Graph( String manufacturer,String typeOfRam,String sizeOf,CoolingGraph coolingGraph ) {
        this.manufacturer = manufacturer;
        this.typeOfRam = typeOfRam;
        this.sizeOf = sizeOf;
        this.coolingGraph = coolingGraph;
    }

    public void setGraph( String manufacturer,String typeOfRam,String sizeOf,CoolingGraph coolingGraph ) {
        this.manufacturer = manufacturer;
        this.typeOfRam = typeOfRam;
        this.sizeOf = sizeOf;
        this.coolingGraph = coolingGraph;
    }

    @Override
    public void output() {
        System.out.println("Видеокарта");
    }
}
