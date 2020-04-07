package java3_lesson2;

import java.sql.*;

public class MainDataBase {
    private static Connection connection;
    private static Statement stmt;
    private static PreparedStatement pstmt;

    public static void main(String[] args) throws SQLException {

        try {
            connect();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        CREATE("TEST");
        INSERT(50, "TEST","unknown", 1);
        UPDATE("TEST", 300);
        SELECT("TEST");
        DELETE("TEST");
        INSERT(3, "students","STUDENTS", 150);
        SELECT("students");
        String name = "bob1; drop table students";

        disconnect();

    }

    public static void connect() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:mainDB.db");
        stmt = connection.createStatement();
    }

    public static void disconnect() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void CREATE (String dbName) {

        String sql = String.format("CREATE TABLE '%s' (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT," +
                "score TEXT)", dbName);

        try {
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private static void UPDATE (String dbname, int numberScore) {

        String sql = String.format("UPDATE '%s' SET score = '%s'", dbname, numberScore);

        try {
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private static void DELETE (String dbName) {

        String sql = String.format("DELETE FROM '%s'", dbName);

        try {
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void INSERT (int number, String dbName, String name, int numberScore) throws SQLException {

        String sql = String.format("INSERT INTO '%s' (name, score) VALUES ('%s', " + numberScore +")", dbName, name);

        if (number > 100) {connection.setAutoCommit(false);}

        for (int i = 0; i < number; i++) {
            try {
                stmt.executeUpdate(sql);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (!connection.getAutoCommit()) {connection.setAutoCommit(true);}

    }

    private static void SELECT (String dbName) {

        String sql = String.format("SELECT id, name, score FROM '%s'", dbName);

        try {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString("name")
                    + " " + rs.getInt(3));
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}