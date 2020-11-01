/* Figure 3.19 displays two additional designs created using while loops and drawLine .
a) Create the design in the left screen capture of Fig. 3.19. Begin by dividing each edge
into an equal number of increments (we chose 15 again). The first line starts in the top-
left corner and ends one step right on the bottom edge. For each successive line, move
down one increment on the left edge and right one increment on the bottom edge. Con-
tinue drawing lines until you reach the bottom-right corner. The figure should scale as
you resize the window so that the endpoints always touch the edges.
b) Modify your answer in part (a) to mirror the design in all four corners, as shown in the
right screen capture of Fig. 3.19. */
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