package lesson8;


import lesson7.UnknownAccountException;

import java.io.IOException;
import java.sql.*;
import java.util.Scanner;


public class Main {
    private static final String mainScript =
            "jdbc:h2:mem:test;INIT=RUNSCRIPT FROM './Database.sql'\\;RUNSCRIPT FROM './FactureForBase.sql'";
    private static final String SELECT = "SELECT * FROM ACCOUNTS";

    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection(mainScript);
            Statement statement = connection.createStatement();) {
            ResultSet resultSet = statement.executeQuery(SELECT);
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT);
            AccountService accountService = new AccountService(resultSet,statement,connection,preparedStatement);
            Scanner sc = new Scanner(System.in);
            {
                System.out.println("Какую банковскую операцию хотите произвести: ");
                String input = sc.nextLine();
                String[] arr = input.split(" ");
                try {
                    switch(arr[0]) {
                        case "balance":
                            accountService.balance(Integer.valueOf(arr[1]));
                            break;
                        case "withdraw":
                            accountService.withdraw(Integer.valueOf(arr[1]),Integer.valueOf(arr[2]));
                            break;
                        case "deposit":
                            accountService.deposit(Integer.valueOf(arr[1]),Integer.valueOf(arr[2]));
                            break;
                        case "transfer":
                            accountService.transfer(Integer.valueOf(arr[1]),Integer.valueOf(arr[2]),Integer.valueOf(arr[3]));
                            break;
                        default:
                            System.out.println("Неизвестная операция");
                            break;
                    }
                } catch(UnknownAccountException e) {
                    e.printStackTrace();
                } catch(IOException e) {
                    e.printStackTrace();
                } catch(SQLException e) {
                    e.printStackTrace();
                }
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
