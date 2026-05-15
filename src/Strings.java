//  Strings – String Class Basics (Java)
//  Definition:
//      In Java, a String is a sequence of characters used to represent text. It is an object of the built-in String class in java.lang package.
//      Strings are immutable, meaning once created, their value cannot be changed.

//  Example:
//      String name = "Hello";

//  Here, "Hello" is a String literal stored in the String pool.

//  Key Features of String Class:
//      Strings are objects, not primitive data types.
//      They are immutable (cannot be changed after creation).
//      Stored in String Constant Pool for memory optimization.
//      Supports many built-in methods like length(), charAt(), toUpperCase(), etc.

//  Example 1: Basic String Creation
//class string1 {
//    public static void main(String[] args) {
//        String str = "Hello";
//        System.out.println(str);
//    }
//}

//  Output:
//      Hello

//  Example 2: String Methods
//class string2 {
//    public static void main(String[] args) {
//        String str = "Hello";
//
//        System.out.println("Length: " + str.length());
//        System.out.println("Uppercase: " + str.toUpperCase());
//        System.out.println("Character at index 1: " + str.charAt(1));
//    }
//}

//  Output:
//      Length: 5
//      Uppercase: HELLO
//      Character at index 1: e


//  Example 3: String Immutability
//class string3{
//    public static void main(String[] args) {
//        String str = "Hello";
//        str.concat(" World");
//
//        System.out.println(str);
//    }
//}

//  Output:
//      Hello

//  Even though we used concat(), original string is not changed because Strings are immutable.

//  Summary:
//      String = sequence of characters.
//      Built-in class in Java.
//      Immutable object.
//      Provides many useful methods for text manipulation.