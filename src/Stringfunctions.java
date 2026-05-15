//  Java String Class Methods (Full with Examples)
//  1. Basic Methods
//      (i) length()
//          Definition:
//              Returns number of characters in a string.

class function1 {
    public static void main(String[] args) {
        String s = "Java";
        System.out.println(s.length());
    }
}

//  Output: 4

//  (ii) charAt()
//  Definition:
//      Returns character at given index.

class function2 {
    public static void main(String[] args) {
        String s = "Java";
        System.out.println(s.charAt(2));
    }
}

//  Output: v

//  (iii) substring()
//  Definition:
//      Extracts part of string.

class function3 {
    public static void main(String[] args) {
        String s = "Programming";

        System.out.println(s.substring(3));
        System.out.println(s.substring(0, 6));
    }
}

//  Output:
//      gramming
//      Progra

//  (iv) toUpperCase()
//  String s = "java";
//  System.out.println(s.toUpperCase());

//  Output: JAVA

//  (v) toLowerCase()
//  String s = "JAVA";
//  System.out.println(s.toLowerCase());

//  Output: java

//  (vi) trim()
//  String s = "   Java   ";
//  System.out.println(s.trim());

//  Output: Java

//  (vii) isEmpty()
//  String s = "";
//  System.out.println(s.isEmpty());

//  Output: true

//  (viii) isBlank()
//  String s = "   ";
//  System.out.println(s.isBlank());

//  Output: true


//  2. Comparison Methods
//      (i) equals()
//      String a = "Java";
//      String b = "Java";
//      System.out.println(a.equals(b));

//  Output: true

//  (ii) equalsIgnoreCase()
//  String a = "Java";
//  String b = "java";
//  System.out.println(a.equalsIgnoreCase(b));

//  Output: true

//  (iii) compareTo()
//  System.out.println("abc".compareTo("abd"));

//  Output: -1

//  (iv) compareToIgnoreCase()
//  System.out.println("JAVA".compareToIgnoreCase("java"));

//  Output: 0


//  3. Searching Methods
//      (i) contains()
//      String s = "Welcome Java";
//      System.out.println(s.contains("Java"));

//  Output: true

//  (ii) indexOf()
//  String s = "Java Programming";
//  System.out.println(s.indexOf("a"));

//  Output: 1

//  (iii) lastIndexOf()
//  String s = "Java Java";
//  System.out.println(s.lastIndexOf("a"));

//  Output: 8


//  4. Modification Methods
//  (i) replace()
//  String s = "I like Python";
//  System.out.println(s.replace("Python", "Java"));

//  Output: I like Java

//  (ii) replaceAll()
//  String s = "java123java";
//  System.out.println(s.replaceAll("java", "C"));

//  Output: C123C

//  (iii) replaceFirst()
//  String s = "java java java";
//  System.out.println(s.replaceFirst("java", "C"));

//  Output: C java java

//  (iv) concat()
//  String a = "Hello";
//  String b = "World";
//  System.out.println(a.concat(b));

//  Output: HelloWorld


//  5. Splitting & Joining
//      (i) split()
class splitting {
    public static void main(String[] args) {
        String s = "Java-Python-C++";

        String[] arr = s.split("-");

        for(String x : arr) {
            System.out.println(x);
        }
    }
}

//  Output:
//      Java
//      Python
//      C++


//  6. Checking Methods
//  (i) startsWith()
//  System.out.println("Java".startsWith("Ja"));

//  Output:
//      true

//  (ii) endsWith()
//  System.out.println("Java".endsWith("va"));

//  Output:
//      true


//  7. Conversion Methods
//  (i) toCharArray()
//  String s = "Java";
//  char[] arr = s.toCharArray();

//  for(char c : arr) {
//        System.out.println(c);
//  }

//  Output:
//      J
//      a
//      v
//      a

//  (ii) valueOf()
//  int num = 100;
//  String s = String.valueOf(num);
//  System.out.println(s);

//  Output:
//        100


//  8. Formatting Methods
//  (i) format()
class formatting {
    public static void main(String[] args) {
        String s = String.format("My age is %d", 20);
        System.out.println(s);
    }
}

//  Output:
//      My age is 20

//  9. Pattern Matching
//  (i) matches()
//  System.out.println("java123".matches("java[0-9]+"));

//  Output:
//        true


//  10. Utility Methods
//  (i) String.join()
//  String result = String.join("-", "Java", "Python", "C++");
//  System.out.println(result);

//  Output:
//      Java-Python-C++

