package Test;

import java.sql.*;

public class Test100 {
    public static void main(String[] args) {
        Connection connection = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/yka?serverTimezone=UTC", "root" , "qwerty123");

            Statement stmt = connection.createStatement();
            ResultSet resilt = stmt.executeQuery("select * from yka1");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
