/*Modify the method created in Exercise 5.18 to re-
ceive a second parameter of type char called fillCharacter . Form the square using the char pro-
vided as an argument. Thus, if side is 5 and fillCharacter is # , the method should display
#####
#####
#####
#####
#####
Use the following statement (in which input is a Scanner object) to read a character from the user
at the keyboard:
char fill = input.next().charAt(0);*/

/*
 * Augusto Loose Bellinaso
 */

import java.util.Scanner;
public class Square {
	
	public static void main(String[] args) { 
		//variables
		Scanner input = new Scanner(System.in);
		int side; //the side of the square
		char fillCharacter; //the character that will be used to create the square
		
		//requesting user input
		System.out.print("Enter the side of the square: ");
		side = input.nextInt();
		System.out.print("Enter the character to fill the square: ");
		fillCharacter = input.next().charAt(0);
		
		//displaying square
		squareOfCharacters(side, fillCharacter);
		
	}//end main
	
	
	//creating method
	public static void squareOfCharacters(int side, char fillCharacter) {
		for (int i = 1; i <= side; i++) {
			for (int j = 1; j <= side; j++) {
				System.out.print(fillCharacter);
			}
			System.out.println();
			
		} //end side
	}//end method

}
