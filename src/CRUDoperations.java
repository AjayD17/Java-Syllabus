//  CRUD Operations in Databases
//  Definition:
//  CRUD stands for:
//      C → Create (Insert data)
//      R → Read (Retrieve data)
//      U → Update (Modify data)
//      D → Delete (Remove data)

//  These are the four basic operations performed on any database system.

//  Sample Table for Examples:
//  Let’s assume we have a table called Student:

//CREATE TABLE Student (
//        id INT PRIMARY KEY,
//        name VARCHAR(50),
//        age INT
//);

//  1. CREATE (INSERT)
//  Definition:
//      The INSERT statement is used to add new records into a table.

//  Syntax:
//      INSERT INTO table_name (column1, column2)
//      VALUES (value1, value2);

//  Examples:
//  Insert single row:
//      INSERT INTO Student (id, name, age)
//      VALUES (1, 'Ajay', 20);

//  Insert multiple rows:
//      INSERT INTO Student (id, name, age)
//      VALUES
//      (2, 'Ravi', 21),
//      (3, 'Priya', 19);

//  Real-Life Example:
//      Adding a new user during registration in a website

//  2. READ (SELECT)
//  Definition:
//      The SELECT statement is used to retrieve data from a database.

//  Syntax:
//      SELECT column_name FROM table_name;

//  Examples:
//  Fetch all records
//      SELECT * FROM Student;

//  Fetch specific columns
//      SELECT name, age FROM Student;

//  With condition
//      SELECT * FROM Student
//      WHERE age > 20;

//  Real-Life Example:
//      Viewing student details or user profile

//  3. UPDATE
//  Definition:
//      The UPDATE statement is used to modify existing records in a table.

//  Syntax:
//      UPDATE table_name
//      SET column1 = value1
//      WHERE condition;

//  Examples:
//  Update a specific record:
//      UPDATE Student
//      SET age = 22
//      WHERE id = 1;

//  Update multiple columns:
//      UPDATE Student
//      SET name = 'Ajay Kumar', age = 23
//      WHERE id = 1;

//  Important Note:
//      If you don’t use WHERE, all rows will be updated:
//          UPDATE Student SET age = 25;

//  Real-Life Example:
//      Updating user profile details

//  4. DELETE
//  Definition:
//      The DELETE statement is used to remove records from a table.

//  Syntax:
//      DELETE FROM table_name
//      WHERE condition;

//  Examples:
//  Delete a specific record:
//      DELETE FROM Student
//      WHERE id = 2;

//  Delete all records:
//      DELETE FROM Student;

//  Important Note:
//      Without WHERE, all data will be deleted.

//  Real-Life Example:
//      Deleting a user account

//  CRUD Summary Table:
//      Operation	    SQL Keyword	    Purpose
//      Create	        INSERT	        Add new data
//      Read	        SELECT	        Retrieve data
//      Update	        UPDATE	        Modify data
//      Delete	        DELETE	        Remove data

//  Mini Practical Scenario:
//  Student Management System:
//  Add student:
//      INSERT INTO Student VALUES (4, 'Kiran', 20);

//  View students:
//      SELECT * FROM Student;

//  Update student age:
//      UPDATE Student SET age = 21 WHERE id = 4;

//  Delete student:
//      DELETE FROM Student WHERE id = 4;

//  Key Points to Remember:
//      Always use WHERE in UPDATE and DELETE
//      Use SELECT carefully for large data
//      CRUD is the foundation of backend development


