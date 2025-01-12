## Name: Otoniel Rodriguez-Perez

## Course: CEN-3024C-24204

### Purpose: ###
This programs purpose is to connect to an MySQL database using Java code. The program will run and request data using a SELECT SQL Statement. It will use JDBC (Java Database Connectivity) to connect to MySQl Server. This specific code will select the table from "parks_and_recreation" database, look for the "parks_departments" table, and print the results to the console.

### Prerequisites: ###
Before running this program, it must meet the following requirements: <br/>
The Java Development Kit (JDK) is already installed on your computer. <br/>
MySQL server that you can run and that is available from your computer. <br/>
The MySQL JDBC driver (com.mysql.cj.jdbc.Driver) must be included in the classpath.<br/>
It is suggested that these are the lastest version to ensure successfull compilation.<br/>

### Database Setup: ###
This programs assumes that a database is created containing a "parks_and_recreation" table. If this is true, the program will display information correctly. If the database or table is not create, it will throw an exception.

#### Exceptions ###
This program uses try and catch methods to see if the information provided for the database is correct. It will also check if the JDBC driver is within the classpath. if either of these fail, an exception is created and the user will see it in the output.

### Run the Program: ###
To run the program correctly, the following authentication information is required: <br/>
URL: localhost:3306/parks_and_recreation <br/>
Username: root <br/>
Password: !2394P0k3 <br/>

### Program Execution: ###
When you run the Java program, it will:<br/>
Read the authentication information.<br/>
Connect to the MySQL database.<br/>
Run the query to "SELECT * FROM the parks_department table."<br/>
Using a for loop, it will print out the department name from the parks_departments table.<br/>

### Expected Output: ###
Within the Java program, we will print a list of department names from parks_departments table:<br/>
Departments <br/>
"Parks and Recreation" <br/>
"Public Works" <br/>
"Community Services"<br/>
