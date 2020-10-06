package lesson7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main( String[] args ) throws IOException, UnknownAccountException, UnknownOperation {
        File file = new File("C:/Users/Yaroslav.Morenov/Desktop/Обучение/lesson7/money.txt");
        AccountService account = new AccountService(file);
        account.writeAccountsInFile(file);
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Какую банковскую операцию хотите произвести: ");
            String input = sc.nextLine();
            String[] arr = input.split(" ");
            switch (arr[0]) {
                case "balance":
                    account.balance(Integer.valueOf(arr[1]));
                    break;
                case "withdraw":
                    account.withdraw(Integer.valueOf(arr[1]),Integer.valueOf(arr[2]));
                    break;
                case "deposit":
                    account.deposit(Integer.valueOf(arr[1]),Integer.valueOf(arr[2]));
                    break;
                case "transfer":
                    account.transfer(Integer.valueOf(arr[1]),Integer.valueOf(arr[2]),Integer.valueOf(arr[3]));
                    break;
                default:
                    System.out.println("Неизвестная операция");
                    break;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new UnknownOperation("Неккоректный ввод операции");
        }
    }
}
