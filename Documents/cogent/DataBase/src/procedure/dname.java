package procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class dname {

	public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/cogentdb"; //my database have more variable
        String username = "root";
        String password = "root1234";
        
        
        
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            
            CallableStatement stmt = conn.prepareCall("{call get_dept_name(?)}");
            
            stmt.setInt(1, 10); 
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
              String name = rs.getString("department");
              System.out.println("Department name: " + name);
            }
            
            rs.close();
            stmt.close();
            conn.close();
          } catch (SQLException e) {
            e.printStackTrace();
          }
       }
}
