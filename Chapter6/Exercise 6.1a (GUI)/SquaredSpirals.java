/*Draw a square-shaped spiral (as in the left screen capture of Fig. 6.20), centered on the
panel, using method drawLine . One technique is to use a loop that increases the line 
length after drawing every second line. The direction in which to draw the next line
should follow a distinct pattern, such as down, left, up, right.*/

/*
 * Augusto Loose Bellinaso
 */

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SquaredSpirals extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int length = 10; //length of each line
		
		//x and y initial positions
		int xPosition = getWidth() / 2; //to start at the center of the frame
		int yPosition = getHeight() / 2; //to find the y position at the half of the frame
		
		//looping to create different lines in different directions
		for (int i = 1; i < 25; i++) {
			int direction = length * i;
			if (i % 2 != 0) {
				g.drawLine(xPosition, yPosition, xPosition, yPosition + direction);
				yPosition = yPosition + direction;
				g.drawLine(xPosition, yPosition, xPosition - direction, yPosition);
				xPosition = xPosition - direction;	
				
			} else {
				g.drawLine(xPosition, yPosition, xPosition, yPosition - direction);
				yPosition = yPosition - direction;
				g.drawLine(xPosition, yPosition, xPosition + direction, yPosition);
				xPosition = xPosition + direction; 
			}
		}

	
	}//end paintComponent
	
	
	//main method to draw in the frame
	public static void main(String[] args) {
		
		SquaredSpirals panel = new SquaredSpirals();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(400, 250);
		application.setVisible(true);
		
	}

}
