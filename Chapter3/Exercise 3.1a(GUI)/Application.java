/*Using loops and control statements to draw lines can lead to many interesting designs.
 * 
a) Create the design in the left screen capture of Fig. 3.18. This design draws lines from
the top-left corner, fanning them out until they cover the upper-left half of the panel.
One approach is to divide the width and height into an equal number of steps (we found
15 steps worked well). The first endpoint of a line will always be in the top-left corner
(0, 0). The second endpoint can be found by starting at the bottom-left corner and
moving up one vertical step and right one horizontal step. Draw a line between the two
endpoints. Continue moving up and to the right one step to find each successive end-
point. The figure should scale accordingly as you resize the window.

b) Modify part (a) to have lines fan out from all four corners, as shown in the right screen
capture of Fig. 3.18. Lines from opposite corners should intersect along the middle. */


/*
Augusto Loose Bellinaso
 */

import javax.swing.JFrame; //import class JFrame


public class Application {
	
	public static void main(String[] args) {
		//create a panel that contains our drawing
		DrawPanel panel = new DrawPanel();
		
		//create a new frame to hold the panel
		JFrame application = new JFrame();
		
		//set the frame to exit when it is closed
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//usa os métodos da classe JFrame
		application.add(panel); //add the panel to the frame
		application.setSize(500, 500); //set the size of the frame
		application.setVisible(true); //make the frame visible
	}

}