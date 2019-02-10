package dataBase.lessons_6.home_work;

import java.sql.*;

public class HomeWorkDB {

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
        HomeWorkDB homeWorkDB = new HomeWorkDB();
        //homeWorkDB.register("Pavel", homeWorkDB.passwordTransformation("qwerty"), "pav@gmail.com");

        String myLogin = "Pavel";
        int loginId = homeWorkDB.getIdByLogin(myLogin);
        boolean isAuth = homeWorkDB.authorize(myLogin, homeWorkDB.passwordTransformation("qwerty"));
        int attempts = 0;

        if (loginId > 0) {
            if (isAuth) {
                homeWorkDB.log(loginId, "OK");
                homeWorkDB.clearLog(loginId);
            } else {
                homeWorkDB.log(loginId, "FAIL");
                attempts = homeWorkDB.getUserAttempts(myLogin, 3);
                if (attempts >= 3) {
                    homeWorkDB.block(loginId, true);
                }
            }
        }
    }

    public boolean register(String login, String password, String email) {
        String SQL =
                "INSERT INTO users (login, password, email, date_register) " +
                        "values (?, ?, ?, ?)";
        try (Connection conn = connect()) {
            PreparedStatement stmt =
                    conn.prepareStatement(SQL);

            stmt.setString(1, login);
            stmt.setString(2, password);
            stmt.setString(3, email);
            stmt.setTimestamp(4, new Timestamp(System.currentTimeMillis()));

            stmt.executeUpdate();
            System.out.println("Successfully");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }

    public boolean authorize(String login, String password) {
        String SQL =
                "SELECT count(*) FROM users " +
                        "WHERE lower(login) = lower(?) and password = ? " +
                        "and blocked != true";

        int count = 0;

        try (Connection conn = connect()) {
            PreparedStatement stmt = conn.prepareStatement(SQL);
            stmt.setString(1, login);
            stmt.setString(2, password);

            System.out.println(login);
            System.out.println(password);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            count = rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }

        return count == 0 ? false : true;
    }

    public int getIdByLogin(String login) {
        String SQL = "SELECT id FROM users " +
                "WHERE lower(login) = lower(?)";
        Integer count = 0;

        try (Connection conn = connect()) {
            PreparedStatement stmt = conn.prepareStatement(SQL);
            stmt.setString(1, login);
            System.out.println(login);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            count = rs.getInt("id");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }

    public boolean log(int loginId, String status) {
        String SQL =
                "INSERT INTO users_log " +
                        "(user_id, status) " +
                        "values (?, ?)";
        try (Connection conn = connect()) {
            PreparedStatement stmt = conn.prepareStatement(SQL);

            stmt.setInt(1, loginId);
            stmt.setString(2, status);

            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }

    public int getUserAttempts(String login, int numToBlock) {
        String SQL =
                "SELECT count(*) from users_log a " +
                        "JOIN users al on a.user_id = al.id " +
                        "WHERE al.login = ? and a.status = ? ";
        Integer count = 0;

        try (Connection conn = connect()) {
            PreparedStatement stmt = conn.prepareStatement(SQL);

            stmt.setString(1, login);
            stmt.setString(2, "FAIL");

            ResultSet rs = stmt.executeQuery();
            rs.next();
            count = rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return count;
    }

    public boolean block(int loginId, boolean blockStatus) {
        String SQL = "UPDATE users " +
                "SET blocked = ? " +
                "WHERE id = ?";
        try (Connection conn = connect()) {
            PreparedStatement stmt =
                    conn.prepareStatement(SQL);

            stmt.setBoolean(1, blockStatus);
            stmt.setInt(2, loginId);

            stmt.executeUpdate();
            System.out.println("Successfully updated");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }

    public boolean clearLog(int loginId) {
        String SQL =
                "DELETE FROM users_log " +
                        "where user_id = ? and status = ?";
        try (Connection conn = connect()) {
            PreparedStatement stmt =
                    conn.prepareStatement(SQL);

            stmt.setInt(1, loginId);
            stmt.setString(2, "FAIL");

            stmt.executeUpdate();
            System.out.println("Successfully deleted");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }

    public String passwordTransformation(String str) {
        String string = "";
        int count = 0;
        string += str.charAt(str.length() - 1);
        for (int i = str.length() - 1; i >= 0; i--) {
            string += str.charAt(i);
            string += str.charAt(count++);
        }
        string += str.charAt(0);
        return string;
    }
}

