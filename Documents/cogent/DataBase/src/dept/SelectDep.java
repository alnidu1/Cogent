package dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectDep {
	public static void main(String[] args) {
	 	String url = "jdbc:mysql://localhost:3306/cogentdb";
        String username = "root";
        String password = "root1234";
        
        
        
        
        
        
        
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            
            String selectSql = "SELECT * FROM departments where department= 'CS'";
            Statement selectStatement = conn.createStatement();
            
            ResultSet result = selectStatement.executeQuery(selectSql);
            
            Scanner scanner = new Scanner(System.in);
            	while (result.next()) {
                    int id = result.getInt("id");
                    String name = result.getString("name");
                    double salary = result.getDouble("salary");
                    String department = result.getString("department");
    			
            	
            	
                    System.out.printf("ID: %d, Name: %s, Department: %s, , Salary: %.2f\n",
                            id, name, department,  salary);
            }
            
            result.close();
            selectStatement.close();
            scanner.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println("An error occurred: " + ex.getMessage());
            ex.printStackTrace();
        }
  }
}
