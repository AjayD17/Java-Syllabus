//  INTRODUCTION:
//      Data types in Java define the type of data a variable can store.

//  They are mainly divided into:
//      Primitive Data Types
//      Non-Primitive Data Types

//  1. PRIMITIVE DATA TYPES
//      Primitive data types are the basic data types in Java.
//      They store simple values directly in memory.

//  (i). int
//  Definition:
//      Used to store whole numbers (without decimal point)

//  Example:
//      int age = 21;

//  Use Case:
//      Age
//      Count
//      ID numbers

//  (ii). float
//  Definition:
//      Used to store decimal numbers with less precision

//  Example:
//      float marks = 85.5f;

//  Note:
//      Always add "f" at the end

//  Use Case:
//      Marks
//      Percentage

//  (iii). double
//  Definition:
//      Used to store decimal numbers with high precision

//  Example:
//      double price = 999.99;

//  Use Case:
//      Scientific calculations
//      Currency values

//  (iv). char
//  Definition:
//      Used to store a single character

//  Example:
//      char grade = 'A';

//  Rule:
//      Must use single quotes ''

//  Use Case:
//      Grades
//      Initials

//  (v). boolean
//  Definition:
//      Stores only two values: true or false

//  Example:
//      boolean isPass = true;

//  Use Case:
//      Conditions
//      Login status

//  2. NON-PRIMITIVE DATA TYPES
//      Non-primitive data types store multiple values or complex data.
//      They store reference (address) of the value.

//  (i). String
//  Definition:
//      Used to store collection of characters (text)

//  Example:
//      String name = "Ajay";

//  Use Case:
//      Names
//      Messages
//      Text data

//  (ii). Arrays
//  Definition:
//      Used to store multiple values of same type in a single variable

//  Example:
//      int[] numbers = {10, 20, 30, 40};

//  Use Case:
//      Marks list
//      Multiple values storage

//  (iii). Class
//  Definition:
//      Class is a blueprint used to create objects.
//      It defines variables and methods.

//  Example:
//      class Student {
//          String name;
//          int age;
//      }

//  Use Case:
//      Designing structure (like student, employee, etc)

//  (iv). Object
//  Definition:
//      Object is an instance of a class.
//      It is used to access variables and methods of a class.

//  Example:
//      Student s1 = new Student();
//      s1.name = "Ajay";
//      s1.age = 21;

//  Use Case:
//      Real-world entity representation

//  Final Combined Program:
// Student class
class Student {
    String name;
    int age;
}

public class Datatypes {
    public static void main(String[] args) {

        int age = 21;
        float marks = 85.5f;
        double salary = 50000.75;
        char grade = 'A';
        boolean isPass = true;

        String name = "Ajay";
        int[] numbers = {10, 20, 30};

        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Pass Status: " + isPass);
        System.out.println("Name: " + name);
        System.out.println("Numbers: " + numbers);

        Student s1 = new Student();
        s1.name = "Ajay";
        s1.age = 21;

        System.out.println("Student Name: " + s1.name);
        System.out.println("Student Age: " + s1.age);
    }
}


//  SUMMARY:
//      String → text data.
//      Array → multiple values.
//      Class → blueprint.
//      Object → real-world instance.


//  SUMMARY:
//      int → whole numbers.
//      float → small decimal values.
//      double → high precision decimals.
//      char → single character.
//      boolean → true/false.
//      String → text.
//      Array → multiple values.

