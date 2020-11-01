//Using drawLine to connect the corners of a panel
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
		int rightStep = width / 15; 
		int upStep = height / 15;
		
		//contador para os passos para inicializar o loop while
		int stepCounter = 0;
		
		//loop para desenhar as linhas
		while (stepCounter < 15) {
			//desenhar uma linha para cada passo
			g.drawLine(0, 0, 0 + (stepCounter * rightStep), height - (stepCounter * upStep));
			stepCounter += 1; //incrementando o passo
		}
		
//		//draw a line from the upper-left to the lower-right
//		g.drawLine(0, 0, 0, height);
//		//o método drawLine desenha uma linha entre dois pontos, e os argumentos são as posições (x, y) de cada um dos dois pontos
		
		
	}	

}