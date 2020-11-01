/*Draw 12 concentric circles in the center of a JPanel (Fig. 4.26). The innermost circle
should have a radius of 10 pixels, and each successive circle should have a radius 10 pixels larger than
the previous one. Begin by finding the center of the JPanel . To get the upper-left corner of a circle,
move up one radius and to the left one radius from the center. The width and height of the bound-
ing rectangle are both the same as the circle’s diameter (i.e., twice the radius).*/

/*
Augusto Loose Bellinaso
*/
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;

public class ConcentricCircles extends JPanel {
	
	//constants to define the circle radius and also the window size
	public static final int RADIUS = 10;
	public static final int WIDTH = 500;
	public static final int HEIGHT = 500;
	
	//method paintComponent to perform the actual drawings
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		for(int i = 0; i < 12; i++) {
			g.drawOval(((WIDTH / 2) - (RADIUS + i * 10)), 
					((HEIGHT / 2) - (RADIUS + i * 10)), 
					( 2 * (RADIUS + i * 10)), 
					( 2 * (RADIUS + i * 10)));
			//the ovals are placed inside a imaginary rectangle, called the bounding rectangle
		} //end for
	} //end paintComponent
		
	public static void main(String[] args) {
		
		ConcentricCircles panel = new ConcentricCircles(); //create the panel (a ConcentricCircles object)
		JFrame application = new JFrame(); //creates a new JFrame
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(WIDTH, HEIGHT);
		application.setVisible(true);
		
	}//end main

}
