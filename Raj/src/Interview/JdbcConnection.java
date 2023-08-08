package Interview;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {
	
	    public static void main(String[] args) {
	        String dbUrl = "jdbc:mysql://localhost:3306/mydatabase";
	        String username = "your_username";
	        String password = "your_password";

	        try {
	            // Step 1: Establish the connection
	            Connection connection = DriverManager.getConnection(dbUrl, username, password);

	            // Step 2: Create a statement
	            Statement statement = connection.createStatement();

	            // Step 3: Write and execute the query
	            String sqlQuery = "SELECT * FROM my_table";
	            ResultSet resultSet = statement.executeQuery(sqlQuery);

	            // Step 4: Process the result (if applicable)
	            while (resultSet.next()) {
	                // Process each row of the result set
	                int id = resultSet.getInt("id");
	                String name = resultSet.getString("name");
	                // ... Process other columns as needed
	                System.out.println("ID: " + id + ", Name: " + name);
	            }

	            // Step 5: Close the resources
	            resultSet.close();
	            statement.close();
	            connection.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}
