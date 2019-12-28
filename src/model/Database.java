package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

    private final static String DB_PATH = "studentmanager.db";
    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public Database() {
        final String url = "jdbc:sqlite" + DB_PATH;
        try{
            connection = DriverManager.getConnection(url);

        }catch (Exception e){

        }

    }

}
