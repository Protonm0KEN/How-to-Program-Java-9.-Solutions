package Exercise4_2;

/*
* Figure 4.21 displays two additional designs created using while loops and drawLine.
a) Create the design in the left screen capture of Fig. 4.21. Begin by dividing each edge
into an equal number of increments (we chose 15 again). The first line starts in the topleft corner and ends one step right on the bottom edge. For each successive line, move
down one increment on the left edge and right one increment on the bottom edge. Continue drawing lines until you reach the bottom-right corner. The figure should scale as
you resize the window so that the endpoints always touch the edges.
b) Modify your answer in part (a) to mirror the design in all four corners, as shown in the
right screen capture of Fig. 4.21.
*
* */

//Import declarations to import Swing classes
import javax.swing.*;
import java.awt.*;


//Public class declaration ( with same source file name) of class DrawPanelTest ( driver class) to execute application
public class DrawPanelTest {//Beginning of class declaration's body

    static void main() {//Start of method declaration's body

        JFrame applicationFrame = new JFrame();//Declaring and initializing the frame to store the drawings of drawPanel

        DrawPanel drawPanel = new DrawPanel();//Declaring and initializing the object of drawings: drawPanel

        applicationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Setting the default close operation to terminate the application after closing the window
        applicationFrame.setPreferredSize(new Dimension(250,250));//Setting default initial size of the window ( can be resizable)
        applicationFrame.add(drawPanel);//Adding the panel to the frame
        applicationFrame.pack();//Setting the preferred sizes to all GUI components attached to frame
        applicationFrame.setVisible(true);//making the frame visible
    }//End of method declaration body
}//End of class declaration's body
