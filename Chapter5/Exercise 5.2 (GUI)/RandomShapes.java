/*Create a program that draws 10 random filled shapes in random colors, positions and sizes
(Fig. 5.13). Method paintComponent should contain a loop that iterates 10 times. In each iteration,
the loop should determine whether to draw a filled rectangle or an oval, create a random color and
choose coordinates and dimensions at random. The coordinates should be chosen based on the pan-
el’s width and height. Lengths of sides should be limited to half the width or height of the window.*/

/*
 * Augusto Loose Bellinaso
 */

//importing classes
import java.security.SecureRandom;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class RandomShapes extends JPanel {
	
	//declaring constants
	private static SecureRandom randomNumber = new SecureRandom(); //to generate random numbers throughout the program
	private static final int WIDTH = 500; //window width
	private static final int HEIGHT = 500;  //window height

	//creating method paintComponent where the drawings will be performed/made
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
		//loop to iterate 10 times
		for (int i = 1; i <= 10; i++) {
			//if i is odd, draw oval
			if (i % 2 != 0) {
				g.setColor(new Color(randomNumber.nextInt(255), randomNumber.nextInt(255), randomNumber.nextInt(255)));
				g.fillOval(
						randomNumber.nextInt(WIDTH), 
						randomNumber.nextInt(HEIGHT), 
						randomNumber.nextInt(WIDTH / 2), 
						randomNumber.nextInt(HEIGHT / 2));
			} else {
				g.setColor(new Color(randomNumber.nextInt(255), randomNumber.nextInt(255), randomNumber.nextInt(255)));
				g.fillRect(
						randomNumber.nextInt(WIDTH), 
						randomNumber.nextInt(HEIGHT), 
						randomNumber.nextInt(WIDTH / 2), 
						randomNumber.nextInt(HEIGHT / 2));
			}
			
		}//end for
		
		
	}//end paintComponent
	
	
	//method main, where the window will be created and the drawings will be added to the JFrame
	public static void main(String[] args) {
		//creating the RandomShapes object/panel
		RandomShapes panel = new RandomShapes();
		//creating JFrame object
		JFrame application = new JFrame();
		
		//setting properties of the window
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setVisible(true);
		application.setSize(WIDTH, HEIGHT);
	}//end main

}//end class
