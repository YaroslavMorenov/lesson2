package lesson5.task2;

public class Strategy {
    public Components components;

    public void setComponents( Components components ) {
        this.components = components;
    }

    public void createComponent() {
        components.output();
    }
}
