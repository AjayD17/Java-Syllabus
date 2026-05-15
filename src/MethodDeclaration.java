//  Method Declaration:
//      public static void main(String[] args)

//  1.) public
//      It is an access modifier.
//      It allows the method to be accessed from anywhere by the JVM.

//  2.) static
//      It allows the method to run without creating an object.
//      The JVM can call the method directly using the class name.

//  3.) void
//      It is a return type.
//      It means the method does not return any value.

// a.) VOID METHOD (No Return):
//    A method does not return any value.
//    To display output, we use System.out.println().

// Example:
class VoidExample {

    // void method
    static void addNumbers(int a, int b) {
        int sum = a + b;
        System.out.println("Void Method Sum: " + sum);
    }

    public static void main(String[] args) {

        // method call
        addNumbers(5, 3);

        System.out.println("VoidExample Program finished");
    }
}

// b.) NON-VOID METHOD (Return Type):
//    The method returns a value.
//    To display the result, we use System.out.println() separately.

// Example:
class ReturnExample {

    // NON-VOID METHOD (returns int value)
    static int sumNumbers(int c, int d) {
        int add = c + d;
        return add;
    }

    public static void main(String[] args) {

        // calling method and storing returned value
        int result = sumNumbers(10, 5);

        System.out.println("Return Method Sum: " + result);

        System.out.println("Program finished");
    }
}

// Notes:
//      One file can contain multiple classes.
//      But only one class can be executed at a time.
//      IntelliJ IDEA and VS Code follow the same rule.
//      The JVM always uses a single entry point (main method) to start execution.

//  4.) main
//      It is the starting point of a Java program
//      Program execution begins from the main method

//  5.) String[] args
//      It is used for command-line arguments
//      It allows input to be passed from outside the program

// Final Simple Meaning
//      public static void main(String[] args)
