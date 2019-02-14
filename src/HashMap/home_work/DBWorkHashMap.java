package HashMap.home_work;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class DBWorkHashMap {

    private final String url = "jdbc:postgresql://localhost/postgres";
    private final String user = "postgres";
    private final String password = "4091986gala";

    public Connection connect() {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println(url + " " + user+ " "+ password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void main(String[] args) {
        DBWorkHashMap dbWorkHashMap = new DBWorkHashMap();


        for (Map.Entry<String, CarDetails> cars : dbWorkHashMap.getCar(1).entrySet()) {
            System.out.println(cars);
        }
    }

    public Map<String, CarDetails> getCar(int id) {
        String SQL =
                "SELECT d.* FROM my_car m " +
                        "join my_car_details d on m.id = d.id_car " +
                        "where 1 = ?";
        int count = 0;

        Map<String, CarDetails> maps = new HashMap<>();
        try (Connection conn = connect()) {
            PreparedStatement stmt = conn.prepareStatement(SQL);

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            int i = 0;
            while(rs.next()){
                maps.put(rs.getString("id_car"), new CarDetails(rs.getString("color"),rs.getString("fio"),String.valueOf(rs.getInt("year_of"))));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }

        return maps;
    }
}