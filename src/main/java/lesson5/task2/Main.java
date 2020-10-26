package lesson5.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        //Создание через стратегии
        Strategy comp1 = new Strategy();
        comp1.setComponents(new Graph("HP","Ram1","500",TypeCoolingGraph.passive));
        comp1.createComponent();
        Strategy comp2 = new Strategy();
        comp2.setComponents(new HDD("Microsoft","300",TypeHDD.SSD,"Factor"));
        comp2.createComponent();

        //Создание через фабрику
        List<Components> components = new ArrayList<>();
        Components component = null;
        do {
            System.out.println("Введите компонент ПК который вы хотите создать или введите 0 для выхода:");
            Scanner sc = new Scanner(System.in);
            String componentType = sc.nextLine();
            switch (componentType) {
                case "CPU":
                    component = new CPUFactory().createComponents();
                    components.add(component);
                    break;
                case "Graph":
                    component = new GraphFactory().createComponents();
                    components.add(component);
                    break;
                case "HDD":
                    component = new HDDFactory().createComponents();
                    components.add(component);
                    break;
                case "Monitor":
                    component = new MonitorFactory().createComponents();
                    components.add(component);
                    break;
                case "RAM":
                    component = new RAMFactory().createComponents();
                    components.add(component);
                    break;
                default:
                    System.out.println("Компонент не найден");
                    component = null;
            }
        } while (component != null);
        PC pc = new PC(components);
        System.out.println(pc.toString());
    }
}
