package oracle.se.part2.jdbc;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConnectionExample {

    static String mySqlConnectionString = "jdbc:mysql://localhost:3306/testone";
    static String derbyFileConnectionString = "jdbc:derby:db/derby/DatabaseDemo;create=true";
    static String derbyMemoryConnectionString = "jdbc:derby:memory:DatabaseDemo;create=true";
    static String sqliteConnectionString = "jdbc:sqlite:db\\sqlite\\DatabaseDemo.db";

    public static void main(String[] args) throws SQLException {
        try (Connection connection = getConnection(derbyFileConnectionString)) {
            createTable(connection);
            dropTable(connection);
        }
        System.out.println("Success");
    }

    public static Connection getConnection(String connectionString) throws SQLException {
        Connection c;
        try {
            Class.forName("org.apache.derby.iapi.jdbc.InternalDriver");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (connectionString.indexOf("mysql") > -1) {
            String username = "newuser";
            String password = "new_user_2020";
            Properties properties = new Properties();
            properties.setProperty("user", username);
            properties.setProperty("password", password);
            c = DriverManager.getConnection(connectionString, properties);
            c = DriverManager.getConnection(connectionString, username, password);
        } else {
            if (connectionString.indexOf("sqlite") > -1) {
                Path p = Paths.get(connectionString.split(":")[2]);
                try {
                    Files.createDirectories(p.getParent());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            c = DriverManager.getConnection(connectionString);
        }
        return c;
    }

    public static void createTable(Connection connection) throws SQLException {
        String createSql = "create table PERSON (PERSON_ID INTEGER NOT NULL, " +
                "NAME varchar(255) NOT NULL, " +
                "AGE INTEGER NOT NULL, " +
                "PRIMARY KEY (PERSON_ID))";
        try (Statement stm = connection.createStatement()) {
            stm.execute(createSql);
        }
    }

    public static void dropTable(Connection connection) throws SQLException {
        String drop = "drop table PERSON";
        try (Statement statement = connection.createStatement()){
            statement.execute(drop);
        }
    }
}
