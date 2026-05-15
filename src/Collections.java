//  Java Collections Framework:
//  Definition
//      The Java Collections Framework (JCF) is a set of classes and interfaces used to store, manage, and manipulate groups of objects dynamically.

//      It provides:
//        Efficient data storage
//        Easy data retrieval
//        Built-in methods

//  Main Interfaces
//        Interface	          Description
//        List	              Ordered collection (allows duplicates)
//        Set	              Unordered collection (no duplicates)
//        Map	              Key-value pair collection

//  1. List (Ordered + Duplicates Allowed)
//  Definition:
//      A List maintains insertion order and allows duplicate elements.

//  Example 1: ArrayList
//import java.util.*;
//
//public class Test {
//    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//
//        list.add("Apple");
//        list.add("Banana");
//        list.add("Apple");
//
//        System.out.println(list);
//    }
//}

//  Output:
//        [Apple, Banana, Apple]

//  Example 2: Access & Loop
//import java.util.*;
//
//public class Test {
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
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

//  Example 3: Remove & Update
//import java.util.*;
//
//public class Test {
//    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//
//        list.add("A");
//        list.add("B");
//        list.add("C");
//
//        list.remove("B");
//        list.set(1, "Z");
//
//        System.out.println(list);
//    }
//}

//  Output:
//        [A, Z]

//  2. Set (No Duplicates)
//  Definition:
//      A Set does not allow duplicate elements.

//  Example 1: HashSet
//import java.util.*;
//
//public class Test {
//    public static void main(String[] args) {
//        HashSet<String> set = new HashSet<>();
//
//        set.add("Apple");
//        set.add("Banana");
//        set.add("Apple");
//
//        System.out.println(set);
//    }
//}

//  Output:
//        [Apple, Banana]

//  Example 2: Looping
//import java.util.*;
//
//public class Test {
//    public static void main(String[] args) {
//        HashSet<Integer> set = new HashSet<>();
//
//        set.add(1);
//        set.add(2);
//        set.add(3);
//
//        for(int i : set) {
//            System.out.println(i);
//        }
//    }
//}

//  3. Map (Key-Value Pair)
//  Definition:
//      A Map stores data in key-value pairs.
//      Keys are unique, values can duplicate.

//  Example 1: HashMap
//import java.util.*;
//
//public class Test {
//    public static void main(String[] args) {
//        HashMap<Integer, String> map = new HashMap<>();
//
//        map.put(1, "Ajay");
//        map.put(2, "Kumar");
//        map.put(1, "Rahul");
//
//        System.out.println(map);
//    }
//}

//  Output:
//        {1=Rahul, 2=Kumar}

//  Example 2: Access Values
//import java.util.*;
//
//public class Test {
//    public static void main(String[] args) {
//        HashMap<Integer, String> map = new HashMap<>();
//
//        map.put(1, "Java");
//        map.put(2, "Python");
//
//        System.out.println(map.get(1));
//    }
//}

//  Output:
//      Java

//  Example 3: Loop Map
//import java.util.*;
//
//public class Test {
//    public static void main(String[] args) {
//        HashMap<Integer, String> map = new HashMap<>();
//
//        map.put(1, "A");
//        map.put(2, "B");
//
//        for(Map.Entry<Integer, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
//    }
//}

//  Output:
//      1 A
//      2 B

//  4. Dictionary (Legacy)
//  Definition:
//      Old class used before Map (now mostly replaced by HashMap)

//  Example: Hashtable
//import java.util.*;
//
//public class Test {
//    public static void main(String[] args) {
//        Hashtable<Integer, String> ht = new Hashtable<>();
//
//        ht.put(1, "One");
//        ht.put(2, "Two");
//
//        System.out.println(ht);
//    }
//}

//  ArrayList (Special Focus)
//  Definition:
//      ArrayList is a resizable array used in List interface.
//
//  Example: Real Usage
//import java.util.*;
//
//public class Test {
//    public static void main(String[] args) {
//        ArrayList<String> students = new ArrayList<>();
//
//        students.add("Ajay");
//        students.add("Kiran");
//        students.add("Ravi");
//
//        System.out.println("Students: " + students);
//        System.out.println("First: " + students.get(0));
//    }
//}

//  Output:
//      Students: [Ajay, Kiran, Ravi]
//      First: Ajay

//  Final Summary
//          Type	            Feature
//          List	     Ordered, duplicates allowed
//          Set	                No duplicates
//          Map	              Key-value pairs
//          ArrayList	        Dynamic array

//  One-line Answer:
//      Java Collections Framework is used to store and manipulate groups of objects dynamically using List, Set, and Map interfaces.


