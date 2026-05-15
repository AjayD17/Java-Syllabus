//  1. Encapsulation
//  Definition
//      Encapsulation is the process of wrapping data (variables) and methods into a single unit (class) and restricting direct access to the data.

//  It is achieved using:
//      Access modifiers (private, protected, public)
//      Getters and Setters

//  2. Data Hiding
//  Definition
//      Data Hiding means restricting direct access to variables using access modifiers.

//  Access Modifiers:
//      Modifier	Access Level
//      private	    Only inside same class
//      protected	Same package + subclass
//      public	    Anywhere

//  3. Getters and Setters
//  Definition
//      Getter → used to read (get) data
//      Setter → used to modify (set) data

//  Example 1: Basic Encapsulation
//class Student {
//    private String name;   // data hiding
//    private int age;
//
//    // Setter
//    void setName(String n) {
//        name = n;
//    }
//
//    void setAge(int a) {
//        age = a;
//    }
//
//    // Getter
//    String getName() {
//        return name;
//    }
//
//    int getAge() {
//        return age;
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        Student s = new Student();
//
//        s.setName("Ajay");
//        s.setAge(20);
//
//        System.out.println(s.getName());
//        System.out.println(s.getAge());
//    }
//}

//  Example 2: With Validation
//class BankAccount {
//    private double balance;
//
//    void setBalance(double b) {
//        if (b > 0) {
//            balance = b;
//        } else {
//            System.out.println("Invalid amount");
//        }
//    }
//
//    double getBalance() {
//        return balance;
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        BankAccount acc = new BankAccount();
//
//        acc.setBalance(5000);
//        System.out.println(acc.getBalance());
//
//        acc.setBalance(-100); // invalid
//    }
//}

//  Example 3: Read-Only (Only Getter)
//class Employee {
//    private int id = 101;
//
//    int getId() {
//        return id;
//    }
//}

//  Example 4: Write-Only (Only Setter)
//class Password {
//    private String pwd;
//
//    void setPassword(String p) {
//        pwd = p;
//    }
//}

//  Example 5: Protected Example (Inheritance):
//class Person {
//    protected String name;
//}
//
//class Student extends Person {
//    void display() {
//        name = "Ajay";
//        System.out.println(name);
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        Student s = new Student();
//        s.display();
//    }
//}

//  Notes: protected → accessible in child class

//  Example 6: Example 6: Full Encapsulation (Best Practice)
//class Car {
//    private String model;
//    private int speed;
//
//    public void setModel(String m) {
//        model = m;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setSpeed(int s) {
//        if (s >= 0 && s <= 200) {
//            speed = s;
//        }
//    }
//
//    public int getSpeed() {
//        return speed;
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        Car c = new Car();
//
//        c.setModel("BMW");
//        c.setSpeed(150);
//
//        System.out.println(c.getModel());
//        System.out.println(c.getSpeed());
//    }
//}

//  Differences:
//        | Concept       | Meaning                 |
//        | ------------- | ----------------------- |
//        | Encapsulation | Wrapping data + methods |
//        | Data Hiding   | Restricting access      |
//        | Getter/Setter | Access & modify safely  |

//  Final:
//      Private variable + Public getter/setter = Encapsulation

