//  StringBuffer & StringBuilder in Java
//  1. What is Mutable String?
//      Definition:
//          In Java, a mutable string means a string whose value can be changed after creation.
//          Unlike String (immutable), these allow modifications without creating new objects every time.


//  2. StringBuffer
//      Definition:
//          StringBuffer is a class used to create mutable string objects. It is thread-safe (synchronized), meaning it works safely in multi-threaded environments.

//      Key Points:
//          Mutable (can change content)
//          Thread-safe (synchronized)
//          Slower than StringBuilder
//          Introduced in Java 1.0

//  Example:
//class stringbuffering {
//    public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer("Hello");
//
//        sb.append(" World");
//        sb.insert(5, " Java");
//        sb.replace(0, 5, "Hi");
//
//        System.out.println(sb);
//    }
//}
//  Output:
//      Hi Java World

//  StringBuffer Methods:
//      append()
//      insert()
//      replace()
//      delete()
//      reverse()

//  Example (reverse):
//class bufferingreverse {
//    public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer("Java");
//        System.out.println(sb.reverse());
//    }
//}
//  Output:
//      avaJ


//  3. StringBuilder
//  Definition:
//      StringBuilder is also used for mutable strings, but it is not thread-safe, which makes it faster than StringBuffer.

//  Key Points:
//      Mutable
//      Not synchronized
//      Faster performance
//      Introduced in Java 1.5

//  Example:
class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" Java");
        sb.insert(5, " World");
        sb.replace(0, 5, "Hi");

        System.out.println(sb);
    }
}
//  Output:
//      Hi World Java

//  Example (reverse):
class reversing {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Coding");
        System.out.println(sb.reverse());
    }
}

//  Output:
//      gnidoC


//  4. StringBuffer vs StringBuilder (Important 🔥)
//          Feature	        StringBuffer	        StringBuilder
//          Type	            Mutable	            Mutable
//          Thread Safe	        Yes (synchronized)	No
//          Speed	            Slow	            Fast
//          Performance	        Low	                High
//          Introduced	        Java 1.0	        Java 1.5


//  5. Performance Concept (Very Important)
//  Why StringBuilder is faster?
//      StringBuffer → every method is synchronized (locked)
//      StringBuilder → no locking → direct execution

//  So in single-thread applications:
//      StringBuilder > StringBuffer > String


//  6. When to use what?
//      Use String:
//          Fixed text
//          No modification needed
//      Use StringBuffer:
//          Multi-threading (safe environment)
//      Use StringBuilder:
//          Normal applications (fast performance)


//  Final Simple Summary
//      String = Immutable (slow for changes)
//      StringBuffer = Mutable + Safe
//      StringBuilder = Mutable + Fast


//  How to check thread is safe or not?
//  Thread-safe (StringBuffer)
//      Multiple threads same time use pannalum data damage aagathu
//      Because methods are synchronized

//  Not thread-safe (StringBuilder)
//      Multiple threads same object use pannina data mismatch / corruption varalaam

//  2. How to test? (Real Proof Code)
//      We use MULTI-THREAD program
//      A) StringBuffer Test (Thread-safe proof)
class checking {

    static StringBuffer sb = new StringBuffer("0");

    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                sb.append("A");
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                sb.append("B");
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(sb.length());
    }
}
//  Expected Output:
//        2001

//  Notes:
//      Correct result
//      No missing data
//      Safe execution

//  That proves: StringBuffer is thread-safe


//  B) StringBuilder Test (NOT thread-safe proof)
class checked {

    static StringBuilder sb = new StringBuilder("0");

    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                sb.append("A");
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                sb.append("B");
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(sb.length());
    }
}
//  Output (varies):
//        1987
//        2010
//        1995

//  Notes:
//      inconsistent result
//      missing / extra characters
//      race condition happening

//  That proves: StringBuilder is NOT thread-safe


//  3. Speed test (Builder faster than Buffer)
//  Simple performance test idea: (example program)
//      long start = System.currentTimeMillis();
//      StringBuilder sb = new StringBuilder();
//      for(int i = 0; i < 100000; i++) {
//          sb.append("a");
//      }
//      long end = System.currentTimeMillis();
//      System.out.println(end - start);

//  Then same for StringBuffer:
//      long start = System.currentTimeMillis();
//      StringBuffer sb = new StringBuffer();
//      for(int i = 0; i < 100000; i++) {
//          sb.append("a");
//      }
//      long end = System.currentTimeMillis();
//      System.out.println(end - start);

//  Result idea:
//          Type	        Time
//      StringBuilder	    Faster
//      StringBuffer	    Slower


//  4. Real Logic Behind This
//  Why Buffer is slow?
//  Because:
//      synchronized method → lock → unlock → slow

//  Why Builder is fast?
//  Because:
//      no lock → direct access → fast execution


//  5. Final Simple Understanding
//      If output correct in multi-thread → thread-safe
//      If output changes randomly → not thread-safe
//      If faster execution → no synchronization (Builder)

//  Notes:
//      StringBuffer = Safe but slow
//      StringBuilder = Fast but unsafe


