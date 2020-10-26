package lesson5.task2;

import java.util.List;

public class PC {
    private List<Components> components;

    public PC( List<Components> components ) {
        this.components = components;
    }

    @Override
    public String toString() {
        return "PC{" +
                "components=" + components +
                '}';
    }
}


