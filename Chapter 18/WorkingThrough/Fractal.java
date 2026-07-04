import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class FractalJPanel extends JPanel{
    private Color color;
    private int level;
    private static final int WIDTH = 400;
    private static final int HEIGHT = 400;

    public FractalJPanel( int currentLevel ) {
        this.color = Color.BLUE;
        this.level = currentLevel;
        setBackground( Color.WHITE );
        setPreferredSize( new Dimension( WIDTH, HEIGHT) );
    }

    public void drawFractal( int level, int xA, int yA, int xB, int yB, Graphics g ) {
        if ( level == 0 )
            g.drawLine( xA, yA, xB, yB);
        else {
            int xC = ( xA + xB ) / 2;
            int yC = ( yA + yB ) / 2;

            int xD = xA + ( xC - xA ) / 2 - ( yC - yA ) / 2;
            int yD = yA + ( yC - yA ) / 2 + ( xC - xA ) / 2;

            drawFractal( level-1, xD, yD, xA, yA, g );
            drawFractal( level - 1, xD, yD, xC, yC, g );
            drawFractal( level-1, xD, yD, xB, yB, g );
        }
    }

    public void paintComponent( Graphics g ) {
        super.paintComponent( g );

        g.setColor( color );
        drawFractal( level, 100, 90, 290, 200, g );
    }

    public void setColor( Color c ) {
        color = c;
    }

    public void setLevel( int currentLevel ) {
        level = currentLevel;
    }
    
    public int getLevel() {
        return level;
    }

}

public class Fractal extends JFrame {
    private static final int WIDTH = 400;
    private static final int HEIGHT = 480;
    private static final int MIN_LEVEL = 0, MAX_LEVEL = 20;

    private JButton changeColorJButton, increaseLevelJButton, decreaseLevelJButton;
    private JLabel levelJLabel;
    private FractalJPanel drawSpace;
    private JPanel mainJPanel, controlJPanel;

    public Fractal() {
        super("Fractal");

        controlJPanel = new JPanel();
        controlJPanel.setLayout( new FlowLayout() );

        changeColorJButton = new JButton( "Color" );
        controlJPanel.add( changeColorJButton );
        changeColorJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                Color color = JColorChooser.showDialog( Fractal.this, "Choose a color", Color.BLUE );

                if( color == null ) {
                    color = Color.BLUE;
                }

                drawSpace.setColor( color );
            }
        });

        decreaseLevelJButton = new JButton( "Decrease level" );
        controlJPanel.add( decreaseLevelJButton );
        decreaseLevelJButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        int level = drawSpace.getLevel();
                        --level;

                        if( ( level >= MIN_LEVEL ) && ( level <= MAX_LEVEL ) ) {
                            levelJLabel.setText( "Level: " + level );
                            drawSpace.setLevel( level );
                            repaint();
                        }
                    }
                }
        );

        increaseLevelJButton = new JButton( "Increase level" );
        controlJPanel.add( increaseLevelJButton );
        increaseLevelJButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int level = drawSpace.getLevel();
                        ++level;

                        if( ( level >= MIN_LEVEL ) && ( level <= MAX_LEVEL) ) {
                            levelJLabel.setText( "Level: " + level );
                            drawSpace.setLevel( level );
                            repaint();
                        }
                    }
                }
        );
        levelJLabel = new JLabel( "Level: 0" );
        controlJPanel.add( levelJLabel );

        drawSpace = new FractalJPanel( 0 );

        mainJPanel = new JPanel();
        mainJPanel.add( controlJPanel );
        mainJPanel.add( drawSpace );

        add( mainJPanel );

        setSize( WIDTH, HEIGHT );
        setVisible( true );
    }

    public static void main( String[] args ) {
        Fractal demo = new Fractal();
        demo.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

    }
}

