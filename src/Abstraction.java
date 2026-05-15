//  1. Abstraction
//  Definition
//      Abstraction is the process of hiding implementation details and showing only the essential features to the user.

//      “What to do” is shown, not “How to do”

//  2. Abstract Class
//  Definition
//      An abstract class is a class that:
//          Cannot be instantiated ❌
//          Can have abstract methods (no body)
//          Can also have normal methods (with body)

//  Example 1: Abstract Class
//abstract class Animal {
//
//    // abstract method (no body)
//    abstract void sound();
//
//    // normal method
//    void sleep() {
//        System.out.println("Animal is sleeping");
//    }
//}
//
//class Dog extends Animal {
//
//    void sound() {
//        System.out.println("Dog barks");
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        Animal a = new Dog();
//
//        a.sound();
//        a.sleep();
//    }
//}

//  Output:
//      Dog barks
//      Animal is sleeping

//  Key Points
//      abstract method → must be overridden
//      Abstract class → can have both abstract + normal methods

//  3. Interface
//  Definition
//      An interface is a blueprint of a class that contains:
//          Only abstract methods (by default)
//          All methods are public + abstract
//          Supports multiple inheritance

//  Example 2: Interface
//interface Animal {
//    void sound();  // abstract by default
//}
//
//class Dog implements Animal {
//    public void sound() {
//        System.out.println("Dog barks");
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        Animal a = new Dog();
//        a.sound();
//    }
//}

//  Output: Dog barks

//  Example 4: Multiple Inheritance using Interface
//interface A1 {
//    void show();
//}
//
//interface B1 {
//    void display();
//}
//
//class Demo implements A1, B1 {
//
//    public void show() {
//        System.out.println("Show method");
//    }
//
//    public void display() {
//        System.out.println("Display method");
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        Demo d = new Demo();
//        d.show();
//        d.display();
//    }
//}

//  Output:
//      Show method
//      Display method

//  5. Real-Time Example (Vehicle):
abstract class Vehicle {

    abstract void start();

    void fuel() {
        System.out.println("Fuel is required");
    }
}

class Bikes extends Vehicle {

    void start() {
        System.out.println("Bike starts with kick");
    }
}

class Tests {
    public static void main(String[] args) {
        Vehicle v = new Bikes();

        v.start();
        v.fuel();
    }
}


//  Output:
//      Bike starts with kick
//      Fuel is required


//  6. Abstract vs Interface (Difference):
//        | Feature     | Abstract Class         | Interface                |
//        | ----------- | ---------------------- | ------------------------ |
//        | Methods     | Abstract + Normal      | Only abstract (default)  |
//        | Variables   | Can have instance vars | Only public static final |
//        | Inheritance | Single                 | Multiple                 |
//        | Keyword     | `extends`              | `implements`             |


//  Notes:
//      Abstract = partial abstraction
//      Interface = full abstraction




