Purpose
In this program, we see how to connect to MySQL database with Java and pull data from a table using JDBC (Java Database Connectivity). When the program is executed, it opens a connection to the parks_and_recreation database, selects all department names from the parks_departments table, and prints the results to the console.

Prerequisites
Before running this program, ensure you have the following:
The Java Development Kit (JDK) is already installed on your computer.
MySQL server that you can run and that is available from your computer.
Setting up your project’s classpath that includes the MySQL JDBC driver (com.mysql.cj.jdbc.Driver).

Database Setup
Assuming you already have a MySQL database named parks_and_recreation, the program takes command.
This table should be a table parks_departments with at least one column named department_name.

Running the Program
Database Connection Details:
The program connects to the database using the following credentials:
URL: localhost:3306/parks_and_recreation
Username: root
Password: !2394P0k3

Execute the Code:
When you run the Java program, it will:
Connects to the MySQL database.
Run the query SELECT * FROM parks_departments.
Iterate from results, then print department name from the parks_departments table.

Output
Within the Java program, we will print a list of department names from parks_departments table.

Example output:
Departments
Parks and Recreation
Public Works
Community Services

Error Handling
When the JDBC driver is not found, the program will print an error message (ClassNotFoundException).
In case the problem lies within the database connection or executing the query, the program will catch and print the error (SQLException).
Dependencies
MySQL JDBC Driver: To connect to the MySQL database, the MySQL Connector/J is mandated. Don’t forget to put this dependency in your project.
