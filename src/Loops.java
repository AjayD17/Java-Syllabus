//  LOOPS IN JAVA
//  Definition:
//      Loops are used to execute a block of code repeatedly until a condition becomes false.

//      Types of Loops in Java
//      1. for loop
//          Definition:
//              Used when number of iterations is known

//      Syntax:
//          for(initialization; condition; update) {
//              // code
//          }

//  Example:
class ForDemo {
    public static void main(String[] args) {

        for(int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }
    }
}


//  2. while loop
//  Definition:
//      Used when condition is checked before execution

//  Syntax:
//      while(condition) {
//        // code
//       }

//   Example:
class WhileDemo {
    public static void main(String[] args) {

        int i = 0;

        while(i < 5) {
            System.out.println("i = " + i);
            i++;
        }
    }
}


//  3. do-while loop
//  Definition:
//      Executes at least once, then checks condition

//  Syntax:
//        do {
//          // code
//        } while(condition);

//  Example:
class DoWhileDemo {
    public static void main(String[] args) {

        int i = 0;

        do {
            System.out.println("i = " + i);
            i++;
        } while(i < 5);
    }
}

//  Final Overall Example (All Loops Together)
class LoopDemo {
    public static void main(String[] args) {

        System.out.println("FOR LOOP:");
        for(int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        System.out.println("\nWHILE LOOP:");
        int i = 0;
        while(i < 3) {
            System.out.println(i);
            i++;
        }

        System.out.println("\nDO-WHILE LOOP:");
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while(j < 3);
    }
}


//  Notes:
//      for = known count
//      while = condition first
//      do-while = execute first

