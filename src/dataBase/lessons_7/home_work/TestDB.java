package dataBase.lessons_7.home_work;

import java.sql.*;
import java.util.ArrayList;

public class TestDB {

    public static ArrayList<User> arrayList = new ArrayList<>();

    private final String url ="jdbc:postgresql://localHost/postgres";
    private final String user = "postgres";
    private final String password = "4091986gala";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static void main(String[] args) {
        arrayList.add(new User("pavel", "qwerty"));
        arrayList.add(new User("pav", "123"));


    }

    public User getAuthUser (String login, String password) {
        String SQL = "SELECT * FROM User ";
        User user = null;

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            rs.next();

            user = new User(rs.getString("login"), rs.getString("password"));

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
        return user;

    }
}