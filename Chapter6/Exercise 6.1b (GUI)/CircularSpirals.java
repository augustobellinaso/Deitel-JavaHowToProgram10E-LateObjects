/*Draw a circular spiral (as in the right screen capture of Fig. 6.20), using method
drawArc to draw one semicircle at a time. Each successive semicircle should have a larger
radius (as specified by the bounding rectangle’s width) and should continue drawing
where the previous semicircle finished.*/
/*
 * Augusto Loose Bellinaso
 */

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CircularSpirals extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		//variables
		int xPosition = getWidth() / 2; //half width
		int yPosition = getHeight() / 2; //half height
		int radius = 10; //initial radius
		
		//looping to draw arcs
		for (int i = 1; i <= 40; i++) {
			int direction = radius * i; //to move the spiral and increase radius
			if (i % 2 != 0) {
				g.drawArc(xPosition, yPosition, radius + direction, radius + direction, 180, -180);
				xPosition = xPosition - direction / i;
				yPosition = yPosition - direction / (i * 2);
				
			} else {
				g.drawArc(xPosition, yPosition, radius + direction, radius + direction, 0, -180);
				yPosition = yPosition - direction / (i * 2);
				
			}
		}
		
		
		
	}//end paintComponent
	
	//main method to draw in the frame
	public static void main(String[] args) {
		
		CircularSpirals panel = new CircularSpirals();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(400, 250);
		application.setVisible(true);
		
	}
}
