//  TYPE CASTING:
//  Definition:
//      Type Casting is the process of converting a value from one data type to another.
//      “One type → another type conversion”
//
//  Types of Type Casting:
//      1. Implicit Type Casting (Widening)
//
//  Definition:
//      Conversion from a smaller data type to a larger data type
//      Done automatically by Java (no manual effort required)
//
// Flow: byte → short → int → long → float → double
//
//  Example:
class TypeCastingDemo1 {
    public static void main(String[] args) {

        // Implicit Type Casting (Widening)
        int a = 10;
        double b = a;  // int → double (automatic)

        // Output
        System.out.println("Value of a (int): " + a);
        System.out.println("Value of b (double): " + b);
    }
}

//  Key Points:
//      No data loss
//      Automatic conversion
//      Safe
//
//  2. Explicit Type Casting (Narrowing)
//  Definition:
//      Conversion from a larger data type to a smaller data type
//      Must be done manually by the programmer
//
// Example:
class TypeCastingDemo2 {
    public static void main(String[] args) {

        // Explicit Type Casting (Narrowing)
        double a = 5.6;
        int b = (int) a;  // double → int

        System.out.println("Original value (double): " + a);
        System.out.println("After casting to int: " + b);
    }
}

//  Key Points:
//      Data loss possible
//      Manual conversion required
//      Not always safe

//  Real-Time Example:
class TypeCastingDemo3 {
    public static void main(String[] args) {

        // Implicit Type Casting (Widening)
        int marks = 95;
        double percentage = marks;   // int → double (automatic)

        // Explicit Type Casting (Narrowing)
        double price = 99.99;
        int roundedPrice = (int) price;  // double → int (manual)

        // Output
        System.out.println("Percentage: " + percentage);
        System.out.println("Rounded Price: " + roundedPrice);
    }
}

//  Final Summary:
//        | Type     | Conversion  | Done By    | Data Loss |
//        | -------- | ----------- | ---------- | --------- |
//        | Implicit | small → big | Java       | No        |
//        | Explicit | big → small | Programmer | Yes       |


//  One-line Memory Trick:
//      Implicit = Automatic (Safe)
//      Explicit = Manual (Careful)


//  How to Check Type in Java ?
//  Example1: Primitive Data Types
class TypeCheckDemo4 {
    public static void main(String[] args) {

        int a = 10;

        // Type checking using wrapper (auto-boxing)
        System.out.println(((Object) a).getClass().getSimpleName());
    }
}

// Output: Integer

// Notes:
//      For primitive data types (int, float, etc.):
//      You cannot use getClass() directly.
//      So, you need to convert it into an Object (auto-boxing) first .


// Example2: (Auto-boxing + Type Check)
class AutoBoxingDemo {
    public static void main(String[] args) {

        // Primitive data type
        int a = 10;

        // Auto-boxing (int → Integer object)
        Integer obj = a;

        // Output
        System.out.println("Primitive value (int): " + a);
        System.out.println("Object value (Integer): " + obj);

        // Type checking
        System.out.println("Type of obj: " + obj.getClass().getSimpleName());
    }
}

// Output:
//      Primitive value (int): 10
//      Object value (Integer): 10
//      Type of obj: Integer


//  Example1: Non-Primitive (Objects)
class TypeCheckDemo5 {
    public static void main(String[] args) {

        String name = "Ajay";

        System.out.println("Value: " + name);
        System.out.println("Type: " + name.getClass().getSimpleName());
        System.out.println("Full Class: " + name.getClass());
        // System.out.println(name.getSimpleName());    [getSimpleName() cannot be used directly — it must be used with getClass()]
    }
}

// Output:
//      Value: Ajay
//      Type: String
//      Full Class: class java.lang.String

//  Notes:
//      name.getClass() → returns class info
//      .getSimpleName() → gives only class name (String)

// One-line:
//      getClass().getSimpleName() = type name printed.


//  Example2: Array Type
class ArrayTypeDemo {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        // Full class name
        System.out.println(arr.getClass());

        // Simple class name
        System.out.println(arr.getClass().getSimpleName());
    }
}

// Output:
//      class [I
//      [I


// Example3: instanceof Example
class TypeCheckDemo6 {
    public static void main(String[] args) {

        String name = "Ajay";

        if (name instanceof String) {
            System.out.println("It is a String");
        } else {
            System.out.println("It is NOT a String");
        }
    }
}

// Output:
//      It is a String


// Example4: instanceof Example
//class Demo1 {
//    public static void main(String[] args) {
//
//        String name = "Ajay";
//
//        if (name instanceof Integer) {
//            System.out.println("It is Integer");
//        } else {
//            System.out.println("It is NOT Integer");
//        }
//    }
//}

// Notes:
//    Not allowed: String ↔ Integer (no relation)


// Example5: instanceof Example
class Demo2 {
    public static void main(String[] args) {

        Object name = "Ajay";  // ✔ change to Object

        if (name instanceof Integer) {
            System.out.println("It is Integer");
        } else {
            System.out.println("It is NOT Integer");
        }
    }
}


// Output:
//      It is NOT Integer


//  Simple Comparison:
//        | Language   | Type Check                  |
//        | ---------- | --------------------------- |
//        | Python     | `type(x)`                   |
//        | JavaScript | `typeof x`                  |
//        | Java       | `getClass()` / `instanceof` |

