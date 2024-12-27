package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQlConnection {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/try";
        String username="root";
        String password="my@sql";
        String query = "select * from user;";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,username,password);
            System.out.println("Connection Established");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                // Example: Access columns by name or index
                int id = rs.getInt("id"); // Replace with your column name
                String name = rs.getString("name"); // Replace with your column name

                // Print the result
                System.out.println("ID: " + id + ", Name: " + name);
            }
            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Connection failed."+e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
