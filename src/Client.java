//  Java Example (Simple Client-Server):
//  Client Program:
//import java.io.*;
//import java.net.*;
//
//class ClientExample {
//    public static void main(String[] args) {
//        try {
//            Socket s = new Socket("localhost", 5000);
//
//            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
//            dos.writeUTF("Hello Server!");
//
//            dos.flush();
//
//            dos.close();
//            s.close();
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}

//  Example 2: Java Example (Socket Communication – Chat Style)
//  Client:
import java.io.*;              // Input Output classes import
import java.net.*;             // Networking classes import

class SocketClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 3000); // Connect to server

            DataInputStream dis = new DataInputStream(s.getInputStream());   // Receive data
            DataOutputStream dos = new DataOutputStream(s.getOutputStream()); // Send data

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Read from keyboard

            String clientMsg = "", serverMsg = "";

            while (!clientMsg.equals("bye")) { // Loop until user types bye

                clientMsg = br.readLine(); // Read message from client user (keyboard)
                dos.writeUTF(clientMsg);   // Send message to server
                dos.flush();               // Force send

                serverMsg = dis.readUTF(); // Receive reply from server
                System.out.println("Server: " + serverMsg); // Print server reply
            }

            s.close(); // Close socket

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


