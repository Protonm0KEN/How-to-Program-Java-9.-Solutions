//Import declaration to state the default package as a Exercise4_1
package Exercise4_1;
import javax.swing.*;
import java.awt.*;

/*
*
* Using loops and control statements to draw lines can lead to many interesting designs.
a) Create the design in the left screen capture of Fig. 4.20. This design draws lines from
the top-left corner, fanning them out until they cover the upper-left half of the panel.
One approach is to divide the width and height into an equal number of steps (we found
15 steps worked well). The first endpoint of a line will always be in the top-left corner
(0, 0). The second endpoint can be found by starting at the bottom-left corner and
moving up one vertical step and right one horizontal step. Draw a line between the two
endpoints. Continue moving up and to the right one step to find each successive endpoint. The figure should scale accordingly as you resize the window.
b) Modify part (a) to have lines fan out from all four corners, as shown in the right screen
capture of Fig. 4.20. Lines from opposite corners should intersect along the middle.
*
* */


/*
*
* b) Modify part (a) to have lines fan out from all four corners, as shown in the right screen
capture of Fig. 4.20. Lines from opposite corners should intersect along the middle.
* */


//class declaration with access modifier public
public class DrawPanelTest
{//Beginning of class declaration's body

    //Method main header, the special method that is called by JVM to run the Java Application DrawPanelTest
    public static void main(String[] args) { //Beginning of main method body

        DrawPanel panel = new DrawPanel();//panel that contains drawings

        JFrame applicationFrame = new JFrame();//frame to insert the drawings from the panel


        applicationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Setting the closing operation and to terminate application after closing window

        applicationFrame.setPreferredSize(new Dimension(250,250)); //Setting default initial size of the frame

        applicationFrame.add(panel);//Adding the panel to the frame
        applicationFrame.pack();//Setting the preferred size for all panels
        applicationFrame.setVisible(true);//making the frame visible
    }//End of main method body
}//End of class declaration's body
