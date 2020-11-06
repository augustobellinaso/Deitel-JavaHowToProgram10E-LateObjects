/*Write an application that prints the following diamond
shape. You may use output statements that print a single asterisk ( * ), a single space or a single new-
line character. Maximize your use of repetition (with nested for statements), and minimize the
number of output statements.*/

/*
 * Augusto Loose Bellinaso
 */

public class Diamonds {
	
	public static void main(String[] args) {
		
		//constructing the top half
		for (int i = 1; i <= 5; i++) { //to iterate over the 5 top rows
			for (int j = 4; j >= i; j--) {
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
		
		//constructing the bottom half
		for (int i = 1; i <= 4; i++) { //to iterate over the 4 bottom rows
			for (int j = 1; j <= i; j++) {
				System.out.print(' ');
			}
			for (int k = 5; k > i; k--) {
				System.out.print('*');
			}
			for (int l = 4; l > i; l--) {
				System.out.print('*');
			}
			
			System.out.println();
		}
	}

}
