//  File Handling in Java
//  Definition
//      File Handling in Java is used to create, read, write, and manage files stored in the system.

//      Important classes:
//          File  →  create/manage file
//          FileWriter  →  write data
//          FileReader / BufferedReader  →  read data

//  1. File Class (Create File)
//  Definition:
//      File class is used to create and handle files

//  Example: Create File
//import java.io.File;
//import java.io.IOException;
//
//class Tested {
//    public static void main(String[] args) {
//        try {
//            File f = new File("test.txt");
//
//            if (f.createNewFile()) {
//                System.out.println("File created: " + f.getName());
//            } else {
//                System.out.println("File already exists");
//            }
//        } catch (IOException e) {
//            System.out.println("Error occurred");
//        }
//    }
//}

//  Output:
//      File created: test.txt
//              (or)
//      File already exists

//  2. FileWriter (Write to File)
//  Definition:
//      Used to write data into a file

//  Example: Write File
//import java.io.FileWriter;
//import java.io.IOException;
//
//class Tested {
//    public static void main(String[] args) {
//        try {
//            FileWriter fw = new FileWriter("test.txt");
//            fw.write("Hello Java File Handling");
//            fw.close();
//
//            System.out.println("Data written successfully");
//        } catch (IOException e) {
//            System.out.println("Error writing file");
//        }
//    }
//}

//  Output:
//      Data written successfully

//  File content:
//      Hello Java File Handling

//  3. FileReader (Read File)
//  Definition:
//      Used to read data from file

//  Example: Read File
//import java.io.FileReader;
//import java.io.IOException;
//
//class Tested {
//    public static void main(String[] args) {
//        try {
//            FileReader fr = new FileReader("test.txt");
//            int i;
//
//            while ((i = fr.read()) != -1) {
//                System.out.print((char) i);
//            }
//
//            fr.close();
//        } catch (IOException e) {
//            System.out.println("Error reading file");
//        }
//    }
//}

//  Output:
//      Hello Java File Handling

//  4. BufferedReader (Better Reading)
//  Definition:
//      Reads file line by line (efficient)

//  Example:
//import java.io.*;
//
//public class Test {
//    public static void main(String[] args) {
//        try {
//            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
//
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//
//            br.close();
//        } catch (IOException e) {
//            System.out.println("Error");
//        }
//    }
//}

//  Suppose file test.txt contains:
//      Hello Java
//      Welcome to File Handling

//  Output:
//      Hello Java
//      Welcome to File Handling

//  5. Append Data to File
//  Example:
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class Test {
//    public static void main(String[] args) {
//        try {
//            FileWriter fw = new FileWriter("test.txt", true); // append mode
//            fw.write("\nNew line added");
//            fw.close();
//
//            System.out.println("Data appended");
//        } catch (IOException e) {
//            System.out.println("Error");
//        }
//    }
//}

//  Output:
//      Data appended

//  Updated File Content:
//      Hello Java
//      Welcome to File Handling
//      New line added

//  6. Delete File
//  Example:
//import java.io.File;
//
//public class Test {
//    public static void main(String[] args) {
//        File f = new File("test.txt");
//
//        if (f.delete()) {
//            System.out.println("File deleted");
//        } else {
//            System.out.println("Failed to delete");
//        }
//    }
//}

//  Output (if file exists):
//      File deleted

//  Output (if file not found):
//      Failed to delete

//  7. File Information
//  Example:
//import java.io.File;
//
//public class Test {
//    public static void main(String[] args) {
//        File f = new File("test.txt");
//
//        if (f.exists()) {
//            System.out.println("File name: " + f.getName());
//            System.out.println("Path: " + f.getAbsolutePath());
//            System.out.println("Writable: " + f.canWrite());
//        }
//    }
//}

//  Output (example):
//      File name: test.txt
//      Path: C:\Users\YourName\test.txt
//      Writable: true

//  Output (if file missing):
//      File does not exist

//  Final Summary:
//          Concept	            Use
//          File	            Create & manage file
//          FileWriter	        Write data
//          FileReader	        Read data
//          BufferedReader	    Read efficiently
//          Append	            Add data
//          Delete	            Remove file

//  One-line Answer:
//      File handling in Java is used to create, read, write, and manage files using classes like File, FileWriter, and FileReader.


