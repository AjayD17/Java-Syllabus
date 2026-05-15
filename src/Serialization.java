//  1. Serialization
//  Definition:
//      Serialization is the process of converting a Java object into a byte stream so that it can be:

//        * saved to a file
//        * sent over a network
//        * stored in a database

//        Opposite process = Deserialization

//  Real-Life Example:
//      Saving a game progress
//      Sending object data through sockets

//  Example program:
//import java.io.*;
//
////    Object class
//class Students implements Serializable {
//    int id;
//    String name;
//
//    Students(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//}
//
//class SerializationFullDemo {
//    public static void main(String[] args) {
//        try {
//            // =========================
//            // OBJECT (Human readable):
//            // =========================
//            Students s1 = new Students(101, "Ajay");
//            System.out.println("Object Form: " + s1.id + " " + s1.name);
//
//            // =========================
//            // SERIALIZATION (Object → Byte):
//            // =========================
//            FileOutputStream fos = new FileOutputStream("student.ser");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//
//            oos.writeObject(s1); // convert object → byte
//
//            oos.close();
//            fos.close();
//
//            System.out.println("\nByte Form (Raw Data in File):");
//
//            // Show actual byte values
//            FileInputStream fis = new FileInputStream("student.ser");
//            int b;
//
//            while ((b = fis.read()) != -1) {
//                System.out.print(b + " ");
//            }
//
//            fis.close();
//
//            // =========================
//            // DESERIALIZATION (Byte → Object):
//            // =========================
//            FileInputStream fis2 = new FileInputStream("student.ser");
//            ObjectInputStream ois = new ObjectInputStream(fis2);
//
//            Students s2 = (Students) ois.readObject();
//
//            System.out.println("\n\nDeserialized Object: " + s2.id + " " + s2.name);
//
//            ois.close();
//            fis2.close();
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}

//  2. Object Storage
//  Definition:
//      Object Storage means storing complete objects (data + structure) in a storage system.

//      In Java:
//          Done using Serialization
//          Stored in files or databases

//  Real-Life Example:
//      Saving user profile object
//      Storing employee records

//  Java Example (Store Multiple Objects):
//  FULL WORKING CODE (STORE + READ):
//import java.io.*;
//
//class Employee implements Serializable {
//    int id;
//    String name;
//
//    Employee(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//}
//
//class Maintains {
//    public static void main(String[] args) throws Exception {
//
//        // WRITE
//        ObjectOutputStream oos =
//                new ObjectOutputStream(new FileOutputStream("emp.dat"));
//
//        oos.writeObject(new Employee(1, "Ajay"));
//        oos.writeObject(new Employee(2, "Kumar"));
//
//        oos.close();
//
//        // READ
//        ObjectInputStream ois =
//                new ObjectInputStream(new FileInputStream("emp.dat"));
//
//        Employee e1 = (Employee) ois.readObject();
//        Employee e2 = (Employee) ois.readObject();
//
//        System.out.println(e1.id + " " + e1.name);
//        System.out.println(e2.id + " " + e2.name);
//
//        ois.close();
//    }
//}

//  Output:
//      1 Ajay
//      2 Kumar

//  3. File Save
//  Definition:
//      File Save is the process of storing data into a file in the form of:

//      text
//      binary
//      objects

//  Real-Life Example:
//      Saving notes in a .txt file
//      Writing logs to a file

//  Java Example (Save Text File):
//import java.io.*;
//class FileSaveExample {
//    public static void main(String[] args) {
//        try {
//            FileWriter fw = new FileWriter("data.txt");
//            fw.write("Hello Ajay!");
//            fw.write("\nJava File Handling");
//
//            fw.close();
//
//            System.out.println("File saved successfully");
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}

//  Different Angles (Comparison):
//      Concept	        Purpose	                Data Type	        Example Use
//      Serialization	Object → Byte stream	Objects	            Network, file
//      Object Storage	Store full objects	    Objects	            Database/file
//      File Save	    Store raw data	        Text/Binary	        Logs, notes

//  Simple Understanding:
//      Serialization → Convert object
//      Object Storage → Store object
//      File Save → Save data

//  Final Insight:
//      All three are connected:
//          Serialization → convert
//          Object Storage → store
//          File Save → location

