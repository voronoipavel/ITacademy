package dataBase.lessons_3;

import java.sql.*;

public class KlassWork {

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
        KlassWork klassWork = new KlassWork();
        klassWork.getResultPreparedStatement();
    }

    public int getActorCount() {
        String SQL =
                "SELECT count(*) FROM students " +
                        "where lower(name) like '%а%'";

        String SQLText =
                "select max(name) from students s";
        int count = 0;

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            rs.next();
            count = rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return count;
    }

    public boolean getResultTable() {

        String SQL =
                "select g.id, g.name, s.name stud_name from students s " +
                        "join gruppa g on s.id_gruppa = g.id";
        int count = 0;

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") +
                                " " +
                                rs.getString("name") +
                                rs.getString("stud_name"));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return true;
    }

    public boolean getResultPreparedStatement() {

        String SQL = "select g.id, g.names, s.fullname from students s " +
                "join gruppa g on s.id_gruppa = g.id " +
                "where s.id = ?";
        int count = 0;
        Connection conn = null;

        try {
            conn = connect();
            PreparedStatement stmt = conn.prepareStatement(SQL);
            stmt.setInt(1, 2);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " + rs.getString("names") +
                                " " + rs.getString("fullname"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return true;
    }
}