//  Example 1: Java Example (Simple Client-Server)
//  Server Program:
//import java.io.*;
//import java.net.*;
//
//class ServerExample {
//    public static void main(String[] args) {
//        try {
//            ServerSocket ss = new ServerSocket(5000);
//            System.out.println("Server is waiting...");
//
//            while (true) {   // important (continuous running)
//                Socket s = ss.accept();
//                System.out.println("Client connected!");
//
//                DataInputStream dis = new DataInputStream(s.getInputStream());
//                String msg = dis.readUTF();
//
//                System.out.println("Client says: " + msg);
//
//                dis.close();
//                s.close();   // close only client socket, not server
//            }
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}

//  Example 2: Java Example (Socket Communication – Chat Style)
//  Server:
import java.io.*;              // Input Output classes import
import java.net.*;             // Networking classes import

class SocketServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(3000); // Server create at port 6000
            System.out.println("Server is waiting..."); // Waiting message

            Socket s = ss.accept(); // Accept client connection
            System.out.println("Client connected!"); // Confirmation

            DataInputStream dis = new DataInputStream(s.getInputStream());   // Receive data
            DataOutputStream dos = new DataOutputStream(s.getOutputStream()); // Send data

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Read from keyboard

            String clientMsg = "", serverMsg = "";

            while (!clientMsg.equals("bye")) { // Loop until client says bye

                clientMsg = dis.readUTF(); // Receive message from client
                System.out.println("Client: " + clientMsg); // Print client message

                serverMsg = br.readLine(); // Read message from server user (keyboard)
                dos.writeUTF(serverMsg);   // Send message to client
                dos.flush();               // Force send immediately
            }

            s.close();  // Close client socket
            ss.close(); // Close server

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


//  Step 1: Set Java Environment Variables (Windows)
//  1. Open Environment Variables:
//      1. Press Windows key
//      2. Type: Environment Variables
//      3. Click 👉 Edit the system environment variables
//      4. Click 👉 Environment Variables

//  2. Add Java Path (PATH Variable):
//      1. Under System Variables
//      2. Select 👉 Path
//      3. Click 👉 Edit
//      4. Click 👉 New
//      5. Add this path:
//          C:\Users\Ajay\.jdks\openjdk-26\bin
//      6. Click 👉 OK → OK → OK

//  3. (Optional but Recommended) Add JAVA_HOME
//      1.Click 👉 New (System Variable)
//      2. Variable Name:
//          JAVA_HOME
//      3. Variable Value:
//          C:\Users\Ajay\.jdks\openjdk-26
//      4. Click 👉 OK

//  4. Restart Command Prompt
//      👉 Close all CMD windows
//      👉 Open a new CMD

//  5. Verify Installation
//      java -version
//      javac -version

//  Expected output:
//      java 26
//      javac 26

//  Step 2: Run Java Program in CMD
//  1. Go to Project Folder
//      cd "C:\Users\Ajay\IdeaProjects\Java Syllabus\src"
//  2. Compile Java Files
//      javac SocketServer.java
//      javac SocketClient.java
//  3. Run Server
//      java SocketServer
//  Output:
//      Server is waiting...
//  4. Run Client (New CMD Window)
//      cd "C:\Users\Ajay\IdeaProjects\Java Syllabus\src"
//      java SocketClient

//  Important Notes:
//  1. Do NOT use:
//      java SocketServer.java ❌
//  Use:
//      java SocketServer ✔

//  2. Always Run Order:
//      1. Server
//      2. Client

//  3. If error:
//      “Address already in use” → stop old server
//      “Connection refused” → server not started

//  Final Summary:
//          Step	    Action
//           1	        Set PATH
//           2	        Restart CMD
//           3	        Compile using javac
//           4	        Run using java
//           5	        Start Server first


