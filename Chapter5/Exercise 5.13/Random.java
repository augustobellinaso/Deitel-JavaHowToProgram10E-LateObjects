/*Write statements that will display a random number from each of the following sets:
a) 2, 4, 6, 8, 10.
b) 3, 5, 7, 9, 11.
c) 6, 10, 14, 18, 22.*/

/*
 * Augusto Loose Bellinaso
 */

import java.security.SecureRandom;

public class Random {
	
	public static void main(String[] args) {
		//creating SecureRandom object
		SecureRandom randomNumber = new SecureRandom();
		
		//a) 2, 4, 6, 8, 10.
		System.out.printf("Random number from the set (2, 4, 6, 8, 10): %d%n", (2 + 2 * randomNumber.nextInt(5)));
		
		//b) 3, 5, 7, 9, 11.
		System.out.printf("Random number from the set (3, 5, 7, 9, 11): %d%n", (3 + 2 * randomNumber.nextInt(5)));
		
		//c) 6, 10, 14, 18, 22.
		System.out.printf("Random number from the set (6, 10, 14, 18, 22): %d%n", (6 + 4 * randomNumber.nextInt(5)));
		
		
		
	}//end main

}
