//Exercise 4.10 Printing
//What does the following program do?

/*
Augusto Loose Bellinaso
*/

public class Printing {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			
			for (int j = 1; j <= 5; j++) {
				
				System.out.print('@');
			} //end innermost for
			
			System.out.println();
		} //end outermost for
	}

}
