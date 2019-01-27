package dataBase.lessons_3;

import java.sql.*;

public class KlassWork1 {

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
        KlassWork1 klassWork = new KlassWork1();
        klassWork.getResultPreparedStatement();
    }

    public boolean getResultPreparedStatement() {

        String SQL = "insert into t_countries (id, name) values (?, ?)";
        Connection conn = null;

        try {
            conn = connect();
            PreparedStatement stmt = conn.prepareStatement(SQL);
            stmt.setInt(1, 2);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("names")
                        + " " + rs.getString("fullname"));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return true;
    }
}