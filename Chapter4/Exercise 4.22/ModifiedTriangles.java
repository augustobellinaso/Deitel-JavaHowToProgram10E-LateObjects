/* Modify Exercise 4.15 to combine your code from
the four separate triangles of asterisks such that all four patterns print side by side. [Hint: Make clev-
er use of nested for loops.]*/
/*
 * Augusto Loose Bellinaso
 */


public class ModifiedTriangles {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) { //to count for 10 rows
								
			//first triangle
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			for (int j = 10; j > i; j--) {
				System.out.print(' ');
			}			
			System.out.print(' '); //to separate patterns
			
			//second triangle
			for (int j = 10; j >= i; j--) {
				System.out.print('*');
			}
			for (int j = 1; j < i; j++) {
				System.out.print(' ');
			}
			System.out.print(' '); //to separate patterns
			
			//third pattern
			for (int j = 1; j < i; j++) {
				System.out.print(' ');
			}
			for (int j = 10; j >= i; j--) {
				System.out.print('*');
			}
			System.out.print(' '); //to separate patterns
			
			//fourth pattern
			for (int j = 10; j > i; j--) {
				System.out.print(' ');
			}
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			
			
			System.out.println(); //breaking line at each iteration
		
		} //end outermost for
		
	} //end main

} //end class
