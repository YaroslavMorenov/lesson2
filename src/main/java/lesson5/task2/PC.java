package lesson5.task2;

import java.util.Scanner;

public class PC {
    public static void main( String[] args ) {
        Strategy comp1 = new Strategy();
        comp1.setComponents(new Graph("HP","Ram1","500",CoolingGraph.passive));
        comp1.createComponent();
        comp1.setComponents(new HDD("Microsoft","300",TypeHDD.SSD,"Factor"));
        comp1.createComponent();

        System.out.println("Введите компонет ПК который вы хотите создать:");
        Scanner sc = new Scanner(System.in);
        String component = sc.nextLine();
        Factory create = null;
        switch (component) {
            case "CPU":
                create = new CreateCPU();
                break;
            case "RAM":
                create = new CreateRAM();
                break;
            case "GC":
                create = new CreateGraph();
                break;
            case "HDD":
                create = new CreateHDD();
                break;
            case "Monitor":
                create = new CreateMonitor();
                break;
            default:
                System.out.println("Компонент не найден");
        }
        if (create != null) {
            Components message = create.createComponent();
            message.output();
        }
    }
}
