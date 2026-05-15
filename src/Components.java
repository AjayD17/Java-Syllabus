//  Swing Components & Events in Java
//  Definition
//      Components are UI elements like buttons and text fields used in GUI.
//      Events are actions (like click, typing) handled using event listeners.

//      Main Components
//              Component	        Description
//              JButton	        Button (click action)
//              JTextField	        Input text field
//
//      Event Handling:
//          Event is handled using:
//                  addActionListener()
//  1. JButton (Button Click Event)
//  Definition:
//      Button triggers an action when clicked

//  Example 1: Simple Button Click
//import javax.swing.*;
//import java.awt.event.*;
//
//class Testings {
//    public static void main(String[] args) {
//
//        JFrame f = new JFrame("Button Example");
//
//        JButton b = new JButton("Click Me");
//        b.setBounds(100, 100, 120, 30);
//
//        b.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Button Clicked");
//            }
//        });
//
//        f.add(b);
//
//        f.setSize(400, 300);
//        f.setLayout(null);
//        f.setVisible(true);
//    }
//}

//  Output:
//      Console:  Button Clicked

//  2. JTextField (User Input)
//  Definition:
//      Used to take input from user

//  Example 2: Read Input
//import javax.swing.*;
//        import java.awt.event.*;
//
//public class Test {
//    public static void main(String[] args) {
//
//        JFrame f = new JFrame("TextField Example");
//
//        JTextField tf = new JTextField();
//        tf.setBounds(100, 50, 150, 30);
//
//        JButton b = new JButton("Show");
//        b.setBounds(100, 100, 100, 30);
//
//        b.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                System.out.println(tf.getText());
//            }
//        });
//
//        f.add(tf);
//        f.add(b);
//
//        f.setSize(400, 300);
//        f.setLayout(null);
//        f.setVisible(true);
//    }
//}

//  Output:
//      If user types: Ajay
//      Ajay

//  3. Button + Label Update (Real UI)
//import javax.swing.*;
//        import java.awt.event.*;
//
//public class Test {
//    public static void main(String[] args) {
//
//        JFrame f = new JFrame("UI Example");
//
//        JTextField tf = new JTextField();
//        tf.setBounds(100, 50, 150, 30);
//
//        JLabel l = new JLabel();
//        l.setBounds(100, 150, 200, 30);
//
//        JButton b = new JButton("Submit");
//        b.setBounds(100, 100, 100, 30);
//
//        b.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                l.setText("Hello " + tf.getText());
//            }
//        });
//
//        f.add(tf);
//        f.add(b);
//        f.add(l);
//
//        f.setSize(400, 300);
//        f.setLayout(null);
//        f.setVisible(true);
//    }
//}

//  Output:
//    If user enters Ajay → label shows:
//      Hello Ajay

//  4. Multiple Buttons (Different Events)
//import javax.swing.*;
//        import java.awt.event.*;
//
//public class Test {
//    public static void main(String[] args) {
//
//        JFrame f = new JFrame("Multiple Buttons");
//
//        JButton b1 = new JButton("Yes");
//        JButton b2 = new JButton("No");
//
//        b1.setBounds(80, 100, 80, 30);
//        b2.setBounds(180, 100, 80, 30);
//
//        b1.addActionListener(e -> System.out.println("Yes Clicked"));
//        b2.addActionListener(e -> System.out.println("No Clicked"));
//
//        f.add(b1);
//        f.add(b2);
//
//        f.setSize(400, 300);
//        f.setLayout(null);
//        f.setVisible(true);
//    }
//}

//  Output:
//      Yes Clicked
//      No Clicked

//  5. Clear TextField Example
//import javax.swing.*;
//        import java.awt.event.*;
//
//public class Test {
//    public static void main(String[] args) {
//
//        JFrame f = new JFrame("Clear Example");
//
//        JTextField tf = new JTextField();
//        tf.setBounds(100, 50, 150, 30);
//
//        JButton b = new JButton("Clear");
//        b.setBounds(100, 100, 100, 30);
//
//        b.addActionListener(e -> tf.setText(""));
//
//        f.add(tf);
//        f.add(b);
//
//        f.setSize(400, 300);
//        f.setLayout(null);
//        f.setVisible(true);
//    }
//}

//  Key Methods
//      Method          	    Use
//      setText()	            Set text
//      getText()	            Get text
//      addActionListener()	    Handle event

//  Final Understanding
//      JButton → triggers action
//      JTextField → user input
//      Event → user interaction

//  One-line Answer:
//      Swing components like JButton and JTextField are used to create UI, and events are used to handle user actions like button clicks.


