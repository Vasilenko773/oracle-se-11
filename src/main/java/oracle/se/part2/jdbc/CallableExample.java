package oracle.se.part2.jdbc;

import java.sql.*;

public class CallableExample {

    public static void main(String[] args) throws SQLException {
        try (Connection connection = ConnectionExample.getConnection(ConnectionExample.derbyFileConnectionString)) {

            setUpData(connection);
            CrudExamples.getData(connection);
            javaUpdatePassThrough("Pedro", 3);
            CrudExamples.getData(connection);
            createProcedur(connection);
            executeStoredProcedure(connection, "HUAN_PROCEDUR", 3);
            CrudExamples.getData(connection);
        }
    }

    private static void setUpData(Connection connection) throws SQLException {
        try {
            ConnectionExample.dropTable(connection);
        } catch (SQLException se) {
            System.out.println(se);
        }
        ConnectionExample.createTable(connection);
        CrudExamples.addData(connection);
    }

    public static void javaUpdatePassThrough(String name, int personId) throws SQLException {
        String query = "update person set name = ? where person_id = ?";
        try (Connection connection = ConnectionExample.getConnection(ConnectionExample.derbyFileConnectionString);
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, name);
            statement.setInt(2, personId);
            int rsl = statement.executeUpdate();
            System.out.println(rsl);
        }
    }

    public static void createProcedur(Connection connection) throws SQLException {
        String createProcedure =
                "create procedure update_person(" +
                        "in name varchar(255)," +
                        "in pid integer) " +
                        "parameter style java reads sql" +
                        " data language java external name " +
                        "'CallableExample.javaUpdatePassThrough'";
        try (Statement stmt = connection.createStatement()) {
            try {
                stmt.execute("drop procedure update_person");
            } catch (Exception e) {
            }
            stmt.executeUpdate(createProcedure);
        }
    }

    public static void executeStoredProcedure(Connection connection, String name, int personId) throws SQLException {
        try (CallableStatement cs = connection.prepareCall("{ call update_person(?, ?)}")){
            cs.setString(1, name);
            cs.setInt(2, personId);
            cs.execute();
        }
    }
}
