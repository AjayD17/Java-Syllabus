//  Inheritance in Java
//  Definition:
//      Inheritance is a mechanism where one class (child/subclass) acquires the properties and behaviors of another class (parent/superclass).

//      It helps in:
//          Code reuse.
//          Reducing duplication.
//          Creating relationships between classes.

//  Syntax:
//class Parent {
//}
//
//class Child extends Parent {
//}

//  extends keyword is used


//  1. Single Inheritance
//  Definition:
//      One child class inherits from one parent class.

//  Example:
//class Animal {
//    void eat() {
//        System.out.println("Animal eats");
//    }
//}
//
//class Dog extends Animal {
//    void bark() {
//        System.out.println("Dog barks");
//    }
//}
//
//class single {
//    public static void main(String[] args) {
//        Dog d = new Dog();
//        d.eat();   // inherited
//        d.bark();  // own
//    }
//}

//  Output:
//      Animal eats
//      Dog barks


//  2. Multilevel Inheritance
//  Definition:
//      A class inherits from a class, which is already inherited from another class.

//  Example:
//class Animal {
//    void eat() {
//        System.out.println("Animal eats");
//    }
//}
//
//class Dog extends Animal {
//    void bark() {
//        System.out.println("Dog barks");
//    }
//}
//
//class Puppy extends Dog {
//    void weep() {
//        System.out.println("Puppy weeps");
//    }
//}
//
//class multilevel {
//    public static void main(String[] args) {
//        Puppy p = new Puppy();
//        p.eat();
//        p.bark();
//        p.weep();
//    }
//}

//  Output:
//      Animal eats
//      Dog barks
//      Puppy weeps


//  3. Hierarchical Inheritance
//  Definition:
//      Multiple child classes inherit from one parent class.

//  Example:
//class Animal {
//    void eat() {
//        System.out.println("Animal eats");
//    }
//}
//
//class Dog extends Animal {
//    void bark() {
//        System.out.println("Dog barks");
//    }
//}
//
//class Cat extends Animal {
//    void meow() {
//        System.out.println("Cat meows");
//    }
//}
//
//class Maintaining {
//    public static void main(String[] args) {
//        Dog d = new Dog();
//        d.eat();
//        d.bark();
//
//        Cat c = new Cat();
//        c.eat();
//        c.meow();
//    }
//}

//  Output:
//      Animal eats
//      Dog barks
//      Animal eats
//      Cat meows


//  4. Multiple Inheritance (Important):
//  Definition:
//      A class inherits from more than one class
//      Java does NOT support this using classes

//  Example (Not allowed):
//class A {}
//class B {}
//
//class C extends A, B { }      // Error

//  Solution:
//      Use interfaces (advanced topic)

//  Interface Definition:
//      An interface is a blueprint that contains only method declarations (what to do), not full implementation.

//  Key Points
//      Methods → by default abstract
//      Variables → public static final (constants)
//      Cannot create object directly ❌
//      Class must use implements keyword ✔

//  Simple Meaning:
//      Interface = “WHAT to do”
//      Class     = “HOW to do”

// Example:
//interface Animal {
//    void sound();   // only declaration
//}
//
//class Dog implements Animal {
//    public void sound() {
//        System.out.println("Dog barks");
//    }
//}
//
//class basicexamples {
//    public static void main(String[] args) {
//        Dog d = new Dog();
//        d.sound();
//    }
//}

//  Output: Dog barks.

// Explanation Flow:
//      Step 1:
//  interface Animal → method defined (no body)
//
//      Step 2:
//  class Dog implements Animal
//      → must override sound()
//
//      Step 3:
//  main method → object create
//
//      Step 4:
//  method call → output

//  Types of Methods in Interface:
//        |   Type   | Description              |
//        | -------- | ------------------------ |
//        | Abstract | default method (no body) |
//        | Default  | has body (Java 8+)       |
//        | Static   | has body (Java 8+)       |

// Notes:
//        |             Case            | Allowed? |
//        | --------------------------- | -------- |
//        | Direct `System.out.println` | ❌ No    |
//        | Abstract method             | ✔ Yes    |
//        | Default method              | ✔ Yes    |
//        | Static method               | ✔ Yes    |

//  Interface Method Types in Java
//  1. Abstract Method
//  Definition:
//      An abstract method in an interface has no body (no implementation).
//      The class that implements the interface must provide the implementation.

//  Example:
//interface Animal {
//    void sound();   // abstract method (no body)
//}
//
//class Dog implements Animal {
//    public void sound() {
//        System.out.println("Dog barks");
//    }
//}
//
//class Mainsss {
//    public static void main(String[] args) {
//        Dog d = new Dog();
//        d.sound();
//    }
//}

//  Output:
//      Dog barks

//
//  2. Default Method (Java 8+)
//  Definition:
//      A default method has a body inside the interface.
//      It is optional to override in the implementing class.

//  Example:
//interface Animal {
//    default void sound() {
//        System.out.println("Animal makes sound");
//    }
//}
//
//class Dog implements Animal {
//    // No need to override (optional)
//}
//
//class Maint {
//    public static void main(String[] args) {
//        Dog d = new Dog();
//        d.sound();
//    }
//}

//  Output:
//      Animal makes sound


//  3. Static Method (Java 8+)
//  Definition:
//      A static method in an interface has a body and is called using the interface name, not the object.

//  Example:
//interface Animal {
//    static void info() {
//        System.out.println("This is an animal interface");
//    }
//}
//
//class Maini {
//    public static void main(String[] args) {
//        Animal.info();   // call using interface name
//    }
//}

//  Output:
//      This is an animal interface

//  Differences:
//        | Type     | Body  | Override | How to Call    |
//        | -------- | ----- | --------  | -------------- |
//        | Abstract | ❌ No | ✔ Must   | Object         |
//        | Default  | ✔ Yes | Optional | Object         |
//        | Static   | ✔ Yes | ❌ No    | Interface name |


//        | Type     | Print inside Interface | Print in Class         |
//        | -------- | ---------------------- | ---------------------- |
//        | Abstract | ❌ No                  | ✔ Yes                  |
//        | Default  | ✔ Yes                  | ✔ Yes                  |
//        | Static   | ✔ Yes                  | ❌ (call via interface)|


// Example: Multiple Inheritance
//interface X {
//    void showA();
//}
//
//interface Y {
//    void showB();
//    // System.out.println("Hai")    // Error
//}
//
//class C implements X, Y {
//
//    public void showA() {
//        System.out.println("From A");
//    }
//
//    public void showB() {
//        System.out.println("From B");
//    }
//}
//
//class multiple {
//    public static void main(String[] args) {
//        C obj = new C();
//
//        obj.showA();
//        obj.showB();
//    }
//}


//  Hybrid Inheritance in Java
//  Definition:
//      Hybrid inheritance is a combination of two or more types of inheritance (such as multilevel + hierarchical + multiple).

//  In simple terms:
//      A class structure that mixes different inheritance patterns.

//  Important Point:
//      Java does NOT support hybrid inheritance using classes alone
//      It is achieved using a combination of class (extends) and interface (implements)

//  Simple Idea
//      Hybrid = Mix of inheritance types

//  Example (Hybrid Inheritance using Class + Interface):
//  Code:
//class Animal {
//    void eat() {
//        System.out.println("Animal eats");
//    }
//}
//
//// Interface
//interface Pet {
//    void play();
//}
//
//// Child class (Multilevel + Multiple combination)
//class Dog extends Animal implements Pet {
//    public void play() {
//        System.out.println("Dog plays");
//    }
//}
//
//// Another child (Hierarchical)
//class Cat extends Animal implements Pet {
//    public void play() {
//        System.out.println("Cat plays");
//    }
//}
//
//class Maino {
//    public static void main(String[] args) {
//
//        Dog d = new Dog();
//        d.eat();   // from Animal
//        d.play();  // from Pet
//
//        Cat c = new Cat();
//        c.eat();
//        c.play();
//    }
//}

//  Output:
//      Animal eats
//      Dog plays
//      Animal eats
//      Cat plays

//  Diagram (Visual)
//        Animal
//        /   \
//      Dog    Cat
//       \     /
//    Pet (interface)

//  Explanation
//      Animal → base class
//      Pet → interface (rule)
//      Dog & Cat:
//      inherit from class (extends)
//      implement interface (implements)

//  So:
//      Multilevel + Hierarchical + Multiple = Hybrid


//  Another Simple Hybrid Example
//interface A {
//    void showA();
//}
//
//interface B {
//    void showB();
//}
//
//class C implements A {
//    public void showA() {
//        System.out.println("A method");
//    }
//}
//
//class D extends C implements B {
//    public void showB() {
//        System.out.println("B method");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        D obj = new D();
//
//        obj.showA();
//        obj.showB();
//    }
//}
//  Output:
//      A method
//      B method


//  Final Summary
//      Feature	        Hybrid Inheritance
//      Meaning	        Combination of inheritance types
//      Java Support	Not directly (classes only)
//      Solution	    ✔ Use interfaces
//      Keywords	    extends + implements

