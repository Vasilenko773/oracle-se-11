package oracle.se.part2.jdbc;

import java.sql.*;

public class CrudExamples {

    public static void main(String[] args) throws SQLException {
        try (Connection connection = ConnectionExample.getConnection(ConnectionExample.derbyFileConnectionString)) {
            ConnectionExample.createTable(connection);
            addData(connection);
            getData(connection);
            ConnectionExample.dropTable(connection);

        }
    }

    public static void addData(Connection connection) throws SQLException {
        String insertSQL = "insert into PERSON(PERSON_ID, NAME, AGE) " +
                "values(?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(insertSQL)) {
            statement.setInt(1, 3);
            statement.setString(2, "Huan");
            statement.setInt(3, 11);
            System.out.println("records inserted = " + statement.executeUpdate());
        }
    }

    public static void getData(Connection connection) throws SQLException {
        String selectSQL = "select * from PERSON";
        try (Statement stmt = connection.createStatement()) {
            ResultSet rs = stmt.executeQuery(selectSQL);
            int columnCount = 0;
            if (rs != null) {
                columnCount = rs.getMetaData().getColumnCount();
            }
            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(rs.getMetaData().getColumnName(i) + " = " + rs.getObject(i) + " ");
                }
                System.out.println();
            }
        }
    }
}
