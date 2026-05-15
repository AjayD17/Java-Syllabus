//  Jump Statements in Java:
//  Definition:
//      Jump statements are used to change the flow of execution in loops or switch statements.
//      They help to break or skip iterations during program execution.

//      Types of Jump Statements in Java
//      1. break Statement
//          Definition:
//              Used to exit a loop or switch statement immediately

//  Example:
//class BreakDemo {
//    public static void main(String[] args) {
//
//        for (int i = 1; i <= 5; i++) {
//
//            if (i == 3) {
//                break;
//            }
//
//            System.out.println(i);
//        }
//    }
//}


//  2. continue Statement
//  Definition:
//      Used to skip current iteration and continue next loop cycle

//  Example:
//class ContinueDemo {
//    public static void main(String[] args) {
//
//        for (int i = 1; i <= 5; i++) {
//
//            if (i == 3) {
//                continue;
//            }
//
//            System.out.println(i);
//        }
//    }
//}


//  3. return Statement
//  Definition:
//      Used to exit from a method and optionally return a value

//  Example:
class ReturnDemo {

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        int result = add(5, 3);
        System.out.println(result);
    }
}


//  Java alternative for pass:
//      Just use empty block {}

//  Example:
//        if (true) {
//        // do nothing
//        }

//  Final Summary:
//          Statement	Purpose
//             break	Exit loop
//          continue	Skip iteration
//            return	Exit method

//  Notes:
//      break → stop
//      continue → skip
//      return → exit function
//      pass → not in Java (empty block)

