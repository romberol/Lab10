package singleton;

import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnetction {
    private static DBConnetction dbconnection;
    private final Connection connection;

    @SneakyThrows
    private DBConnetction(){
        connection = DriverManager.getConnection("jdbc:sqlite:db.sqlite3");
    }

    @SneakyThrows
    public void executeQuery(String query){
        Statement stat = connection.createStatement();
        stat.executeUpdate(query);
        stat.close();
    }

    public static DBConnetction getInstance(){
        if (dbconnection == null){
            dbconnection = new DBConnetction();
        }
        return dbconnection;
    }
}
