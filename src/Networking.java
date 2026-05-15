//  1. Networking
//  Definition:
//      Networking is the process of connecting multiple computers or devices to share data, resources, and services.
//      It allows communication between systems using protocols like TCP/IP.

//      Example:
//        Internet browsing
//        Sending emails
//        File sharing between systems

//  Java Example (Basic Networking – Get IP Address):
import java.net.InetAddress;

class NetworkingExample {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getLocalHost();
            System.out.println("IP Address: " + ip.getHostAddress());
            System.out.println("Host Name: " + ip.getHostName());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

//  Output:
//      IP Address: 192.168.29.49
//      Host Name: DESKTOP-211J92G

//  2. Client-Server:
//  Definition:
//      Client-Server Architecture is a model where:

//      Client sends request
//      Server processes request and sends response

//      Communication happens over a network.

//  Example:
//      Browser (Client) → Google Server
//      ATM Machine → Bank Server

//  Java Example (Simple Client-Server):
//  Server Program:
//import java.io.*;
//        import java.net.*;
//
//public class ServerExample {
//    public static void main(String[] args) {
//        try {
//            ServerSocket ss = new ServerSocket(5000);
//            System.out.println("Server is waiting...");
//
//            Socket s = ss.accept();
//            System.out.println("Client connected!");
//
//            DataInputStream dis = new DataInputStream(s.getInputStream());
//            String msg = dis.readUTF();
//
//            System.out.println("Client says: " + msg);
//
//            ss.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}

//  Client Program:
//import java.io.*;
//        import java.net.*;
//
//public class ClientExample {
//    public static void main(String[] args) {
//        try {
//            Socket s = new Socket("localhost", 5000);
//
//            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
//            dos.writeUTF("Hello Server!");
//
//            dos.flush();
//            dos.close();
//            s.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}

//  Output:
//  Server Side:
//      Server is waiting...
//      Client connected!
//      Client says: Hello Server!

//  3. Socket
//  Definition:
//      A Socket is an endpoint for communication between two machines over a network.
//      It connects client and server using IP address + port number.

//  Example:
//      Chat applications
//      Online games
//      Messaging systems

//  Java Example (Socket Communication – Chat Style)
//  Server:
//import java.io.*;
//        import java.net.*;
//
//public class SocketServer {
//    public static void main(String[] args) {
//        try {
//            ServerSocket ss = new ServerSocket(6000);
//            Socket s = ss.accept();
//
//            DataInputStream dis = new DataInputStream(s.getInputStream());
//            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
//
//            String msg = dis.readUTF();
//            System.out.println("Client: " + msg);
//
//            dos.writeUTF("Hello Client!");
//            dos.flush();
//
//            ss.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}

//  Client:
//import java.io.*;
//        import java.net.*;
//
//public class SocketClient {
//    public static void main(String[] args) {
//        try {
//            Socket s = new Socket("localhost", 6000);
//
//            DataInputStream dis = new DataInputStream(s.getInputStream());
//            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
//
//            dos.writeUTF("Hello Server!");
//            dos.flush();
//
//            String reply = dis.readUTF();
//            System.out.println("Server: " + reply);
//
//            s.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}

//  Output:
//      Client: Hello Server!
//      Server: Hello Client!

//  Simple Summary Table:
//          Concept	                    Meaning	                    Example
//          Networking	        Connecting devices	                Internet
//          Client-Server	    Request & Response model	        Browser & Web Server
//          Socket	        Communication endpoint (IP + Port)	    Chat App

