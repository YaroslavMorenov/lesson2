package lesson8;

import lesson7.NotEnoughMoneyException;
import lesson7.UnknownAccountException;

import java.io.IOException;
import java.sql.*;

public class AccountService {
    private ResultSet resultSet;
    private Statement statement;
    private Connection connection;
    private PreparedStatement preparedStatement;

    public AccountService( ResultSet resultSet,Statement statement,Connection connection,PreparedStatement preparedStatement ) {
        this.resultSet = resultSet;
        this.statement = statement;
        this.connection = connection;
        this.preparedStatement = preparedStatement;
    }

    void withdraw( int accountId,int amount ) throws NotEnoughMoneyException, UnknownAccountException, IOException, SQLException {
        String sql = "SELECT * FROM ACCOUNTS WHERE id = ?";
        String sql2 = "UPDATE ACCOUNTS SET amount = ? WHERE id = ?";
        if (isUserExist(accountId) == false) {
            throw new UnknownAccountException("Пользователь не найден");
        } else {
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1,accountId);
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int temp = resultSet.getInt(3);
                    if (temp < amount) {
                        throw new NotEnoughMoneyException("Не хватает средств");
                    } else {
                        preparedStatement = connection.prepareStatement(sql2);
                        preparedStatement.setInt(1,(temp - amount));
                        preparedStatement.setInt(2,accountId);
                        preparedStatement.executeUpdate();
                        System.out.println("C баланса снято " + amount);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    void balance( int accountId ) throws UnknownAccountException, SQLException {
        String sql = "SELECT * FROM ACCOUNTS WHERE id = ?";
        if (isUserExist(accountId) == false) {
            throw new UnknownAccountException("Пользователь не найден");
        } else {
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1,accountId);
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    System.out.println("Счет с идентификатором №" + accountId + " имеет сумму на счете " + resultSet.getInt(3));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    void deposit( int accountId,int amount ) throws NotEnoughMoneyException, UnknownAccountException, SQLException {
        String sql = "SELECT * FROM ACCOUNTS WHERE id = ?";
        String sql2 = "UPDATE ACCOUNTS SET amount = ? WHERE id = ?";
        if (isUserExist(accountId) == false) {
            throw new UnknownAccountException("Пользователь не найден");
        } else {
            if (amount <= 0) {
                throw new NotEnoughMoneyException("Некорректная сумма");
            } else {
                try {
                    preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setInt(1,accountId);
                    resultSet = preparedStatement.executeQuery();
                    while (resultSet.next()) {
                        int temp = resultSet.getInt(3);
                        preparedStatement = connection.prepareStatement(sql2);
                        preparedStatement.setInt(1,(temp + amount));
                        preparedStatement.setInt(2,accountId);
                        preparedStatement.executeUpdate();
                        System.out.println("На счет внесено " + amount);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    void transfer( int from,int to,int amount ) throws NotEnoughMoneyException, UnknownAccountException, SQLException {
        String sql = "SELECT * FROM ACCOUNTS WHERE id = ?";
        String sql2 = "UPDATE ACCOUNTS SET amount = ? WHERE id = ?";
        if ((isUserExist(from) || isUserExist(to)) == false) {
            throw new UnknownAccountException("Пользователь не найден");
        } else {
            if (amount <= 0) {
                throw new NotEnoughMoneyException("Некорректная сумма перевода");
            } else {
                try {
                    preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setInt(1,from);
                    resultSet = preparedStatement.executeQuery();
                    while (resultSet.next()) {
                        int temp = resultSet.getInt(3);
                        if (temp < amount) {
                            throw new NotEnoughMoneyException("Недостаточно средств для перевода");
                        } else {
                            try {
                                preparedStatement = connection.prepareStatement(sql);
                                preparedStatement.setInt(1,to);
                                resultSet = preparedStatement.executeQuery();
                                while (resultSet.next()) {
                                    temp = resultSet.getInt(3);
                                    preparedStatement = connection.prepareStatement(sql2);
                                    preparedStatement.setInt(1,(temp + amount));
                                    preparedStatement.setInt(2,to);
                                    preparedStatement.executeUpdate();
                                }
                                preparedStatement = connection.prepareStatement(sql);
                                preparedStatement.setInt(1,from);
                                resultSet = preparedStatement.executeQuery();
                                while (resultSet.next()) {
                                    temp = resultSet.getInt(3);
                                    preparedStatement = connection.prepareStatement(sql2);
                                    preparedStatement.setInt(1,(temp - amount));
                                    preparedStatement.setInt(2,from);
                                    preparedStatement.executeUpdate();
                                }
                                System.out.println("На счет № " + to + " переведено: " + amount);
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    boolean isUserExist( int accountId ) throws SQLException {
        String sql = "SELECT * FROM ACCOUNTS WHERE id = ?";
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,accountId);
        resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            return true;
        } else return false;
    }
}

