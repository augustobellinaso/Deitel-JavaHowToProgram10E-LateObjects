/*Write an application that displays the following patterns sep-
arately, one below the other. Use for loops to generate the patterns. All asterisks ( * ) should be printed by 
a single statement of the form System.out.print('*' ) ; which causes the asterisks to print side
by side. A statement of the form System.out.println(); can be used to move to the next line. A
statement of the form System.out.print(' ' ) ; can be used to display a space for the last two pat-
terns. There should be no other output statements in the program. [Hint: The last two patterns re-
quire that each line begin with an appropriate number of blank spaces.]
*/

/*
 * Augusto Loose Bellinaso
 */

public class TrianglePatters {
	
	public static void main(String[] args) {
		
		//First pattern
		for(int i = 1; i <= 10; i++) { //counter for 10 rows
			for (int j = 1; j <= i; j++) { //to loop and print each row
				System.out.print('*');
			}
		
			System.out.println();
		}	
		
		System.out.println();
		
		//second pattern
		for (int i = 10; i >= 1; i--) { 
			
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println();
		
		//Third pattern
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(' ');
			}
			
			for (int k = 10; k >= i; k--) {
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println();
		
		//fourth pattern
		for (int i = 1; i <= 10; i++) {
			for (int j = 10; j > i; j--) {
				System.out.print(' ');
			}
			
			for (int k = 1; k <= i; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
	}
	


}
