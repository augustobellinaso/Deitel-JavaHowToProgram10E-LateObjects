/*Write a method squareOfAsterisks that displays a solid
square (the same number of rows and columns) of asterisks whose side is specified in integer param-
eter side . For example, if side is 4 , the method should display
****
****
****
****
Incorporate this method into an application that reads an integer value for side from the user and
outputs the asterisks with the squareOfAsterisks method.*/

/*
 * Augusto Loose Bellinaso
 */
import java.util.Scanner;
public class Asterisk {
	
	public static void main(String[] args) {
		
		//variables
		Scanner input = new Scanner(System.in);
		int side; //to store the side of the square as input by user
		
		
		//requesting user input
		System.out.print("Enter the side to display the square of asterisks: ");
		side = input.nextInt();
		
		
		//displaying result
		squareOfAsterisk(side);
		
	}//end main

	//creating method
	public static void squareOfAsterisk(int side) {
		for (int i = 1; i <= side; i++) {
			for (int j = 1; j <= side; j++) {
				System.out.print('*');
			}
			System.out.println();
			
		} //end side
	}//end method
	
}
