package dataBase.lessons_4.home_work;

import java.sql.*;

public class DBHomeWork {
    private final String url = "jdbc:postgresql://localhost/postgres";
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
        DBHomeWork dbHomeWork = new DBHomeWork();
        dbHomeWork.testDB();

    }

    public void testDB() {
        String SQL = "select s.name sport, t.name train, s.salary sal from sports s " +
        "join trainers t on s.id = t.sport_id";

        int sum = 0;

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                if (rs.getString("train").length() > 5) {
                    System.out.println(rs.getString("train") + " молодец " + rs.getString("sal"));
                }else {
                    System.out.println(rs.getString("train") + " " + rs.getString("sal"));
                }
                sum += rs.getInt("sal");

            }
            System.out.println("Общая ЗП - " + sum);
        } catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
    }
}