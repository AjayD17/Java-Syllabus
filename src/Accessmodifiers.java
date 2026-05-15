//  Access Modifiers in Java:
//  Definition:
//      Access Modifiers are keywords used to control the visibility (scope) of classes, variables, and methods.

//  Types of Access Modifiers
//      Modifier	Same Class	Same Package	Different Package	Subclass
//      public	        Yes	        Yes	            Yes	                Yes
//      protected	    Yes	        Yes	            No	                Yes
//      default	        Yes	        Yes	            No	                No
//      private	        Yes	        No	            No	                No

//  1. Public
//  Definition:
//      Accessible from anywhere (any class, any package)

//  Example:
//package com.app;
//
//public class Test {
//    public void show() {
//        System.out.println("Public method");
//    }
//}
//
//  You can use this method in any package

//  Example: Your Class (Common for all programs):
//  publicaccess -> Main.java:
//package com.publicaccess;
//
//public class Main {
//    public void show() {
//        System.out.println("Public method");
//    }
//}


//  Example 1: Using in Another Class (Same Package)
//  publicaccess -> MainApp.java:
//package com.publicaccess;
//
//public class MainApp {
//    public static void main(String[] args) {
//        Main t = new Main();
//        t.show();
//    }
//}

//  ✔ Works because same package
//  ✔ Output: Public method

//  Example 2: Using in Different Package
//  main -> MainApps.java
//package com.main;
//
//import com.publicaccess.Main;
//
//public class MainApps {
//    public static void main(String[] args) {
//        Main t = new Main();
//        t.show();
//    }
//}

//  ✔ Works because method is public
//  ✔ This is what “access anywhere” means


//  2. Private
//  Definition:
//      Accessible only within the same class

//  Example: privateaccess -> Test.java
//  1. PRIVATE → INSIDE CLASS (Works):
//  Test.java
//package com.privateaccess;
//
//public class Test {
//
//    private void show() {
//        System.out.println("Private method working inside class");
//    }
//
//    public static void main(String[] args) {
//        Test t = new Test();
//        t.show();   // allowed (same class)
//    }
//}

//  Output:
//      Private method working inside class

//  2. PRIVATE → OUTSIDE CLASS (Not Works)
//  Test.java
//package com.privateaccess;
//
//public class Test {
//
//    private void show() {
//        System.out.println("Private method");
//    }
//}

//  MainApp.java
//package com.privateaccess;
//
//public class MainApp {
//    public static void main(String[] args) {
//        Test t = new Test();
//        t.show();   // ERROR
//    }
//}

//  Error You Will Get:
//      show() has private access in Test

//  This is final proof
//  Private method → outside class don't use.

//  3. OUTSIDE ACCESS (Correct Way):
//  Indirect: Private into the Public
//  Test.java
//package com.privateaccess;
//
//public class Test {
//
//    private void show() {
//        System.out.println("Private method");
//    }
//
//    public void access() {
//        show();  // inside call
//    }
//}

//  MainApp.java
//package com.privateaccess;
//
//public class MainApp {
//    public static void main(String[] args) {
//        Test t = new Test();
//        t.access();   // allowed
//    }
//}

//  Final Understanding:
//      Private = only inside class
//      Outside → direct access
//      Outside → indirect (via public method)

//  3. Protected
//  Definition:
//      Accessible:
//          Inside same package
//          Outside package only through inheritance

//  Protected works in BOTH cases, but with a condition:

//  Inside same package → ALWAYS works
//  Outside package → ONLY through inheritance
//  Outside package (without inheritance) → NOT allowed

//  Case 1: Same Package (Works)
//  Parent.java
//package com.app;
//
//public class Parent {
//    protected void show() {
//        System.out.println("Protected method");
//    }
//}

//  Test.java
//package com.app;
//
//public class Test {
//    public static void main(String[] args) {
//        Parent p = new Parent();
//        p.show();  // works (same package)
//    }
//}

//  Case 2: Different Package WITHOUT Inheritance (Fails)
//  MainApp.java
//package com.other;
//
//import com.app.Parent;
//
//public class MainApp {
//    public static void main(String[] args) {
//        Parent p = new Parent();
//        p.show();   // ERROR
//    }
//}

//  Error:
//      show() has protected access

//  Case 3: Different Package WITH Inheritance (Works)
//  Child.java
//package com.other;
//
//import com.app.Parent;
//
//public class Child extends Parent {   // Inheritance
//    public static void main(String[] args) {
//        Child c = new Child();
//        c.show();   // works (inheritance)
//    }
//}

//  Easy Understanding:
//          Situation	                            Works?
//          Same package	                        Yes
//      Different package + no inheritance	        No
//      Different package + inheritance	            Yes

//  4. Default (No keyword)
//  Definition:
//      Accessible only within same package

//  Default Access (No keyword):
//  Definition
//      If you don’t write any modifier → it is default access
//      Accessible only inside the same package

//  1. SAME PACKAGE (Works):
//  Test.java
//package com.defaultdemo;
//
//class Test {
//    void show() {
//        System.out.println("Default method working");
//    }
//}

//  MainApp.java
//package com.defaultdemo;
//
//public class MainApp {
//    public static void main(String[] args) {
//        Test t = new Test();
//        t.show();   // works (same package)
//    }
//}

//  Output:
//      Default method working

//  2. DIFFERENT PACKAGE (Not Works)
//  MainApp.java
//package com.other;
//
//import com.defaultdemo.Test;
//
//public class MainApp {
//    public static void main(String[] args) {
//        Test t = new Test();
//        t.show();   // ERROR
//    }
//}

//  Error:
//      Test is not public in com.defaultdemo
//      cannot be accessed from outside package

//      This proves:
//          default = only same package
//
//  Final Understanding:
//              Situation	            Works?
//              Same package	        Yes
//              Different package	    No

//  Easy Understanding (Real-life):
//          Modifier    	Meaning
//          public	        Everyone can see
//          private	        Only you
//          protected	    Family + inheritance
//          default	        Same group only

//  Access modifiers are used to control the visibility and accessibility of class members in Java.

