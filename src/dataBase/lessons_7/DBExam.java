package dataBase.lessons_7;

import java.sql.*;
        import java.util.ArrayList;

public class DBExam {

    ArrayList<News> arrayList = new ArrayList<>();

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
        DBExam dbExam = new DBExam();
        //dbExam.createNewNews(1, "News", "News123");
        //dbExam.createNewNews(10,"News3", "qwerty12");
        //dbExam.createNewNews(3,"News4", "qwerty1234");
        dbExam.newsDisplay();
        //dbExam.deleteNews(0);
        dbExam.newsDisplayOnly();

        //dbExam.updateNews(0,"News5", "qwerty");
        for (int i = 0; i < dbExam.arrayList.size(); i++) {
            System.out.println(dbExam.arrayList.get(i));

        }

    }

    public boolean createNewNews(int id, String newHeadline, String newText) {
        String SQL = "INSERT INTO news (id, news_headline, news_text, publication_time) " +
                "values (?, ?, ?, ?)";

        try (Connection conn = connect()) {
            PreparedStatement stmt =
                    conn.prepareStatement(SQL);

            stmt.setInt(1, id);
            stmt.setString(2, newHeadline);
            stmt.setString(3, newText);
            stmt.setTimestamp(4, new Timestamp(System.currentTimeMillis()));

            stmt.executeUpdate();
            System.out.println("Successfully");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }
    public boolean newsDisplay() {
        String SQL = "SELECT * FROM news ";

        int count = 0;

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            rs.next();
            arrayList.add(new News(rs.getString("news_headline"),rs.getTimestamp("publication_time")));

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

            return false;
        }

        return true;
    }

    public boolean deleteNews(int Id) {
        String SQL =
                "DELETE FROM news " +
                        "where id = ?";
        try (Connection conn = connect()) {
            PreparedStatement stmt =
                    conn.prepareStatement(SQL);

            stmt.setInt(1, Id);

            stmt.executeUpdate();
            System.out.println("News deleted");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }
    public boolean updateNews (int id, String newHeadline, String newText) {
        String SQL = "UPDATE news " +
                "SET news_headline = ?, news_text = ? " +
                "WHERE id = ?";
        try (Connection conn = connect()) {
            PreparedStatement stmt =
                    conn.prepareStatement(SQL);

            stmt.setInt(3, id);
            stmt.setString(1, newHeadline);
            stmt.setString(2, newText);

            stmt.executeUpdate();
            System.out.println("Successfully updated");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }

    public boolean newsDisplayOnly() {
        String SQL = "SELECT * FROM news ";

        int count = 0;

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            rs.next();
            rs.getString("news_headline");
            rs.getString("news_news");
            rs.getTimestamp("publication_time");


        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

            return false;
        }

        return true;
    }
}
