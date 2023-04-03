package Employee;

import java.sql.*;

public class EmployeeTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/cogentdb"; //my database have more variable
        String username = "root";
        String password = "root1234";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to MySQL database!");
            /*
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
               */
           /* 
            String sql = "INSERT INTO employee (name, email, hire_date, salary) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "John Doe");
            statement.setString(2, "john.doe@example.com");
            statement.setDate(3, Date.valueOf("2022-04-03"));
            statement.setDouble(4, 50000.0);
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new employee was inserted successfully!");
            }

          *//*
            DatabaseMetaData metaData = conn.getMetaData();

            ResultSet rs = metaData.getColumns(null, null, "employee", null);
            while (rs.next()) {
                String columnName = rs.getString("COLUMN_NAME");
                String columnType = rs.getString("TYPE_NAME");
                int columnSize = rs.getInt("COLUMN_SIZE");
                System.out.println(columnName + " " + columnType + "(" + columnSize + ")");
            }*/
            
            String sql="call retreive_persons";
            CallableStatement cs = conn.prepareCall(sql);
            cs.execute();
            ResultSet rs=cs.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String fn = rs.getString("first_name");
                String ln = rs.getString("last_name");
               
			
        	
        	
                System.out.printf("ID: %d, First: %s, Last: %s \n",
                        id, fn,ln);
               
            }
            cs.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Error connecting to MySQL database: " + e.getMessage());
        }
    }
}
