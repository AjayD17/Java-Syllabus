//  Layouts in Java (AWT/Swing)
//  Definition
//      A Layout Manager in Java is used to arrange and organize components (like buttons, labels, text fields) inside a container (such as a Frame or Panel). It automatically controls the position and size of components, making the UI flexible and responsive.
//
//  1. FlowLayout
//  Definition
//      FlowLayout arranges components in a left-to-right sequence, just like words in a paragraph. When there is no more space in a row, components move to the next line.

//  Key Features
//      Default layout for Panel
//      Components are added in order

//  Alignments:
//      LEFT
//      CENTER (default)
//      RIGHT
//  Supports horizontal and vertical gaps

//  Syntax
//      setLayout(new FlowLayout());
//              or
//      setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

//Example Program:
//import java.awt.*;
//
//class FlowExample {
//    public static void main(String[] args) {
//        Frame f = new Frame("FlowLayout Example");
//
//        f.setLayout(new FlowLayout());
//
//        f.add(new Button("One"));
//        f.add(new Button("Two"));
//        f.add(new Button("Three"));
//        f.add(new Button("Four"));
//
//        f.setSize(300, 200);
//        f.setVisible(true);
//    }
//}

//  Output Behavior
//      Buttons appear in a row
//      When window shrinks → move to next line automatically

//  Real-Life Analogy:
//  Like arranging books on a shelf:
//      When shelf is full → books move to next row

//  2. GridLayout
//  Definition
//      GridLayout arranges components in a grid of rows and columns. Each cell in the grid is of equal size, and each component occupies one cell.

//  Key Features
//      Fixed number of rows and columns
//      All components get equal space
//      No overlapping
//      Filled row by row

//  Syntax
//      setLayout(new GridLayout(rows, columns));
//                  or
//      setLayout(new GridLayout(2, 3, 10, 10));

//  Example Program:
//import java.awt.*;
//
//class GridExample {
//    public static void main(String[] args) {
//        Frame f = new Frame("GridLayout Example");
//
//        f.setLayout(new GridLayout(2, 3));
//
//        f.add(new Button("1"));
//        f.add(new Button("2"));
//        f.add(new Button("3"));
//        f.add(new Button("4"));
//        f.add(new Button("5"));
//        f.add(new Button("6"));
//
//        f.setSize(300, 200);
//        f.setVisible(true);
//    }
//}

//  Output Behavior
//      2 rows and 3 columns
//      All buttons same size
//      No wrapping like FlowLayout

//  Real-Life Analogy
//  Like a chessboard:
//      Fixed rows and columns
//      Each box equal size

//  Difference Between FlowLayout and GridLayout:
//          Feature         	    FlowLayout	                GridLayout
//          Arrangement	   Left to right, then next line	Rows and columns grid
//      Size of components	    Based on preferred size	    All components equal size
//          Flexibility	            More flexible	            Strict structure
//          Wrapping	                Yes	                        No
//          Use Case	      Simple UI, dynamic layout	    Structured UI like calculator

//  When to Use What?
//      Use FlowLayout: When you want a flexible, natural arrangement
//      Use GridLayout: When you need a fixed structure (like forms, calculator UI)



