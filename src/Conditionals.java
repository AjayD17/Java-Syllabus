//  CONDITIONAL STATEMENTS (Java):
//  Definition:
//      Conditional statements are used to control the flow of execution based on conditions.
//      Decision making (true / false based execution)

//  Types of Conditionals:
//  1. if Statement
//  Definition:
//      Executes a block of code only if the condition is true

//  Example:
//class IfDemo {
//    public static void main(String[] args) {
//
//        int a = 10;
//
//        if (a > 5) {
//            System.out.println("a is greater than 5");
//        }
//    }
//}

//  2. if-else Statement
//  Definition:
//      Executes one block if condition is true,
//      Otherwise executes another block

//  Example:
class IfElseDemo {
    public static void main(String[] args) {

        int a = 3;

        if (a > 5) {
            System.out.println("Greater");
        } else {
            System.out.println("Smaller");
        }
    }
}


//  3. else-if Ladder
//  Definition:
//      Used to check multiple conditions
//      Executes the first true block

//  Example:
class ElseIfDemo {
    public static void main(String[] args) {

        int marks = 75;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }
    }
}


//  4. Nested if
//  Definition:
//      if statement inside another if
//      Used for checking multiple dependent conditions

//  Example:
class NestedIfDemo {
    public static void main(String[] args) {

        int age = 20;
        boolean hasID = true;

        if (age >= 18) {
            if (hasID) {
                System.out.println("Allowed");
            }
        }
    }
}


//  5. switch Statement
//  Definition:
//      Used to select one block from multiple options
//      Works with fixed values (case)

//  Example:
class SwitchDemo {
    public static void main(String[] args) {

        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}


//  OVERALL COMBINED EXAMPLE (All in One)
//  Conditional Statements - Overall Example
class ConditionalDemo {
    public static void main(String[] args) {

        int a = 10;
        int marks = 85;
        boolean hasID = true;
        int day = 3;

        // if
        if (a > 5) {
            System.out.println("if: a is greater than 5");
        }

        // if-else
        if (a % 2 == 0) {
            System.out.println("if-else: Even number");
        } else {
            System.out.println("if-else: Odd number");
        }

        // else-if ladder
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade C");
        }

        // nested if
        if (a > 5) {
            if (hasID) {
                System.out.println("nested-if: Access granted");
            }
        }

        // switch
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}


//  Final Summary:
//      Type	        Purpose
//      if	            Single condition check
//      if-else	        Two conditions
//      else-if	        Multiple conditions
//      nested-if	    Condition inside condition
//      switch	        Multiple fixed options


//  Notes:
//      if → single
//      if-else → two
//      else-if → many
//      nested-if → inside check
//      switch → fixed choices

