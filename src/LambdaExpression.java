//  1. Lambda Expression (Java 8)
//  Definition:
//      A Lambda expression is a short way to write a function (method) without creating a full class.

//      ✔ Used with functional interfaces
//      ✔ Makes code shorter + cleaner
//      ✔ Replaces anonymous inner classes

//  Syntax:
//      (parameters) -> { body }

//  Example 1: Simple Lambda
//interface Greeting {
//    void sayHello();
//}
//
//class LambdaDemo {
//    public static void main(String[] args) {
//
//        Greeting g = () -> {
//            System.out.println("Hello Ajay!");
//        };
//
//        g.sayHello();
//    }
//}

//  Output:
//      Hello Ajay!

//  Example 2: Lambda with parameter
//interface Add {
//    int sum(int a, int b);
//}
//
//class LambdaDemo {
//    public static void main(String[] args) {
//
//        Add add = (a, b) -> a + b;
//
//        System.out.println(add.sum(10, 20));
//    }
//}

//  Output:
//      30

//  Without Lambda (Old way):
//Add add = new Add() {
//    public int sum(int a, int b) {
//        return a + b;
//    }
//};

//  Lambda reduces 5 lines → 1 line

//  2. Streams (Java 8)
//  Definition:
//      A Stream is a pipeline to process collections (like List, Array) in a functional way.

//      ✔ No manual loops
//      ✔ Works like a pipeline
//      ✔ Supports filtering, mapping, sorting

//  Stream Flow:
//      Collection → Stream → Operations → Result

//  Example 1: Filter even numbers
//import java.util.*;
//
//class StreamDemo {
//    public static void main(String[] args) {
//
//        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
//
//        numbers.stream()
//                .filter(n -> n % 2 == 0)
//                .forEach(n -> System.out.println(n));
//    }
//}

//  Output:
//      10
//      20
//      30

//  Example 2: Map (transform data)
//import java.util.*;
//
//public class StreamDemo {
//    public static void main(String[] args) {
//
//        List<String> names = Arrays.asList("ajay", "kumar", "ram");
//
//        names.stream()
//                .map(n -> n.toUpperCase())
//                .forEach(System.out::println);
//    }
//}

//  Output:
//      AJAY
//      KUMAR
//      RAM

//  Example 3: Sorting using Stream
//import java.util.*;
//
//public class StreamDemo {
//    public static void main(String[] args) {
//
//        List<Integer> list = Arrays.asList(50, 10, 40, 20);
//
//        list.stream()
//                .sorted()
//                .forEach(System.out::println);
//    }
//}

//  Output:
//        10
//        20
//        40
//        50

//  Example 4: Count elements
//import java.util.*;
//
//public class StreamDemo {
//    public static void main(String[] args) {
//
//        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
//
//        long count = list.stream()
//                .filter(n -> n > 20)
//                .count();
//
//        System.out.println(count);
//    }
//}

//  Output:
//        3

//  3. Lambda vs Streams Difference
//          Lambda	            Streams
//          Single function	    Collection processing
//          Small logic	        Pipeline operations
//          Used in interfaces	Used in collections

//  4. Real Life Analogy
//  Lambda:
//      “Single instruction”

//  Example:
//      Add two numbers
//      Print message

//  Streams:
//      “Factory assembly line”

//  Example:
//      Filter products
//      Sort items
//      Transform data

//  5. Combined Example (Real Power)
//import java.util.*;
//
//public class CombinedDemo {
//    public static void main(String[] args) {
//
//        List<String> names = Arrays.asList("ajay", "arun", "kumar", "ram");
//
//        names.stream()
//                .filter(n -> n.startsWith("a"))
//                .map(n -> n.toUpperCase())
//                .sorted()
//                .forEach(System.out::println);
//    }
//}

//  Output:
//      AJAY
//      ARUN

//  FINAL SUMMARY
//  Lambda:
//      ✔ Short function
//      ✔ Removes boilerplate code
//      ✔ Functional style

//  Streams:
//      ✔ Process collections
//      ✔ Filter, map, sort, reduce
//      ✔ Pipeline approach
//
//  MEMORY TRICK:
//      Lambda → One function
//      Streams → Collection processing pipeline

