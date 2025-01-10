import java.sql.Connection; // For managing the connection to the database
import java.sql.DriverManager; // For obtaining the database connection
import java.sql.ResultSet; // For handling the results of the query
import java.sql.SQLException; // For handling SQL exceptions
import java.sql.Statement; // For executing SQL queries

public class myJDBC {
    public static void main(String[] args){
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/parks_and_recreation"; // JDBC URL to connect to the database
        String user = "root"; // Database username
        String password = "!2394P0k3"; // Database password
        String query = "SELECT * FROM parks_departments"; // SQL query to fetch data

        // Ensure the MySQL JDBC driver is loaded
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load MySQL JDBC driver
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // Print error if the driver is not found
        }

        // Establish connection and execute query
        try (
                Connection connection = DriverManager.getConnection(url, user, password); // Create connection to the database
                Statement statement = connection.createStatement(); // Create a statement to execute SQL
                ResultSet resultSet = statement.executeQuery(query) // Execute the query and store the result
        ) {
            System.out.println("Departments"); // Print header for the output

            // Iterate through the result set and print each department name
            while (resultSet.next()) {
                System.out.println(resultSet.getString("department_name")); // Retrieve and print department_name column
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle any SQL exceptions that occur
        }
    }
}
