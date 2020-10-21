package lesson5.task2;

public class Graph extends ComponentsFactory implements Components {
    private String manufacturer;
    private String typeOfRam;
    private String sizeOf;
    private TypeCoolingGraph typeCoolingGraph;

    public Graph() {
    }

    public Graph( String manufacturer,String typeOfRam,String sizeOf,TypeCoolingGraph typeCoolingGraph ) {
        this.manufacturer = manufacturer;
        this.typeOfRam = typeOfRam;
        this.sizeOf = sizeOf;
        this.typeCoolingGraph = typeCoolingGraph;
    }


    @Override
    public String toString() {
        return "Graph{" +
                "manufacturer='" + manufacturer + '\'' +
                ", typeOfRam='" + typeOfRam + '\'' +
                ", sizeOf='" + sizeOf + '\'' +
                ", typeCoolingGraph=" + typeCoolingGraph +
                '}';
    }

    @Override
    public void output() {
        System.out.println(toString());
    }
}
