package dataBase.lessons_4;

import java.sql.*;

public class DbWorker {
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
        DbWorker dbWorker = new DbWorker();
        //dbWorker.connect();
        System.out.println(dbWorker.getActorCount());
        System.out.println(dbWorker.getActorCountInt());
        dbWorker.getActorCountAida();
    }
    public int getActorCountInt(){
        String SQL = "SELECT count(*) FROM trainers";
        int count = 0;

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)){
            rs.next();
            count = rs.getInt(1);
        }
        catch (SQLException ex){
            System.out.println(ex.getNextException());
        }
        return count;

    }
    public String getActorCount(){
        String SQLText = "select count (*) from students " + "where lower(fullname) like '%и%'";
        String count = null;

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQLText)){
             rs.next();
             count = rs.getString(1);
        }
        catch (SQLException ex){
            System.out.println(ex.getNextException());
        }
        return count;

    }
    public String getActorCountAida(){
        String SQLText = "select * from gruppa";
                //"where lower(fullname) like '%и%'";
        String count = null;

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQLText)){
            while (rs.next()) {

                System.out.println(rs.getString("id")+ " " + rs.getString("names"));
            }
        }
        catch (SQLException ex){
            System.out.println(ex.getNextException());
        }
        return count;

    }
}
