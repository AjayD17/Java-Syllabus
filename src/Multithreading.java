//  Threading in Java
//  Definition
//      Threading is the process of executing multiple parts of a program (threads) independently.
//      A thread is a lightweight sub-process.

//  Types of Threading
//  1. Single Threading
//  Definition:
//      Only one task executes at a time.
//      If one task is running, others must wait.

//  Example:
//class Testing {
//    public static void main(String[] args) {
//        System.out.println("Task 1");
//        System.out.println("Task 2");
//        System.out.println("Task 3");
//    }
//}

//  Output:
//      Task 1
//      Task 2
//      Task 3

//  Sequential execution (one by one)

//  2. Multithreading
//  Definition:
//      Multiple threads execute simultaneously (parallel execution).
//      Improves performance and efficiency.

//  Creating Threads in Java
//      Two ways:
//          1. Using Thread class
//          2. Using Runnable interface

//  Method 1: Using Thread Class
//  Example:
//class MyThread extends Thread {
//    public void run() {
//        System.out.println("Thread is running...");
//    }
//}
//
//class Testing {
//    public static void main(String[] args) {
//        MyThread t = new MyThread();
//        t.start();  // start thread
//    }
//}

//  Output:
//      Thread is running...

//  Method 2: Using Runnable Interface
//  Example:
//class MyRunnable implements Runnable {
//    public void run() {
//        System.out.println("Runnable thread running...");
//    }
//}
//
//class Testing {
//    public static void main(String[] args) {
//        Thread t = new Thread(new MyRunnable());
//        t.start();
//    }
//}

//  Output:
//      Runnable thread running...

//  Example: Multiple Threads (Parallel Execution)
//class A extends Thread {
//    public void run() {
//        for(int i = 1; i <= 3; i++) {
//            System.out.println("Thread A: " + i);
//        }
//    }
//}
//
//class B extends Thread {
//    public void run() {
//        for(int i = 1; i <= 3; i++) {
//            System.out.println("Thread B: " + i);
//        }
//    }
//}
//
//class Testing {
//    public static void main(String[] args) {
//        A t1 = new A();
//        B t2 = new B();
//
//        t1.start();
//        t2.start();
//    }
//}

//  Output (order may vary):
//      Thread A: 1
//      Thread B: 1
//      Thread A: 2
//      Thread B: 2
//      Thread A: 3
//      Thread B: 3
//
//      This shows parallel execution

//  Key Points
//      start() → creates new thread
//      run() → contains logic
//      Threads run independently
//      Output order is not fixed

//  Summary Table:
//          Concept	            Description
//          Threading	        Execution of threads
//          Single Threading	One task at a time
//          Multithreading	    Multiple tasks simultaneously
//          Thread class	    Create thread using inheritance
//          Runnable	        Create thread using interface

//  One-line Answer:
//      Multithreading is a process of executing multiple threads simultaneously to improve performance.

