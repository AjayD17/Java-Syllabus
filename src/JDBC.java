//  JDBC Basics:
//  Definition:
//      JDBC (Java Database Connectivity) is an API in Java that allows applications to connect to databases, execute queries, and retrieve or update data.
//
//      In simple terms:
//          JDBC acts as a bridge between Java application and database (like MySQL, Oracle, etc.)

//  Architecture Overview:
//      Java Application → JDBC API → JDBC Driver → Database

//  How to install ?
//  Method 1: Official Website (Manual Download)
//      What You Need to Download
//        You need to download:
//          MySQL Connector/J

//      Steps to Download
//          1. Open your web browser.
//          2. Search for “MySQL Connector/J download”.
//          3. Open the official MySQL website from the search results.
//          4. Select the latest stable version (preferably from the 8.x series).
//          5. Choose the operating system as:
//              * Platform Independent
//          6. In the download options, select:
//              * ZIP Archive (.zip file)
//          7. Click on the Download button.

//        |         Driver       |          Used               |
//        | -------------------- | --------------------------- |
//        | ADO.NET              | .NET (C#, VB)               |
//        | ODBC                 | General purpose (C/C++)     |
//        | JDBC (Connector/J)   |         Java                |
//        | Node.js              | JavaScript backend          |
//        | Python               | Python apps                 |
//        | C++                  | C++ apps                    |

//  Add .jar file in IntelliJ IDEA::
//        1. Open your project
//        2. Right-click on the project → Click “Open Module Settings”
//              (Shortcut: Ctrl + Alt + Shift + S)
//        3. Go to Libraries section
//        4. Click “+” icon → Select Java
//        5. Choose the downloaded .jar file
//        6. Click Apply → then OK

//  1. JDBC Driver
//  Definition:
//      A JDBC Driver is a software component that enables Java applications to communicate with a database.
//      It converts Java commands into database-specific commands.

//  Types of JDBC Drivers (Short Overview):
//      Type 1 – JDBC-ODBC Bridge (Old, deprecated)
//      Type 2 – Native API Driver
//      Type 3 – Network Protocol Driver
//      Type 4 – Thin Driver (Most used, pure Java)

//  For MySQL, we use Type 4 Driver

//  MySQL Driver:
//  The commonly used driver is:
//      MySQL Connector/J

//  2. Connection
//  Definition:
//      A Connection is an interface in JDBC that represents a session between Java application and database.
//      Without connection → no communication with database

//  How Connection Works:
//      Load driver
//      Establish connection using:
//          URL
//          Username
//          Password

//  Connection URL Format (MySQL)
//      jdbc:mysql://localhost:3306/database_name

//  3. Steps to Connect Java with MySQL:
//  Step-by-Step Process
//      1. Import packages
//      2. Load JDBC Driver
//      3. Establish Connection
//      4. Create Statement
//      5. Execute Query
//      6. Process Result
//      7. Close Connection

//  Practical Example: MySQL Connection
//  Before Coding (Important Setup)
//      1. Install MySQL
//      2. Download MySQL Connector/J
//      3. Add .jar file to your project

//  Java Program Example:
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
//
//class JDBCExample {
//    public static void main(String[] args) {
//        try {
//            // 1. Load Driver
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            // 2. Create Connection
//            Connection con = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/testdb",
//                    "root",
//                    "Ajay@#1712"
//            );
//
//            // 3. Create Statement
//            Statement stmt = con.createStatement();
//
//            // 4. Execute Query
//            stmt.executeUpdate("INSERT INTO student VALUES (1, 'Ajay')");
//
//            System.out.println("Data inserted successfully!");
//
//            // 5. Close Connection
//            con.close();
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}

//  Example: Fetch Data (SELECT Query)
import java.sql.*;

class FetchData {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb",
                    "root",
                    "Ajay@#1712"
            );

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            while (rs.next()) {
                System.out.println(
                        rs.getString(1) + " " + rs.getString(2)
                );
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

//  Key Interfaces in JDBC:
//          Interface	        Purpose
//          Driver	            Connects Java to DB
//          Connection	        Session with database
//          Statement	        Executes SQL queries
//          ResultSet	        Stores retrieved data

//  Real-Time Use Cases:
//      Login system (username/password check)
//      Student management system
//      Banking applications
//      E-commerce backend

//  Common Errors & Fixes:
//      ❌ Error: Driver not found
//      ✔ Fix: Add MySQL Connector/J .jar

//      ❌ Error: Access denied
//      ✔ Fix: Check username/password

//      ❌ Error: Database not found
//      ✔ Fix: Verify DB name and port

//  Conclusion:
//      JDBC is essential for database connectivity
//      Driver acts as a translator
//      Connection acts as a communication channel
//      MySQL integration is widely used in real-world applications

//  Clear Understanding:
//  1. Without Spring Boot (Using JDBC Only):
//      This is what you are currently doing

//      Java program
//      JDBC driver
//      MySQL connection

//      You can directly connect using:
//          Connection con = DriverManager.getConnection(...);

//      Used for simple applications
//      Very useful for learning basics

//  2. With Spring Boot:
//  This is an advanced approach
//      JDBC works in the background
//      Spring Boot makes everything easier to manage

//  Advantages:
//      Automatic database connection
//      Less code
//      More features (Security, Validation, etc.)

//  Difference Between JDBC and Spring Boot
//          Feature	            JDBC	            Spring Boot
//          Setup	            Manual	            Automatic
//          Code	            More	            Less
//          Control	            Full control	    Framework-managed
//          Usage	            Small applications	Real-time applications

//  Real-World Insight:
//  In companies:
//      Pure JDBC is rarely used.
//      Spring Boot with JPA/Hibernate is widely used.




