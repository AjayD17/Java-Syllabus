//  DESIGN PATTERNS (Java):
//  Definition:
//      Design Patterns are standard solutions to common software design problems.

//      ✔ Reusable solutions
//      ✔ Improve code structure
//      ✔ Used in real-world projects (Spring, Android, backend systems)

//  1. Singleton Design Pattern
//  Definition:
//      Singleton means only ONE object of a class can be created.

//      ✔ Restricts object creation
//      ✔ Provides global access to that object
//      ✔ Used in database connection, logging, config files

//  Example 1: Basic Singleton
//class Singleton {
//
//    private static Singleton instance;
//
//    private Singleton() {
//        System.out.println("Object created");
//    }
//
//    public static Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }
//}
//
//class Maintaining {
//    public static void main(String[] args) {
//
//        Singleton s1 = Singleton.getInstance();
//        Singleton s2 = Singleton.getInstance();
//
//        System.out.println(s1 == s2); // true
//    }
//}

//  Output:
//      Object created
//      true

//  Real Use Case:
//      Database connection
//      Logger class
//      Configuration settings

//  Example 2: Thread-safe Singleton
//class Singleton {
//
//    private static Singleton instance;
//
//    private Singleton() {}
//
//    public static synchronized Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }
//}

//  2. MVC Design Pattern:
//  Definition:
//      MVC = Model + View + Controller

//      ✔ Separates application into 3 parts
//      ✔ Makes code clean and scalable
//      ✔ Used in web apps (Spring MVC, JSP, etc.)

//  Structure:
//      Model → Data (Logic)
//      View → UI (Display)
//      Controller → Handles input

//  Example (Simple Java MVC):
//  Model:
//class Student {
//    int id;
//    String name;
//
//    Student(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//}

//  View:
//class StudentView {
//    public void showStudent(int id, String name) {
//        System.out.println("Student ID: " + id);
//        System.out.println("Student Name: " + name);
//    }
//}

//  Controller:
//class StudentController {
//    Student model;
//    StudentView view;
//
//    StudentController(Student model, StudentView view) {
//        this.model = model;
//        this.view = view;
//    }
//
//    public void updateView() {
//        view.showStudent(model.id, model.name);
//    }
//}

//  Main Class:
//public class MVCDemo {
//    public static void main(String[] args) {
//
//        Student model = new Student(1, "Ajay");
//        StudentView view = new StudentView();
//
//        StudentController controller =
//                new StudentController(model, view);
//
//        controller.updateView();
//    }
//}

//  Output:
//      Student ID: 1
//      Student Name: Ajay

//  REAL WORLD EXAMPLE:
//  MVC in real apps:
//      Layer	        Example
//      Model	        Database (MySQL table)
//      View	        UI (HTML page)
//      Controller	    API / Spring Boot logic

//  3. WHY DESIGN PATTERNS?
//      ✔ Code reuse
//      ✔ Easy maintenance
//      ✔ Scalable architecture
//      ✔ Industry standard (VERY IMPORTANT for interviews)

//  SIMPLE MEMORY TRICK:
//      Singleton → One object only
//      MVC → Split into 3 parts

//  FINAL SUMMARY
//  Singleton:
//      Only ONE object allowed
//  MVC:
//      Code split into Model, View, Controller

