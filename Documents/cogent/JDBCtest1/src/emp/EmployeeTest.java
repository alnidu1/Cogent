package emp;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.*;

public class EmployeeTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test"; 
        String username = "root";
        String password = "root1234";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to MySQL database!");

            String sql = "SELECT * FROM employee";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                int id = result.getInt("id");
                String name = result.getString("name");
                String email = result.getString("email");
                Date hireDate = result.getDate("hire_date");
                double salary = result.getDouble("salary");

                System.out.printf("ID: %d, Name: %s, Email: %s, Hire Date: %s, Salary: %.2f\n",
                        id, name, email, hireDate, salary);
            }
        } catch (SQLException e) {
            System.out.println("Error connecting to MySQL database: " + e.getMessage());
        }
    }
}

