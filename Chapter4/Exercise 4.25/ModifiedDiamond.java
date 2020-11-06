/*Modify the application you wrote in Exercise 4.24
to read an odd number in the range 1–19 to specify the number of rows in the diamond. Your pro-
gram should then display a diamond of the appropriate size.*/

/*
 * Augusto Loose Bellinaso
 */

//importing scanner
import java.util.Scanner;

public class ModifiedDiamond {
	
	public static void main(String[] args) {
		
		//declaring variables
		Scanner input = new Scanner(System.in);
		int rowNumber; //the number of rows for the diamond shape
		boolean correctNumber = false;
		
		//requesting the user to input and odd number
		
		System.out.print("Enter an odd number between 1 and 19: ");
		rowNumber = input.nextInt();
		
		//validating user input
		while(!((rowNumber >=1 && rowNumber <= 19) && (rowNumber % 2 != 0))) {		
			System.out.print("Enter an odd number between 1 and 19: ");
			rowNumber = input.nextInt();			
		}
		
		//printing the diamond shape
		//top half
		for (int i = 1; i <= (rowNumber / 2); i++) {
			for (int j = (rowNumber / 2); j >= i; j--) {
				System.out.print(' ');
			}
			for (int k = 1; k <= i; k++) {
				System.out.print('*');
			}
			for (int l = 1; l < i; l++) {
				System.out.print('*');
			}						
			System.out.println();
		}
		
		//middle row
		for (int i = 1; i <= rowNumber; i++) {
			System.out.print('*');
		}
		System.out.println();
		
		//bottom half
		for (int i = 1; i <= (rowNumber / 2); i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(' ');
			}
			for (int k = (rowNumber / 2); k >= i; k--) {
				System.out.print('*');
			}
			for (int l = (rowNumber / 2); l > i; l--) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
