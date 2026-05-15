//  Generics in Java
//  Definition
//      Generics allow you to write classes, interfaces, and methods that can work with any data type in a type-safe way.
//      It is written using:
//          <T>
//          This means “Type parameter” (placeholder for any type).

//      Why Generics?
//          Without generics:
//              Need type casting
//              Risk of runtime errors

//          With generics:
//              Type safety
//              No casting
//              Compile-time checking

//  1. Example WITHOUT Generics
//import java.util.*;
//
//public class Test {
//    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//
//        list.add("Ajay");
//        list.add(10);   // mixed type
//
//        String name = (String) list.get(0); // casting needed
//        System.out.println(name);
//    }
//}

//  Problem:
//      Runtime error possible
//      No type safety

//  2. Example WITH Generics
//import java.util.*;
//
//public class Test {
//    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//
//        list.add("Ajay");
//        // list.add(10); ❌ compile-time error
//
//        System.out.println(list.get(0));
//    }
//}

//  Output:
//      Ajay

//      ✔ Type safe
//      ✔ No casting

//  3. Generic Class
//  Definition:
//      Class that works with any type

//class Box<T> {
//    T data;
//
//    void set(T data) {
//        this.data = data;
//    }
//
//    T get() {
//        return data;
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        Box<Integer> b = new Box<>();
//        b.set(100);
//
//        System.out.println(b.get());
//    }
//}

//  Output:
//        100

//  4. Generic Method
//  Definition:
//      Method that works with any type

//class Test {
//
//    public static <T> void printData(T data) {
//        System.out.println(data);
//    }
//
//    public static void main(String[] args) {
//        printData(10);
//        printData("Hello");
//        printData(3.14);
//    }
//}

//  Output:
//        10
//        Hello
//        3.14

//  5. Multiple Type Parameters
//class Pair<K, V> {
//    K key;
//    V value;
//
//    Pair(K key, V value) {
//        this.key = key;
//        this.value = value;
//    }
//
//    void display() {
//        System.out.println(key + " : " + value);
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        Pair<Integer, String> p = new Pair<>(1, "Ajay");
//        p.display();
//    }
//}

//  Output:
//        1 : Ajay

//  6. Generics with Collections
//import java.util.*;
//
//public class Test {
//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//
//        list.add(10);
//        list.add(20);
//        list.add(30);
//
//        for(int i : list) {
//            System.out.println(i);
//        }
//    }
//}

//  Output:
//        10
//        20
//        30

//  7. Wildcard Generics (Advanced)
//import java.util.*;
//
//public class Test {
//    public static void printList(List<?> list) {
//        for(Object obj : list) {
//            System.out.println(obj);
//        }
//    }
//
//    public static void main(String[] args) {
//        List<String> l1 = Arrays.asList("A", "B");
//        List<Integer> l2 = Arrays.asList(1, 2);
//
//        printList(l1);
//        printList(l2);
//    }
//}

//  Output:
//        A
//        B
//        1
//        2

//  Key Points:
//      <T> → Type parameter
//      Compile-time checking
//      No type casting
//      Works with collections

//  Summary
//          Feature	        Description
//          Generics	Type-safe programming
//          <T>	        Type placeholder
//          Benefit	    No runtime errors

