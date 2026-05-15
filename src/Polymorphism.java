//  Polymorphism in Java
//  Definition
//      Polymorphism is a concept in Object-Oriented Programming (OOP) where a single object or method can perform different tasks based on the context.
//      Eg: "One name, many forms"

//  Types of Polymorphism
//      1. Compile-Time Polymorphism (Static Polymorphism)
//          Achieved using Method Overloading

//  Definition
//      Method Overloading means having multiple methods with the same name but different parameters (type, number, or order).

//  Example 1: Different Number of Parameters.
//class Demos {
//    void shows(int a) {
//        System.out.println("One parameter: " + a);
//    }
//
//    void shows(int a, int b) {
//        System.out.println("Two parameters: " + (a + b));
//    }
//
//    public static void main(String[] args) {
//        Demos d = new Demos();
//        d.shows(10);
//        d.shows(10, 20);
//    }
//}

// Example 2: Different Data Types
//class Demo {
//    void print(int a) {
//        System.out.println("Integer: " + a);
//    }
//
//    void print(double a) {
//        System.out.println("Double: " + a);
//    }
//
//    public static void main(String[] args) {
//        Demo d = new Demo();
//        d.print(5);
//        d.print(5.5);
//    }
//}

// Example 3: Different Order of Parameters
//class Demo {
//    void display(int a, String b) {
//        System.out.println("Int + String");
//    }
//
//    void display(String b, int a) {
//        System.out.println("String + Int");
//    }
//
//    public static void main(String[] args) {
//        Demo d = new Demo();
//        d.display(10, "Hello");
//        d.display("Hi", 20);
//    }
//}

// Example 4: Real-Time Example (Calculator)
//class Calculator {
//
//    int multiply(int a, int b) {
//        return a * b;
//    }
//
//    double multiply(double a, double b) {
//        return a * b;
//    }
//
//    int multiply(int a, int b, int c) {
//        return a * b * c;
//    }
//
//    public static void main(String[] args) {
//        Calculator c = new Calculator();
//
//        System.out.println(c.multiply(2, 3));
//        System.out.println(c.multiply(2.5, 3.5));
//        System.out.println(c.multiply(2, 3, 4));
//    }
//}

// Example 5: Constructor Overloading
//class Student {
//    String name;
//    int age;
//
//    Student() {
//        name = "Unknown";
//        age = 0;
//    }
//
//    Student(String n) {
//        name = n;
//    }
//
//    Student(String n, int a) {
//        name = n;
//        age = a;
//    }
//
//    void display() {
//        System.out.println(name + " " + age);
//    }
//
//    public static void main(String[] args) {
//        Student s1 = new Student();
//        Student s2 = new Student("Ajay");
//        Student s3 = new Student("Ajay", 20);
//
//        s1.display();
//        s2.display();
//        s3.display();
//    }
//}

// Example 6: Static Method Overloading
//class Demo {
//
//    static void greet() {
//        System.out.println("Hello");
//    }
//
//    static void greet(String name) {
//        System.out.println("Hello " + name);
//    }
//
//    public static void main(String[] args) {
//        greet();
//        greet("Ajay");
//    }
//}

// Example 7: Type Promotion
//class Demo {
//
//    void show(int a) {
//        System.out.println("int method");
//    }
//
//    void show(double a) {
//        System.out.println("double method");
//    }
//
//    public static void main(String[] args) {
//        Demo d = new Demo();
//        d.show(5);     // int
//        d.show(5.5);   // double
//    }
//}

//  Key Points:
//      Same method name ✔
//      Different parameters ✔
//      Happens at compile time ✔


//  2. Runtime Polymorphism (Dynamic Polymorphism)
//      Achieved using Method Overriding

//  Definition
//      Method Overriding means a child class provides a specific implementation of a method already defined in the
//      parent class.

//  Example: Basic Overriding
//class Animal {
//    void sound() {
//        System.out.println("Animal sound");
//    }
//}
//
//class Dog extends Animal {
//    @Override
//    void sound() {
//        System.out.println("Dog barks");
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        Animal a = new Dog();
//        a.sound();   // Dog barks
//    }
//}

// Example 2: Multiple Child Classes
//class Animal {
//    void sound() {
//        System.out.println("Animal sound");
//    }
//}
//
//class Dog extends Animal {
//    void sound() {
//        System.out.println("Dog barks");
//    }
//}
//
//class Cat extends Animal {
//    void sound() {
//        System.out.println("Cat meows");
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//
//        Animal a;
//
//        a = new Dog();
//        a.sound();
//
//        a = new Cat();
//        a.sound();
//    }
//}

// Example 3: Real-Time Example (Payment System)
//class Payment {
//    void pay() {
//        System.out.println("Processing payment");
//    }
//}
//
//class UPI extends Payment {
//    void pay() {
//        System.out.println("UPI payment");
//    }
//}
//
//class Card extends Payment {
//    void pay() {
//        System.out.println("Card payment");
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//
//        Payment p;
//
//        p = new UPI();
//        p.pay();
//
//        p = new Card();
//        p.pay();
//    }
//}

// Example 4: Method Call Via Function
//class Animal {
//    void sound() {
//        System.out.println("Animal sound");
//    }
//}
//
//class Dog extends Animal {
//    void sound() {
//        System.out.println("Dog barks");
//    }
//}
//
//class Test {
//
//    static void makeSound(Animal a) {
//        a.sound();
//    }
//
//    public static void main(String[] args) {
//        makeSound(new Dog());
//    }
//}

// Example 5: Run Time Polymorphism with Loop
//class Animal {
//    void sound() {
//        System.out.println("Animal sound");
//    }
//}
//
//class Dog extends Animal {
//    void sound() {
//        System.out.println("Dog barks");
//    }
//}
//
//class Cat extends Animal {
//    void sound() {
//        System.out.println("Cat meows");
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//
//        Animal[] arr = { new Dog(), new Cat() };
//
//        for (Animal a : arr) {
//            a.sound();
//        }
//    }
//}

// Example 6: Method Overriding with super
//class Animal {
//    void sound() {
//        System.out.println("Animal sound");
//    }
//}
//
//class Dog extends Animal {
//    void sound() {
//        super.sound(); // calling parent
//        System.out.println("Dog barks");
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        Dog d = new Dog();
//        d.sound();
//    }
//}

// Example 7: Final Method
//class Animal {
//    void sound() {
//        System.out.println("Animal sound");
//    }
//}
//
//class Dog extends Animal {
//    void sound() {
//        super.sound(); // calling parent
//        System.out.println("Dog barks");
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        Dog d = new Dog();
//        d.sound();
//    }
//}

// Note: final → overriding NOT allowed

//  Key Points:
//      Same method name ✔
//      Same parameters ✔
//      Different implementation ✔
//      Decided at runtime ✔


//  Final Summary Table
//                  Type	        Technique	        Time	    Example
//      Compile-Time Polymorphism	Overloading	    Compile time	add() methods
//          Runtime Polymorphism	Overriding	    Runtime	        sound() methods


//  Simple Line to Remember:
//      Overloading → Compile Time
//      Overriding → Runtime

