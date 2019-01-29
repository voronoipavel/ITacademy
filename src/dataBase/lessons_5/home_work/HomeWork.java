package dataBase.lessons_5.home_work;

import java.sql.*;
import java.util.ArrayList;

public class HomeWork {

    ArrayList<IDCity> arrayList1 = new ArrayList<>();
    ArrayList<IDCity> arrayList2 = new ArrayList<>();
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
        HomeWork homeWork = new HomeWork();

        homeWork.arrayList1.add(new IDCity("KG1", "Bishkek"));
        homeWork.arrayList1.add(new IDCity("KG2", "Osh"));
        homeWork.arrayList1.add(new IDCity("KG3", "Karakol"));
        homeWork.arrayList1.add(new IDCity("KZ1", "Almaty"));
        homeWork.arrayList1.add(new IDCity("KZ2", "Astana"));

        homeWork.arrayList2.add(new IDCity("KZ1", "Astana"));
        homeWork.arrayList2.add(new IDCity("KZ2", "Almaty"));


        homeWork.getInsertDB(homeWork.arrayList1);
        homeWork.getUpdateDB(homeWork.arrayList2);
        homeWork.getSelectDB();
    }

    public boolean getInsertDB(ArrayList<IDCity> arrayList) {

        String SQL = "insert into city (id, name) values (?, ?)";

        try (Connection conn = connect()) {
            PreparedStatement stmt = conn.prepareStatement(SQL);

            for (int i = 0; i < arrayList.size(); i++) {
                stmt.setString(1, arrayList.get(i).id);
                stmt.setString(2, arrayList.get(i).city);

                System.out.println(stmt.executeUpdate() + " ROWS INSERTED");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return true;
    }

    public boolean getUpdateDB(ArrayList<IDCity> arrayList) {

        String SQLUpdate = "update city set name = ? where id = ?";

        try (Connection conn = connect()) {
            PreparedStatement ps = conn.prepareStatement(SQLUpdate);

            for (int i = 0; i < arrayList.size(); i++) {
                ps.setString(1, arrayList.get(i).city);
                ps.setString(2, arrayList.get(i).id);
                ps.executeUpdate();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return true;
    }
    public boolean getSelectDB() {

        String SQL = "SELECT * FROM city";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {

            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return true;
    }

}
