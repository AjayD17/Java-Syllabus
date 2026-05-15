//  OPERATORS IN JAVA
//  Definition:
//      Operators are symbols used to perform operations on variables and values.

//  Example: +, -, *, /
//      Types of Operators in Java

//  Types of Operators:
//      Arithmetic operators.
//      Relational (Comparison) Operators.
//      Logical Operators.
//      Assignment Operators.
//      Increment & Decrement Operators.
//      Ternary Operator.
//      Bitwise Operators.
//      Unary Operators.


//  1. Arithmetic Operators:
//  Definition:
//      Used to perform basic mathematical operations.

//  Operators:
//  Operator	        Meaning
//      +	        Addition
//      -	        Subtraction
//      *	        Multiplication
//      /	        Division
//      %	        Modulus (remainder)

//  Example:
//class ArithmeticDemo {
//    public static void main(String[] args) {
//        int a = 10, b = 3;
//
//        System.out.println("Addition: " + (a + b));       // 13
//        System.out.println("Subtraction: " + (a - b));    // 7
//        System.out.println("Multiplication: " + (a * b)); // 30
//        System.out.println("Division: " + (a / b));       // 3
//        System.out.println("Modulus: " + (a % b));        // 1
//        System.out.println("Int Division: " + 5 / 2);   // 2 (int division)
//        System.out.println("Double Division: " + 5.0 / 2); // 2.5 (double division)
//        System.out.println("Exponentiation: " + Math.pow(2, 3)); // 8.0
//    }
//}


//  2. Relational (Comparison) Operators:
//  Definition:
//      Used to compare two values.
//      Always returns true or false.

//  Operators:
//      Operator	Meaning
//          ==	    Equal to
//          !=	    Not equal
//          >	    Greater than
//          <	    Less than
//          >=	    Greater than or equal
//          <=	    Less than or equal

//  Example:
//class RelationalDemo {
//    public static void main(String[] args) {
//        int a = 10, b = 5;
//
//        System.out.println(a > b);   // true
//        System.out.println(a < b);   // false
//        System.out.println(a == b);  // false
//        System.out.println(a != b);  // true
//    }
//}


//  3. Logical Operators:
//      Definition:
//          Used to combine multiple conditions.

//  Operators:
//      Operator	Meaning
//          &&	    AND
//          ||      OR`
//          !	    NOT

//  Example:
//class LogicalDemo {
//    public static void main(String[] args) {
//        int age = 20;
//
//        System.out.println(age > 18 && age < 25); // true
//        System.out.println(age > 18 || age < 10); // true
//        System.out.println(!(age > 18));          // false
//    }
//}


//  4. Assignment Operators:
//      Definition:
//          Used to assign values to variables.

//      Operators:
//          Operator	Meaning
//              =	    Assign
//              +=	    Add and assign
//              -=	    Subtract and assign
//              *=	    Multiply and assign
//              /=	    Divide and assign

//  Example:
//class AssignmentDemo {
//    public static void main(String[] args) {
//        int a = 10;
//
//        a += 5;  // a = a + 5
//        System.out.println(a); // 15
//    }
//}


//  5.  Increment & Decrement Operators:
//      Definition:
//          Used to increase or decrease value by 1.

//      Operators:
//          Operator	Meaning
//              ++	    Increment
//              --	    Decrement

//  Example:
//class IncrementDemo {
//    public static void main(String[] args) {
//        int a = 5;
//
//        System.out.println(++a); // 6 (pre-increment)
//        System.out.println(a--); // 6 (post-decrement)
//        System.out.println(a);   // 5
//    }
//}


//  6. Ternary Operator:
//  Definition:
//      Short form of if-else.

//  Syntax:
//      condition ? value1 : value2;

//  Example:
//class TernaryDemo {
//    public static void main(String[] args) {
//        int age = 18;
//
//        String result = (age >= 19) ? "Eligible" : "Not Eligible";
//        System.out.println(result);
//    }
//}


//  7. Bitwise Operators:
//  Definition:
//      Bitwise operators perform operations on binary bits (0 & 1).

//  Operators:
//      &  → AND
//      |  → OR
//      ^  → XOR
//      ~  → NOT
//      << → Left Shift
//      >> → Right Shift

//class BitwiseDemo {
//    public static void main(String[] args) {
//
//        int a = 5;  // 0101
//        int b = 3;  // 0011
//
//        // AND
//        int andResult = a & b;
//
//        // OR
//        int orResult = a | b;
//
//        // XOR
//        int xorResult = a ^ b;
//
//        // NOT
//        int notResult = ~a;
//
//        // Left Shift
//        int leftShift = a << 1;
//
//        // Right Shift
//        int rightShift = a >> 1;
//
//        // Output
//        System.out.println("a = " + a + ", b = " + b);
//
//        System.out.println("AND (a & b): " + andResult);
//        System.out.println("OR (a | b): " + orResult);
//        System.out.println("XOR (a ^ b): " + xorResult);
//        System.out.println("NOT (~a): " + notResult);
//        System.out.println("Left Shift (a << 1): " + leftShift);
//        System.out.println("Right Shift (a >> 1): " + rightShift);
//    }
//}

// Notes:
//      &   →   both 1
//      |   →   any 1
//      ^   →   different
//      ~   →   reverse
//      <<  →   multiply by 2
//      >>  →   divide by 2



//  8. Unary Operators
//  Definition:
//      Unary operators work on a single operand (one value).

//  Operators:
//      +  → Positive
//      -  → Negative
//      ++ → Increment
//      -- → Decrement
//      !  → Logical NOT

class UnaryDemo {
    public static void main(String[] args) {

        int a = 5;
        boolean flag = true;

        // Unary Plus
        int positive = +a;

        // Unary Minus
        int negative = -a;

        // Increment
        int preIncrement = ++a;   // first increase, then use
        int postIncrement = a++;  // first use, then increase

        // Decrement
        int preDecrement = --a;   // first decrease, then use
        int postDecrement = a--;  // first use, then decrease

        // Logical NOT
        boolean notFlag = !flag;

        // Output
        System.out.println("Original value: " + 5);

        System.out.println("Unary Plus (+a): " + positive);
        System.out.println("Unary Minus (-a): " + negative);

        System.out.println("Pre-Increment (++a): " + preIncrement);
        System.out.println("Post-Increment (a++): " + postIncrement);

        System.out.println("Pre-Decrement (--a): " + preDecrement);
        System.out.println("Post-Decrement (a--): " + postDecrement);

        System.out.println("Logical NOT (!flag): " + notFlag);
    }
}


//  Final Summary:
//      Type            Purpose
//      Arithmetic      Calculations
//      Relational      Comparison
//      Logical         Combine conditions
//      Assignment      Assign values
//      Increment       Increase/Decrease
//      Ternary         Short if-else
//      Bitwise         Binary (bit-level) operations
//      Unary           Single operand operations


//  Notes:
//      Arithmetic  →   Maths
//      Relational  →   Compare
//      Logical     →   Conditions
//      Assignment  →   Store
//      Increment   →   +1 / -1
//      Ternary     →   Shortcut if-else
//      Bitwise     →   Work on bits (0 & 1)
//      Unary       →   One value operation

