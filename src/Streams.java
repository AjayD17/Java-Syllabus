//  Streams in Java
//  Definition
//      A Stream is a flow of data used to read (input) or write (output) data.

//      Two types:
//          Input Stream → Read data
//          Output Stream → Write data

//      Types of Streams:
//                  Type	            Description
//              InputStream	        Reads data from source
//              OutputStream	    Writes data to destination

//  1. FileInputStream (Read File – Byte Stream)
//  Definition:
//      Used to read data from a file in byte format

//  Example 1: Read File (Character by Character)
//import java.io.FileInputStream;
//import java.io.IOException;
//
//public class Test {
//    public static void main(String[] args) {
//        try {
//            FileInputStream fis = new FileInputStream("test.txt");
//
//            int i;
//            while ((i = fis.read()) != -1) {
//                System.out.print((char) i);
//            }
//
//            fis.close();
//        } catch (IOException e) {
//            System.out.println("Error reading file");
//        }
//    }
//}

//  File Content (test.txt):
//      Hello Stream
//      Java I/O

//  Output:
//      Hello Stream
//      Java I/O

//  2. FileOutputStream (Write File)
//  Definition:
//      Used to write data into file in byte format

//  Example 2: Write Data
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//public class Test {
//    public static void main(String[] args) {
//        try {
//            FileOutputStream fos = new FileOutputStream("test.txt");
//
//            String data = "Hello FileOutputStream";
//            fos.write(data.getBytes());
//
//            fos.close();
//            System.out.println("Data written");
//        } catch (IOException e) {
//            System.out.println("Error writing file");
//        }
//    }
//}

//  Output:
//      Data written

//  File Content:
//      Hello FileOutputStream

//  3. Append using FileOutputStream
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//public class Test {
//    public static void main(String[] args) {
//        try {
//            FileOutputStream fos = new FileOutputStream("test.txt", true);
//
//            String data = "\nAppended line";
//            fos.write(data.getBytes());
//
//            fos.close();
//            System.out.println("Data appended");
//        } catch (IOException e) {
//            System.out.println("Error");
//        }
//    }
//}

//  Output:
//      Data appended

//  Updated File:
//      Hello FileOutputStream
//      Appended line

//  4. Read Using Byte Array (Efficient)
//import java.io.FileInputStream;
//import java.io.IOException;
//
//public class Test {
//    public static void main(String[] args) {
//        try {
//            FileInputStream fis = new FileInputStream("test.txt");
//
//            byte[] data = new byte[fis.available()];
//            fis.read(data);
//
//            System.out.println(new String(data));
//
//            fis.close();
//        } catch (IOException e) {
//            System.out.println("Error");
//        }
//    }
//}

//  Output:
//      Hello FileOutputStream
//      Appended line

//  5. Copy File (Real-time Example)
//import java.io.*;
//
//public class Test {
//    public static void main(String[] args) {
//        try {
//            FileInputStream fis = new FileInputStream("test.txt");
//            FileOutputStream fos = new FileOutputStream("copy.txt");
//
//            int i;
//            while ((i = fis.read()) != -1) {
//                fos.write(i);
//            }
//
//            fis.close();
//            fos.close();
//
//            System.out.println("File copied");
//        } catch (IOException e) {
//            System.out.println("Error");
//        }
//    }
//}

//  Output:
//      File copied

//      copy.txt will contain same data as test.txt

//  6. InputStream vs OutputStream
//          Feature	        InputStream	        OutputStream
//          Purpose	        Read data	        Write data
//          Example     	FileInputStream 	FileOutputStream
//          Direction	    Input → Program	    Program → File

//  Final Understanding:
//      Streams = data flow
//      FileInputStream → read bytes
//      FileOutputStream → write bytes
//      Used for files, images, audio

//  One-line Answer:
//      Streams in Java are used to handle input and output operations, where FileInputStream reads data and FileOutputStream writes data.


//  Difference Between Streams and File Class:
//  1. File Class
//  Definition:
//      The File class is used to create, delete, and get information about files and directories.
//      It does NOT read or write file content

//  Example:
//import java.io.File;
//
//public class Test {
//    public static void main(String[] args) {
//        File f = new File("test.txt");
//
//        System.out.println("File exists: " + f.exists());
//        System.out.println("File name: " + f.getName());
//    }
//}

//  Output:
//      File exists: true
//      File name: test.txt

//  2. Streams (Input/Output)
//  Definition:
//      Streams are used to read and write data inside the file
//      It handles actual content

//  Example:
//import java.io.FileInputStream;
//
//public class Test {
//    public static void main(String[] args) {
//        try {
//            FileInputStream fis = new FileInputStream("test.txt");
//
//            int i;
//            while((i = fis.read()) != -1) {
//                System.out.print((char)i);
//            }
//
//            fis.close();
//        } catch(Exception e) {
//            System.out.println("Error");
//        }
//    }
//}

//  Output:
//      Hello Java

//  Key Differences Table:
//          Feature     	File Class	             Streams
//          Purpose	        Manage file	             Read/Write data
//          Data handling	No                       Yes
//          Example	        File	                 FileInputStream, FileOutputStream
//          Operation	    Create, delete, info	 Input/Output
//          Level	        High-level	             Low-level

//  Easy Understanding:
//      File Class = File details (name, path, exists)
//      Streams = File content (read/write data)

//  Real-life Analogy:
//      File Class = 📁 file info (name, location)
//      Streams = 📖 reading/writing inside file

//  One-line Answer:
//      File class is used to manage files, whereas streams are used to read and write data in files.