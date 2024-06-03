package onkar.Core_Java_MYSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BasicJDBCExample {
    public static void main(String[] args) {
        // Database credentials
        String jdbcURL = "jdbc:mysql://localhost:3306/school";
        String username = "root";
        String password = "Onkar";

        // JDBC objects
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // 1. Load and register JDBC driver (optional since JDBC 4.0)
            // Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish connection
            connection = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("Database dbemp connection suceesfully establish");
            // 3. Create a statement
            statement = connection.createStatement();
            // 4. Execute a query
            String s ="insert into student values(03,'Akash','BMC')";
         
            String sql = "SELECT * FROM student";
            resultSet = statement.executeQuery(sql);
            
//            
//            resultSet = statement.executeQuery(s);

            // 5. Process the result set
            System.out.println("ID:"+ "\t" + "Name:"+ "\t" + "Classroom ");
            while (resultSet.next()) {
                int id = resultSet.getInt("rollno");
                String name = resultSet.getString("name");
                String classroom = resultSet.getString("Class");
                // Add more columns as needed
                
                System.out.println(id + "\t" + name+ "\t" +classroom);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 6. Clean up and close resources
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Execute Query");
    }
}
