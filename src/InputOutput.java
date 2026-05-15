//  Definition:
//    Input & Output in Java is used to:
//      Take data from the user (Input)
//      Display result to the user (Output)
//      Java uses the Scanner class for taking input from the user.

//    Scanner class is available in:
//          import java.util.Scanner;

// Example:
import java.util.Scanner;

class InputOutputDemo {

    public static void main(String[] args) {

        // Step 1: Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Step 2: Take input from user
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Step 3: Display output
        System.out.println("----- USER DETAILS -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        // Step 4: Close scanner (good practice)
        sc.close();
    }
}

//  Notes:
//      Scanner object is created to read input
//      next() → Reads only one word.
//      nextLine() → Reads full sentence.
//      nextInt() → Reads integer value.
//      nextDouble() → Reads decimal.
//      System.out.println() → prints output.
//      sc.close() → frees memory.
