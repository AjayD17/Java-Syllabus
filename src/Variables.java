//  1. WHAT IS A VARIABLE?
//      A variable is a named memory location used to store data temporarily in a program.

//  Java ideology:
//      Data stored the container
//      Value can change during execution
//      Strongly typed (type must be declared)

//  2. TYPES OF VARIABLES
//      Java has 3 types of variables:

//  (1) LOCAL VARIABLE
//  Definition:
//      A variable declared inside a method, constructor, or block.

//  Key Points:
//      Only inside that block
//      Must be initialized before use
//      Memory allocated when method runs

//  Example:
//class LocalVariableDemo {
//    public static void main(String[] args) {
//
//        // Example: Local Variable
//        int localVar = 10; // declared inside method
//
//        System.out.println("Local Variable Value: " + localVar);
//    }
//}

//  (2) INSTANCE VARIABLE
//  Definition:
//      A variable declared inside a class but outside methods.

//  Key Points:
//      Belongs to object (instance)
//      Each object has its own copy
//      Default values are assigned automatically

//💡 Example:
class InstanceVariableDemo {

    // Example: Instance Variable
    int instanceVar = 100;

    public void show() {
        System.out.println("Instance Variable Value: " + instanceVar);
    }

    public static void main(String[] args) {

        InstanceVariableDemo obj = new InstanceVariableDemo();
        obj.show();
    }
}

//  (3) STATIC VARIABLE
//  Definition:
//      A variable declared using static keyword inside a class.

//  Key Points:
//      Shared among all objects
//      Memory allocated only once
//      Class level variable

//  Example:
class StaticVariableDemo {

    // Example: Static Variable
    static int staticVar = 50;

    public static void main(String[] args) {

        System.out.println("Static Variable Value: " + staticVar);
    }
}

//  Comparison:
//        | Type     | Scope        | Memory      | Shared |
//        | -------- | ------------ | ----------- | ------ |
//        | Local    | Method only  | Stack       | No     |
//        | Instance | Object level | Heap        | No     |
//        | Static   | Class level  | Method Area | Yes    |

//  FINAL COMBINED PROGRAM:
//  Example:
class VariableDemo {

    // Example: Static Variable
    static int staticVar = 50;

    // Example: Instance Variable
    int instanceVar = 100;

    public void display() {

        // Example: Local Variable
        int localVar = 10;

        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {

        // Creating object
        VariableDemo obj = new VariableDemo();

        // Calling method
        obj.display();
    }
}

