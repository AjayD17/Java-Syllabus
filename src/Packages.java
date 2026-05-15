//  1. What is a Package?
//      A Package is a collection of related classes and interfaces grouped together.

//      It helps to:
//          Organize code properly
//          Avoid name conflicts
//          Improve reusability

//  2. Types of Packages
//      1. Built-in Packages
//          These are already provided by Java.

//      Examples:
//          java.lang → Basic classes (String, Math)
//          java.util → Utilities (Scanner, ArrayList)
//          java.io → Input/Output classes


//  Example 1: java.lang → Basic classes (String, Math):
//  What is java.lang?
//      java.lang is a built-in package in Java
//      It is automatically imported (no need to write import)

//  Common Classes in java.lang:
//  (i). String: Used to handle text
//class StringExample {
//    public static void main(String[] args) {
//        String name = "Ajay";
//
//        System.out.println(name.length());     // length
//        System.out.println(name.toUpperCase()); // uppercase
//        System.out.println(name.charAt(0));     // first character
//    }
//}

//  Output:
//      4
//      AJAY
//      A

//  (ii). Math
//      Used for mathematical operations

//class MathExample {
//    public static void main(String[] args) {
//        System.out.println(Math.sqrt(25));   // square root
//        System.out.println(Math.pow(2, 3));  // power
//        System.out.println(Math.max(10, 20)); // max value
//    }
//}
//  Output:
//        5.0
//        8.0
//        20

//  (iii). System
//      Used for input/output

//class SystemExample {
//    public static void main(String[] args) {
//        System.out.println("Hello Java");
//    }
//}

//  4. Integer (Wrapper Class)
//      Used to convert and handle numbers

//class IntegerExample {
//    public static void main(String[] args) {
//        int num = Integer.parseInt("100"); // String → int
//        System.out.println(num + 50);
//    }
//}
//  Output:
//      150

//  5. Double
//class DoubleExample {
//    public static void main(String[] args) {
//        double d = Double.parseDouble("10.5");
//        System.out.println(d * 2);
//    }
//}
//  Output:
//        21.0

//  6. Character
//class CharacterExample {
//    public static void main(String[] args) {
//        System.out.println(Character.isDigit('5'));   // true
//        System.out.println(Character.isLetter('A'));  // true
//    }
//}

//  7. Boolean
//class BooleanExample {
//    public static void main(String[] args) {
//        boolean b = Boolean.parseBoolean("true");
//        System.out.println(b);
//    }
//}

//  8. Object (Super Class of all classes)
//class ObjectExample {
//    public static void main(String[] args) {
//        Object obj = "Hello";
//        System.out.println(obj.toString());
//    }
//}

//        |   Class   |       Purpose              |
//        | --------- | -------------------------- |
//        | String    | Text handling              |
//        | Math      | Mathematical operations    |
//        | System    | Output / system operations |
//        | Integer   | Integer wrapper            |
//        | Double    | Decimal wrapper            |
//        | Character | Character checking         |
//        | Boolean   | True/False handling        |
//        | Object    | Parent of all classes      |


//  Example 2: java.util → Utility Classes
//  1. java.util Package
//  Definition
//      java.util is a built-in package that provides utility classes for data structures, input handling, and date/time operations.

//      It is widely used for:
//        Taking input (Scanner)
//        Storing collections (ArrayList, HashMap)
//        Working with dates

//  Common Classes in java.util
//  (i). Scanner (User Input)
//import java.util.Scanner;
//
//public class ScannerExample {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter number:");
//        int num = sc.nextInt();
//
//        System.out.println("You entered: " + num);
//    }
//}
//  Output:
//      Enter number:
//          10
//      You entered: 10

//  2. ArrayList (Dynamic Array):
//import java.util.ArrayList;
//
//public class ArrayListExample {
//    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//
//        list.add("Java");
//        list.add("Python");
//
//        System.out.println(list);
//    }
//}
//  Output:
//        [Java, Python]

//  (iii). HashMap (Key-Value Storage)
//import java.util.HashMap;
//
//public class HashMapExample {
//    public static void main(String[] args) {
//        HashMap<Integer, String> map = new HashMap<>();
//
//        map.put(1, "Ajay");
//        map.put(2, "Kumar");
//
//        System.out.println(map);
//    }
//}

//  (iv). Collections (Utility Methods)
//import java.util.*;
//
//public class CollectionsExample {
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(30);
//        list.add(10);
//        list.add(20);
//
//        Collections.sort(list);
//
//        System.out.println(list);
//    }
//}
//  Output:
//        [10, 20, 30]

//  Summary (java.util):
//          Class	        Purpose
//          Scanner	        Input from user
//          ArrayList	    Dynamic array
//          HashMap	        Key-value pairs
//          Collections	    Utility operations


//  3. java.io Package:
//  Definition
//      java.io is a built-in package used for input and output operations, especially file handling.

//      It is used for:
//          Reading files
//          Writing files
//          Handling streams

//  Common Classes in java.io:
//  (i). File (Create File)
//import java.io.File;
//
//public class FileExample {
//    public static void main(String[] args) {
//        File f = new File("test.txt");
//
//        System.out.println("File name: " + f.getName());
//    }
//}

//  (ii). FileWriter (Write to File)
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class WriteExample {
//    public static void main(String[] args) throws IOException {
//        FileWriter fw = new FileWriter("test.txt");
//
//        fw.write("Hello Java");
//        fw.close();
//
//        System.out.println("Written successfully");
//    }
//}

//  (iii). FileReader (Read File)
//import java.io.FileReader;
//import java.io.IOException;
//
//public class ReadExample {
//    public static void main(String[] args) throws IOException {
//        FileReader fr = new FileReader("test.txt");
//
//        int ch;
//        while((ch = fr.read()) != -1) {
//            System.out.print((char) ch);
//        }
//
//        fr.close();
//    }
//}
//  Output:
//      Hello Java

//  (iv). BufferedReader (Efficient Reading)
//import java.io.*;
//
//public class BufferExample {
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
//
//        String line = br.readLine();
//        System.out.println(line);
//
//        br.close();
//    }
//}

//  Summary (java.io):
//          Class	        Purpose
//          File	        Create/manage files
//          FileWriter	    Write data to file
//          FileReader	    Read data from file
//          BufferedReader	Efficient reading


//  2. User-Defined Package
//  Definition:
//      A user-defined package is a package created by the programmer to organize classes.

//  Example 1: Without Package (Works Perfectly)
//class Testing {
//    void show() {
//        System.out.println("Hello");
//    }
//
//    public static void main(String[] args) {
//        Testing t = new Testing();
//        t.show();
//    }
//}
//
//  This runs without any package
//  User-defined method show() works

//  Example 2:  WITH Package (Also works):
//  Example (i):
//package com.app;
//
//class Test {
//    void show() {
//        System.out.println("Hello");
//    }
//
//    public static void main(String[] args) {
//        Test t = new Test();
//        t.show();
//    }
//}
//  Same output
//  Package doesn’t affect method usage

//  What Package Actually Does?
//  Package is used to:
//      Organize classes
//      Avoid naming conflicts
//      Improve project structure

//  NOT for:
//      Creating methods
//      Running methods

//        | Concept |  Needed?  |
//        | ------- | --------- |
//        | Class   |  Required |
//        | Method  |  Required |
//        | Package |  Optional |
//

//  Simple Package Names:
//      package student;
//      package employee;
//      package banking;
//      package library;
//      package hospital;
//      package school;
//      package shopping;

//  Two-Level Packages:
//      package college.student;
//      package school.teacher;
//      package office.staff;
//      package shop.billing;
//      package hospital.doctor;

//  Professional Style (Recommended):
//      package com.ajay.app;
//      package com.ajay.project;
//      package com.company.hr;
//      package com.company.payroll;
//      package com.company.employee;

//  Based on Features / Modules:
//      package com.app.login;
//      package com.app.register;
//      package com.app.database;
//      package com.app.services;
//      package com.app.utils;

//  Multi-Level (Real Project Structure):
//      package com.ajay.ecommerce.user;
//      package com.ajay.ecommerce.product;
//      package com.ajay.ecommerce.order;
//      package com.ajay.ecommerce.payment;
//      package com.ajay.ecommerce.delivery;

//  Utility / Helper Packages:
//      package com.app.util;
//      package com.app.helper;
//      package com.app.common;
//      package com.app.config;

//  Rules (Don’t Forget):
//      Use lowercase only
//      No spaces
//      Use . for levels
//      Must match folder structure

//  Wrong Examples
//      package MyPackage;    // ❌ uppercase
//      package 123app;       // ❌ starts with number
//      package my package;   // ❌ space

//  More examples:
//  Example 1: Student Package
//  Student.java:
//package com.college;
//
//public class Student {
//    String name = "Ajay";
//    int age = 20;
//
//    public void show() {
//        System.out.println(name + " " + age);
//    }
//}

//  MainApp.java
//package com.college;
//
//public class MainApp {
//    public static void main(String[] args) {
//        Student s = new Student();
//        s.show();
//    }
//}

//  Example 2:
//  Calculator.java
//package com.calc;
//
//public class Calculator {
//    public int add(int a, int b) {
//        return a + b;
//    }
//}

//  MainApp.java
//package com.calc;
//
//public class MainApp {
//    public static void main(String[] args) {
//        Calculator c = new Calculator();
//        System.out.println("Sum: " + c.add(10, 20));
//    }
//}

//  Example 3: Multi-Level Package
//  Helper.java
//package com.app.util;
//
//public class Helper {
//    public void help() {
//        System.out.println("Helping...");
//    }
//}

//  MainApp.java
//package com.app.main;
//
//import com.app.util.Helper;
//
//public class MainApp {
//    public static void main(String[] args) {
//        Helper h = new Helper();
//        h.help();
//    }
//}

//  Example 4: Employee Package (Real-time Style)
//  Employee.java
//package com.company.employee;
//
//public class Employee {
//    int id = 101;
//    String name = "Ajay";
//
//    public void display() {
//        System.out.println(id + " " + name);
//    }
//}

//  MainApp.java
//package com.company.main;
//
//import com.company.employee.Employee;
//
//public class MainApp {
//    public static void main(String[] args) {
//        Employee e = new Employee();
//        e.display();
//    }
//}

