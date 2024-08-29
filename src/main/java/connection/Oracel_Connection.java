package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Oracel_Connection {
	
	public static void main(String[] args) {
		  // JDBC URL for Oracle database
        String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
        // Database credentials
        String username = "scott";
        String password = "tiger";
        
        // Initialize connection object
        Connection connection = null;
	
        try {
            // Establish connection
            connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Connection established successfully!");
    		Statement s= connection.createStatement();
    		 String sql = "INSERT INTO employees VALUES (123457, 'Suresh', 'Krishna', 'krishnakutty@gmail.com', TO_DATE('11-DEC-22', 'DD-MON-YY'), 4589)";
             
    		s.executeUpdate(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close connection if open
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
	}
}
            
	
