//  Class & Object in Java (OOP Concept)
//  1. What is a Class?
//      Definition:
//          A class is a blueprint (design/template) used to create objects.
//          It defines properties (variables) and behaviors (methods).

//      Real-world meaning:
//          Class = Plan / Design of a thing

//  Example (Class = Car design):
//  A car design contains:
//      color
//      model
//      speed
//      drive method

//  Class Example:
class Car {

    // properties (variables)
    String color;
    String model;
    int speed;

    // method (behavior)
    void drive() {
        System.out.println("Car is driving");
    }
}


//  2. What is an Object?
//      Definition:
//          An object is a real-world instance of a class.
//          It is created using the new keyword.

//  Real-world meaning:
//      Class = blueprint
//          Object = actual car built using blueprint

//  Object Example:
//class objects {
//    public static void main(String[] args) {
//
//        Car c1 = new Car();
//
//        c1.color = "Red";
//        c1.model = "BMW";
//        c1.speed = 120;
//
//        System.out.println(c1.color);
//        System.out.println(c1.model);
//        System.out.println(c1.speed);
//
//        c1.drive();
//    }
//}

//  Output:
//      Red
//      BMW
//      120
//      Car is driving


//  3. Class vs Object
//          Class	                    Object
//          Blueprint	                Real thing
//          Design	                    Instance
//          No memory	                Memory allocated
//          Example: Car design	        Example: Your BMW car


//  4. Real-Life Analogy (Very Important)
//  Example: House
//      Blueprint = Class
//      Built house = Object

//  Same blueprint → many houses
//  Same class → many objects


//  5. Multiple Objects Example
//class Mainss {
//    public static void main(String[] args) {
//
//        Car c1 = new Car();
//        Car c2 = new Car();
//
//        c1.color = "Red";
//        c2.color = "Blue";
//
//        System.out.println(c1.color);
//        System.out.println(c2.color);
//    }
//}
//  Output:
//      Red
//      Blue


//  6. Key Concepts Inside Class
//  Variables (State)
//      color
//      speed

//  Methods (Behavior)
//      drive()
//      brake()


//  7. Notes:
//      Class → loaded once
//      Object → stored in Heap memory
//      Each object has separate memory

//  Final Simple Understanding
//      Class = design / blueprint
//      Object = real thing made from that design
//      Object = created using new
//

