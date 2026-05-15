//  Java Swing (Basics)
//  Definition
//      Java Swing is a GUI (Graphical User Interface) toolkit used to create windows-based applications.

//      It is part of:
//              javax.swing
//  Main Components
//        Component	        Description
//        JFrame	        Main window
//        JLabel	        Displays text or image

//  1. JFrame
//  Definition:
//      JFrame is a top-level container (window) used to create an application window.

//  Example 1: Simple Window
//import javax.swing.*;
//
//public class Test {
//    public static void main(String[] args) {
//        JFrame f = new JFrame("My First Window");
//
//        f.setSize(400, 300);
//        f.setVisible(true);
//    }
//}

//  Output:
//      A window appears with title “My First Window”

//  2. JLabel
//  Definition:
//      JLabel is used to display text or images in the window.

//  Example 2: JFrame + JLabel
//import javax.swing.*;
//
//public class Test {
//    public static void main(String[] args) {
//        JFrame f = new JFrame("Label Example");
//
//        JLabel l = new JLabel("Hello Java Swing");
//        l.setBounds(100, 100, 200, 30);
//
//        f.add(l);
//
//        f.setSize(400, 300);
//        f.setLayout(null);
//        f.setVisible(true);
//    }
//}

//  Output:
//      Window with text:
//      Hello Java Swing

//  3. Multiple Labels (UI Design)
//import javax.swing.*;
//
//public class Test {
//    public static void main(String[] args) {
//        JFrame f = new JFrame("Multiple Labels");
//
//        JLabel l1 = new JLabel("Name:");
//        JLabel l2 = new JLabel("Age:");
//
//        l1.setBounds(50, 50, 100, 30);
//        l2.setBounds(50, 100, 100, 30);
//
//        f.add(l1);
//        f.add(l2);
//
//        f.setSize(400, 300);
//        f.setLayout(null);
//        f.setVisible(true);
//    }
//}

//  Output:
//      Window showing:
//      Name:
//      Age:

//  4. Styled Label
//import javax.swing.*;
//        import java.awt.*;
//
//public class Test {
//    public static void main(String[] args) {
//        JFrame f = new JFrame("Styled Label");
//
//        JLabel l = new JLabel("Welcome Ajay");
//        l.setBounds(100, 100, 200, 30);
//
//        l.setFont(new Font("Arial", Font.BOLD, 16));
//        l.setForeground(Color.BLUE);
//
//        f.add(l);
//
//        f.setSize(400, 300);
//        f.setLayout(null);
//        f.setVisible(true);
//    }
//}

//  Output:
//      Blue colored bold text:
//      Welcome Ajay

//  5. Real UI Example
//import javax.swing.*;
//
//class Tested {
//    public static void main(String[] args) {
//        JFrame f = new JFrame("Student Info");
//
//        JLabel l1 = new JLabel("Student Name: Ajay");
//        JLabel l2 = new JLabel("Course: Java");
//
//        l1.setBounds(50, 50, 200, 30);
//        l2.setBounds(50, 100, 200, 30);
//
//        f.add(l1);
//        f.add(l2);
//
//        f.setSize(400, 300);
//        f.setLayout(null);
//        f.setVisible(true);
//    }
//}

//  Important Methods
//          Method	            Use
//          setSize()	        Set window size
//          setVisible()	    Show window
//          setLayout(null)	    Manual layout
//          setBounds()	        Position component
//          add()	            Add component

//  Final Understanding
//      JFrame → main window
//      JLabel → display text
//      Used to build UI

//  One-line Answer:
//      JFrame is used to create a window, and JLabel is used to display text in a Java Swing GUI application.

