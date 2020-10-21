package lesson5.task2;

public class PCFactory {
    private String component;

    public PCFactory( String component ) {
        this.component = component;
    }

    public ComponentsFactory getComponent() {
        switch (component) {
            case "CPU":
                return new CPU();
            case "RAM":
                return new RAM();
            case "GC":
                return new Graph();
            case "HDD":
                return new HDD();
            case "Monitor":
                return new Monitor();
            default:
                return null;
        }


    }
}
