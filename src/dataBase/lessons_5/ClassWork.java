package dataBase.lessons_5;

import java.sql.*;
import java.util.ArrayList;

public class ClassWork {

    private final String url = "jdbc:postgresql://localhost/postgres";
    private final String user = "postgres";
    private final String password = "4091986gala";
    ArrayList<CityCountyPair> alist = new ArrayList<>();

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
        ClassWork classWork = new ClassWork();
//        classWork.insertsDict("t_countries", 5);
//        classWork.insertsDict("t_majors", 10);
        classWork.selectDict("t_countries");
    }

    public boolean insertsDict(String tableName, int counts) {

        String SQL =
                "insert into " + tableName + "(id, name) values (?, ?)";
        try (Connection conn = connect()) {
            PreparedStatement stmt =
                    conn.prepareStatement(SQL);

            for (int i = 1; i <= counts; i++) {
                stmt.setInt(1, i);
                stmt.setString(2, tableName + i);

                System.out.println(stmt.executeUpdate() + " ROWS INSERTED");
            }

            /*while(rs.next()){
                System.out.println(
                        rs.getInt("id")+
                                " " +
                                rs.getString("name") + " "+
                                rs.getString("stud_name"));
            }*/

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return true;
    }

    public boolean selectDict(String tableName) {

        String SQL = "select t.name, c.name from t_majors t, t_countries c";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {

            while (rs.next()) {
                alist.add(new CityCountyPair(
                        rs.getString(1),
                        rs.getString(2)));
            }
            System.out.println("____________________________________");
            for(CityCountyPair c : alist) {
                if (c.city.length() >= 5) {
                    System.out.println(c.city + " " + c.country);
                }
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return true;
    }
}
