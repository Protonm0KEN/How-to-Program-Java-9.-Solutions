package Exercise4_1;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {

        //It was stated on page 136 that in every painComponent method, this statement should always be first
        super.paintComponent(g);


        //Declaring and initializing local variables
        int width = this.getWidth();//Getting the width of this panel and assigning to variable width
        int height = this.getHeight();//Getting height of this panel and assigning to variable height
        int steps = 50; // I choose 50 for some different perspective. This variable shows number of steps ( lines ) to show from each corner

        //Step sizes + explicit conversion
        double xStep = (double) width / steps;
        double yStep = (double) height / steps;


        /*After resizing window, the whole picture will be redrawn with new sizes*/
        for(int i = 0; i<=steps; i++){
            int xVal = (int) (i * xStep);
            int yVal = (int) (i * yStep);

            g.drawLine(0,0, xVal, height-yVal);//From top left corner to bottom right
            g.drawLine(width,height, xVal, height-yVal);//From bottom right corner to top left
            g.drawLine(width,0, width-xVal, height-yVal);//From top right corner to bottom left
            g.drawLine(0,height, width-xVal, height-yVal);//From bottom left corner to top right
        }
    }
}
