package dataBase.lessons_6;


import java.sql.*;

public class ClassWorkDB {

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
        ClassWorkDB classWorkDB = new ClassWorkDB();
        classWorkDB.register();
        classWorkDB.getTestDB();

    }

    public void register() {
        String SQLText = "" +
                "join trainers t on s.id = t.sport_id";

        int count = 0;
        int sum = 0;

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQLText)) {
            while (rs.next()) {
                System.out.println(rs.getString("sport"));
                System.out.println(rs.getString("train"));
                sum += rs.getInt("sal");
            }
            System.out.println("Общая ЗП - " + sum);
        } catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
    }

    public void getTestDB() {
        String SQL = "insert into users(login, passwords, dateOfRegistration, blockeds) values (?, ?, ?, ?, ?);";

        try (Connection conn = connect()) {
            PreparedStatement stmt = conn.prepareStatement(SQL);

            for (int i = 0; i < 10; i++) {
                stmt.setString(1, "hh" );
                stmt.setString(2,"xxx" );

                System.out.println(stmt.executeUpdate() + " ROWS INSERTED");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
