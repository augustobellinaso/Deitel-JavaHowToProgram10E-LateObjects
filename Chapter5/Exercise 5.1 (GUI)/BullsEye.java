/*Using method fillOval , draw a bull’s-eye that alternates between two random colors, as in
Fig. 5.12. Use the constructor Color(int r, int g, int b ) with random arguments to generate ran-
dom colors.*/

/*
 * Augusto Loose Bellinaso
 */

//importing classes
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.security.SecureRandom; //to generate random number for the color


public class BullsEye extends JPanel { //to inherit JPanel methods
	//creating secure random number generator to use in the Color construtor
	private static final SecureRandom randomNumber = new SecureRandom();
	//setting the dimensions of the panel to be constants
	public static final int WIDTH = 550;
	public static final int HEIGHT = 600;
	public static final int RADIUS = 90;
	
	
	
	//method PaintComponent where we will draw the elements
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//using Color constructor to generate random colors
		Color color1 = new Color(randomNumber.nextInt(255), randomNumber.nextInt(255), randomNumber.nextInt(255));
		Color color2 = new Color(randomNumber.nextInt(255), randomNumber.nextInt(255), randomNumber.nextInt(255));
		
		
		//Drawing 5 circles with different radius, starting with the largest
		//loop to draw the 5 circles
		for (int i = 5; i >= 1; i--) {
			//if i is odd, use color1
			if (i % 2 != 0) {
				g.setColor(color1);
				g.fillOval(((WIDTH / 2) - ((RADIUS / 2) * i)),
						((HEIGHT / 2) - ((RADIUS / 2) * i)),
						i * RADIUS,
						i * RADIUS);
			} else {
				g.setColor(color2);
				g.fillOval(((WIDTH / 2) - ((RADIUS / 2) * i)),
						((HEIGHT / 2) - ((RADIUS / 2) * i)), 
						i * RADIUS, 
						i * RADIUS);
			}//end if
		}//end for
						
	}//end paintComponent
	
	
	//creating method main where the application will be set
	public static void main(String[] args) {
		BullsEye panel = new BullsEye(); //creating object from the class BullsEye that will be shown on screen
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to exit the window when clicking on X button
		application.add(panel); //adding the panel to the screen
		application.setVisible(true); //visibility of the window
		application.setSize(WIDTH, HEIGHT); //size of the window
		
	} //end main

}//end class
