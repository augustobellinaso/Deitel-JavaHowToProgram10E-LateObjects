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
import java.awt.Graphics; //import class Graphics
import javax.swing.JPanel; //import class JPanel

public class DrawPanel extends JPanel { //extends indica que a classe DrawPanel é um tipo aprimorado da classe JPanel. Também indica uma relação de herança em que a
	//a nova classe DrawPanel já inicia com os membros (dados e métodos) da classe JPanel
	//nessa relação de herança, JPanel é a superclasse e DrawPanel a subclasse
	//O resultado é a classe DrawPanel que além de ter os atributos e métodos da classe JPanel, também possui os recursos que definimos para ela
	
	//draw an X from the corners of the panel
	public void paintComponent(Graphics g) { //o sistema chama toda vez que precisa exibir o DrawPanel
		
		//call paintComponent to ensure the panel displays correctly
		super.paintComponent(g); //garante que o painel está propriamente renderizado antes de desenharmos nele
		
		//chama os métodos que a classe DrawPanel herdou da classe JPanel
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
			g.drawLine(0, stepCounter * yStep, xStep + (stepCounter * xStep), height);
			stepCounter += 1; //incrementando o passo
		}

	}	

}