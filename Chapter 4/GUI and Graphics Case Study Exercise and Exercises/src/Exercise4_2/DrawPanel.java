package Exercise4_2;
//Import declarations to import Swing classes
import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        //The first statement in every painComponent
        super.paintComponent(g);

        //Getting the width and height of this Panel every time it is resized
        int width = this.getWidth();//Declaring and assigning the width of this panel to variable: width
        int height = this.getHeight();//Declaring and assigning the height of this panel to variable: height
        int steps = 500;//Setting a lot of steps to make it more beautiful

        double xStep = (double) width /steps;//Setting the step size depending on size of window ( updates during resizing)
        double yStep = (double) height /steps;//Setting the step size depending on size of window ( updates during resizing)

        //Loop to draw all for parts of the image
        for(int i = 0; i<=steps; i++){
            //Setting the increment for the line
            int xVal = (int) (i*xStep);
            int yVal = (int) (i*yStep);

            //Statements that draw the picture
            g.drawLine(0, yVal, xVal, height);
            g.drawLine(width, yVal, width-xVal, height);
            g.drawLine(0, height-yVal, xVal, 0);
            g.drawLine(xVal,0, width, yVal);
        }
    }
}
