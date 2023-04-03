package dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Delete {

	public static void main(String[] args) {
	 	String url = "jdbc:mysql://localhost:3306/cogentdb";
        String username = "root";
        String password = "root1234";
        
        Scanner sc=new Scanner(System.in);
        
        
        
        
        
        
        
        
        
        
        
        
        
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            
            String deleteSql = "DELETE FROM departments WHERE id = ?";
            PreparedStatement del = conn.prepareStatement(deleteSql);
            System.out.println("Enter employee id to delete");
            int num=sc.nextInt();
            //System.out.println(num);
            del.setInt(1, num);
            
            int rowsDeleted = del.executeUpdate(deleteSql);
            System.out.println(rowsDeleted + " rows deleted.");
            
            del.close();
            conn.close();
            
        } catch (SQLException ex) {
            System.out.println("An error occurred: " + ex.getMessage());
            ex.printStackTrace();
        }
  }
}
