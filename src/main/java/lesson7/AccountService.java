package lesson7;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class AccountService {
    ArrayList<Account> accounts = new ArrayList<>();
    public File file;

    public void writeAccountsInFile( File filePath ) throws IOException {
        FileWriter fw = null;
        if (filePath.length() == 0) {
            String str = "0|Ярослав|100\n" +
                    "1|Саня|200\n" +
                    "2|Дмитрий|300\n" +
                    "3|Владимир|400\n" +
                    "4|Александр|500\n" +
                    "5|Лейсан|600\n" +
                    "6|Евгений|700\n" +
                    "7|Путин|123123\n" +
                    "8|Вася|9812\n" +
                    "9|Петр|10000";
            try {
                Files.createFile(Paths.get(String.valueOf(filePath)));
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fw = new FileWriter(filePath);
                fw.write(str);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String str;
        while ((str = reader.readLine()) != (null)) {
            String[] arr = str.split("\\|");
            Account temp = new Account(Integer.valueOf(arr[0]),arr[1],Integer.valueOf(arr[2]));
            accounts.add(temp);
        }
        reader.close();
    }

    void withdraw( int accountId,int amount ) throws NotEnoughMoneyException, UnknownAccountException, IOException {
        if (accountId > accounts.size()) {
            throw new UnknownAccountException("Неизвестный пользователь");
        } else {
            if (accounts.get(accountId).amount - amount < 0) {
                throw new NotEnoughMoneyException("На счете не достаточно средств для операции");
            } else {
                accounts.get(accountId).amount = accounts.get(accountId).amount - amount;
                writeInFile();
            }
        }
    }

    public void writeInFile() throws IOException {
        FileWriter fw = null;
        try {
            fw = new FileWriter(file,false);
            for (int i = 0; i < accounts.size(); i++) {
                fw.write(accounts.get(i).toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    void balance( int accountId ) throws UnknownAccountException {
        if (accountId > accounts.size()) {
            throw new UnknownAccountException("Неизвестный пользователь");
        } else {
            System.out.println("Счет с идентификатором №" + accounts.get(accountId).id + " имеет сумму на счете " +
                    accounts.get(accountId).amount);
        }
    }

    void deposit( int accountId,int amount ) throws NotEnoughMoneyException, UnknownAccountException, IOException {
        if (accountId > accounts.size()) {
            throw new UnknownAccountException("Пользователь не найден");
        } else {
            if (amount <= 0) {
                throw new NotEnoughMoneyException("Некорректная сумма ввода");
            } else {
                accounts.get(accountId).amount = accounts.get(accountId).amount + amount;
                writeInFile();
            }
        }
    }

    void transfer( int from,int to,int amount ) throws NotEnoughMoneyException, UnknownAccountException, IOException {
        if (from > accounts.size() || to > accounts.size()) {
            throw new UnknownAccountException("Пользователь не найден");
        } else {
            if (amount <= 0) {
                throw new NotEnoughMoneyException("Некорректная сумма перевода");
            } else if (accounts.get(from).amount - amount < 0) {
                throw new NotEnoughMoneyException("Недостаточно средств");
            } else {
                accounts.get(from).amount = accounts.get(from).amount - amount;
                accounts.get(to).amount = accounts.get(to).amount + amount;
                writeInFile();
            }
        }
    }

    public AccountService( File file ) {
        this.file = file;
    }
}
