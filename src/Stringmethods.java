//  String Methods in Java:
//      Java String class provides many built-in methods to perform operations on text like finding length, extracting part of string,
//      replacing characters, etc.

//  1. length() Method
//      Definition:
//          The length() method returns the number of characters present in a string, including spaces and special characters.

//      Syntax:
//          str.length();

//  Example:
//class method1 {
//    public static void main(String[] args) {
//        String str = "Hello World";
//        System.out.println(str.length());
//    }
//}
//  Output:
//      11

//  Explanation:
//      "Hello World" has 11 characters (including space).


//  2. substring() Method
//  Definition:
//      The substring() method is used to extract a part of a string from an existing string.

//  There are 2 types:
//      substring(startIndex)
//      substring(startIndex, endIndex)

//  Note:
//      startIndex is included
//      endIndex is excluded

//  Syntax:
//      str.substring(startIndex);
//      str.substring(startIndex, endIndex);

//  Example 1:
//class method2 {
//    public static void main(String[] args) {
//        String str = "Hello World";
//
//        System.out.println(str.substring(6));
//    }
//}
//  Output:
//      World

//  Example 2:
//class method3 {
//    public static void main(String[] args) {
//        String str = "Hello World";
//
//        System.out.println(str.substring(0, 5));
//    }
//}
//  Output:
//      Hello


//  3. replace() Method
//  Definition:
//      The replace() method is used to replace characters or words in a string with another value.
//      It does NOT modify the original string (because String is immutable), instead it creates a new string.

//  Syntax:
//      str.replace(oldChar, newChar);
//      str.replace(oldString, newString);

//  Example 1 (Character Replace):
class method4 {
    public static void main(String[] args) {
        String str = "banana";

        System.out.println(str.replace('a', 'o'));
    }
}
//  Output:
//      bonono

//  Example 2 (Word Replace):
class method5 {
    public static void main(String[] args) {
        String str = "I love Java";

        System.out.println(str.replace("Java", "Python"));
    }
}
//  Output:
//      I love Python

//  Summary Table
//      Method	                Purpose	                    Example Output
//      length()	    Returns number of characters	            11
//      substring()	    Extracts part of string	            "Hello", "World"
//      replace()	    Replaces characters/words	        modified string

//  Final Note:
//      Strings are immutable.
//      Every method returns a new string.
//      These methods are heavily used in real-time projects like login systems, validation, search, etc.
