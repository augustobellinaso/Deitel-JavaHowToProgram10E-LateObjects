/*Figure 3.19 displays two additional designs created using while loops and drawLine .
a) Create the design in the left screen capture of Fig. 3.19. Begin by dividing each edge
into an equal number of increments (we chose 15 again). The first line starts in the top-
left corner and ends one step right on the bottom edge. For each successive line, move
down one increment on the left edge and right one increment on the bottom edge. Con-
tinue drawing lines until you reach the bottom-right corner. The figure should scale as
you resize the window so that the endpoints always touch the edges.
b) Modify your answer in part (a) to mirror the design in all four corners, as shown in the
right screen capture of Fig. 3.19.*/
/*
Augusto Loose Bellinaso
 */
import java.awt.Graphics; //import class Graphics
import javax.swing.JPanel; //import class JPanel

public class DrawPanel extends JPanel { 
	

	public void paintComponent(Graphics g) { //o sistema chama toda vez que precisa exibir o DrawPanel
				
		super.paintComponent(g);
		
		int width = getWidth(); //total width
		int height = getHeight(); //total height
		
		//definindo o tamanho dos passos
		int xStep = width / 15; 
		int yStep = height / 15;
		
		//contador para os passos para inicializar o loop while
		int stepCounter = 0;		
		//loop para desenhar as linhas
		while (stepCounter < 15) {
			//desenhar uma linha para cada passo
			g.drawLine(0, stepCounter * yStep, xStep + (stepCounter * xStep), height); //canto superior esquerdo
			g.drawLine(width, stepCounter * yStep, width - (xStep + (stepCounter * xStep)), height); //canto superior direito
			g.drawLine(stepCounter * xStep, 0, width, (stepCounter * yStep)); //canto inferior direito
			g.drawLine(width - (stepCounter * xStep), 0, 0, yStep * stepCounter); //canto inferior esquerdo
			stepCounter += 1; //incrementando o passo
		}

	}	

}