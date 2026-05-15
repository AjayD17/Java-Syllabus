//  Constructor in Java:
//  What is a Constructor?
//      Definition:
//          A constructor is a special method used to initialize objects when they are created.
//          It is automatically called when you use new.

//      Key Rules of Constructor
//          Name must be same as class name
//          No return type (not even void)
//          Called automatically when object is created
//          Used to initialize variables

//  Example Class (Car):
//class Carss {
//    String color;
//    String model;
//}

//  1. Default Constructor
//  Definition:
//      A constructor without parameters is called a default constructor.
//      If you don’t write any constructor, Java automatically provides one.

//  Example:
class Cars {
    String color;
    String model;

    // Default Constructor
    Cars() {
        color = "Black";
        model = "BMW";
    }
}

class Maintain {
    public static void main(String[] args) {

        Cars c1 = new Cars(); // constructor called

        System.out.println(c1.color);
        System.out.println(c1.model);
    }
}

//  Output:
//      Black
//      BMW

//      Step 1:
//  Main method start
//        ↓
//      Step 2:
//  Car c1 = new Car();
//        ↓
//      Step 3:
//  Memory allocate (Heap)
//        ↓
//  c1 ─────────► [ Car Object ]
//      color = ?
//      model = ?
//        ↓
//      Step 4:
//  Constructor call automatically
//        ↓
//  Car() {
//      color = "Black";
//      model = "BMW";
//  }
//        ↓
//      Step 5:
//  Values assigned
//        ↓
//  c1 ─────────► [ Car Object ]
//                      color = Black
//                      model = BMW
//        ↓
//      Step 6:
//  Print values
//        ↓
//  Output:
//      Black
//      BMW


//  2. Parameterized Constructor
//      Definition:
//          A constructor that takes arguments (parameters) to initialize values.

//  Example:
class Bike {
    String color;
    String model;

    // Parameterized Constructor
    Bike(String c, String m) {
        color = c;
        model = m;
    }
}

class constructor {
    public static void main(String[] args) {

        Bike c1 = new Bike("Red", "Yamaha");
        Bike c2 = new Bike("Blue", "R15");

        System.out.println(c1.color + " " + c1.model);
        System.out.println(c2.color + " " + c2.model);
    }
}

//  Output:
//      Red Yamaha
//      Blue R15

// Workflow (Parameterized Constructor):
//      Step 1:
//  Main method start
//        ↓
//      Step 2:
//  Car c1 = new Car("Red", "Audi");
//        ↓
//      Step 3:
//  Memory allocate (Heap)
//        ↓
//  c1 ─────────► [ Car Object ]
//                  color = ?
//                  model = ?
//        ↓
//      Step 4:
//  Constructor call with values
//        ↓
//  Car("Red", "Audi")
//        ↓
//  c = "Red"
//  m = "Audi"
//        ↓
//      Step 5:
//  Assign values
//        ↓
//  color = c  → Red
//  model = m  → Audi
//        ↓
//      Step 6:
//  Final Object
//        ↓
//  c1 ─────────► [ Car Object ]
//              color = Red
//              model = Audi
//        ↓
//      Step 7:
//  Print values
//        ↓
//  Output:
//      Red Audi


//  3. Using this keyword (Best Practice)
//      this refers to current object

class Taxi {
    String color;
    String model;

    Taxi(String color, String model) {
        this.color = color;
        this.model = model;
    }
}

// Workflow:
//      Step 1:
//  Object creation
//        ↓
//  Car c1 = new Car("Blue", "BMW");
//        ↓
//      Step 2:
//  Constructor call
//        ↓
//  Car(String color, String model)
//        ↓
//  Parameter:
//      color = "Blue"
//      model = "BMW"
//        ↓
//      Step 3:
//    this keyword usage
//        ↓
//     this.color = color
//     this.model = model
//        ↓
//  (Left side → instance variable)
//  (Right side → parameter)
//        ↓
//      Step 4:
//  Values stored in object
//        ↓
//  c1 ─────────► [ Car Object ]
//              color = Blue
//              model = BMW
//        ↓
//      Step 5:
//  Use object


//  4. Default vs Parameterized
//      Feature	        Default Constructor	        Parameterized Constructor
//      Parameters	            No	                        Yes
//      Values	                Fixed	                    Dynamic
//      Flexibility	            Low	                        High

//      Default → fixed setup
//      Parameterized → user input setup

//  5. Important Note:
//      If you create a parameterized constructor:
//      Car(String c) { }
//      Java will NOT create default constructor automatically

//  So this will cause error:
//      Car c1 = new Car(); ❌Car

