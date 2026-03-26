package Lab13;

import java.sql.*;

public class StudentTable {
    public static void main(String[] args) {
        try {
           Class.forName("oracle.jdbc.driver.OracleDriver");
           Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:XE",
                    "swayonjeet10",
                    "kiit"
           );
           Statement stmt = con.createStatement();
           ResultSet rs = stmt.executeQuery("SELECT * FROM student");
           System.out.println("ID  Name  Age");
           while (rs.next()) {
               int id = rs.getInt(1);
               String name = rs.getString(2);
               int age = rs.getInt(3);
               System.out.println(id + "  " + name + "  " + age);
           }
           con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}