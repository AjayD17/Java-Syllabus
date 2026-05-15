//  Exception Handling in Java (With Examples)
//  1. try – catch
//  Definition:
//      try contains risky code, catch handles the exception

//  Example:
//class Testing {
//    public static void main(String[] args) {
//        try {
//            int a = 10 / 0;
//        } catch (ArithmeticException e) {
//            System.out.println("Cannot divide by zero");
//        }
//    }
//}

//  Output:
//      Cannot divide by zero

//  2. try – catch – finally
//  Definition:
//      finally block always executes

//  Example:
//class Testing {
//    public static void main(String[] args) {
//        try {
//            int a = 10 / 0;
//        } catch (Exception e) {
//            System.out.println("Exception handled");
//        } finally {
//            System.out.println("Finally block executed");
//        }
//    }
//}

//  Output:
//      Exception handled
//      Finally block executed

//  3. throw
//  Definition:
//      Used to manually throw an exception

//  Example:
//class Testing {
//    public static void main(String[] args) {
//        try {
//            throw new ArithmeticException("Manual exception");
//        } catch (ArithmeticException e) {
//            System.out.println("Exception caught: " + e.getMessage());
//        }
//    }
//}

//  Output:
//      Exception caught: Manual exception

//  4. throws
//  Definition:
//      Declares exception in method

//  Example:
//class Testing {
//
//    static void check() throws ArithmeticException {
//        int a = 10 / 0;
//    }
//
//    public static void main(String[] args) {
//        try {
//            check();
//        } catch (ArithmeticException e) {
//            System.out.println("Exception caught: " + e.getMessage());
//        }
//    }
//}

//  Easy Understanding:
//      throw = “I am throwing an error now”
//      throws = “This method may throw an error”

//  5. Multiple catch
//  Definition:
//      Handle different exceptions separately

//  Example:
//class Test {
//    public static void main(String[] args) {
//        try {
//            int a = 10 / 0;
//        } catch (ArithmeticException e) {
//            System.out.println("Arithmetic Error");
//        } catch (Exception e) {
//            System.out.println("General Error");
//        }
//    }
//}

//  Output:
//      Arithmetic Error

//  6. Nested try
//  Definition:
//      try block inside another try

//  Example:
//class Test {
//    public static void main(String[] args) {
//        try {
//            try {
//                int a = 10 / 0;
//            } catch (ArithmeticException e) {
//                System.out.println("Inner catch");
//            }
//        } catch (Exception e) {
//            System.out.println("Outer catch");
//        }
//    }
//}

//  Output:
//      Inner catch

//  7. Checked Exception
//  Definition:
//      Checked at compile time

//  Example:
//import java.io.*;
//
//class Testing {
//    public static void main(String[] args) {
//        try {
//            FileReader fr = new FileReader("file.txt");
//        } catch (IOException e) {
//            System.out.println("File not found");
//        }
//    }
//}

//  8. Unchecked Exception
//  Definition:
//      Occurs at runtime

//  Example:
//class Test {
//    public static void main(String[] args) {
//        int a = 10 / 0;
//    }
//}

//  Output:
//      Exception in thread "main" java.lang.ArithmeticException

//  9. Custom Exception
//  Definition:
//      User-defined exception

//  Example:
//class MyException extends Exception {
//    MyException(String msg) {
//        super(msg);
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        try {
//            throw new MyException("Custom Error");
//        } catch (MyException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}

//  Output:
//      Custom Error

//  10. try-with-resources
//  Definition:
//      Automatically closes resources

//  Example:
//import java.io.*;
//
//class Testing {
//    public static void main(String[] args) {
//        try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
//            System.out.println("Reading file...");
//        } catch (Exception e) {
//            System.out.println("Error occurred");
//        }
//    }
//}

//  Output:
//      Error occurred

//  Final Summary:
//      Exception Handling includes:
//        try
//        catch
//        finally
//        throw
//        throws
//        multiple catch
//        nested try
//        checked exception
//        unchecked exception
//        custom exception
//        try-with-resources

//  One-line Answer:
//      Exception handling is used to handle runtime errors using try, catch, finally, throw, and throws so that program execution continues normally.


