package lesson5.task2;

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
        System.out.println("Введите компонет ПК который вы хотите создать:");
        Scanner sc = new Scanner(System.in);
        String component = sc.nextLine();
        PCFactory pcFactory = new PCFactory(component);
        if (pcFactory != null) {
            pcFactory.getComponent().output();
        } else {
            System.out.println("Компонент не найден");
        }
    }
}
