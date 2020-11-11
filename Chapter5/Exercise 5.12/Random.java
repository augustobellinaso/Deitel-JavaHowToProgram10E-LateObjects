/*Write statements that assign random integers to the variable n in the following ranges:
a) 1 ≤ n ≤ 2.
b) 1 ≤ n ≤ 100.
c) 0 ≤ n ≤ 9.
d) 1000 ≤ n ≤ 1112.
e) –1 ≤ n ≤ 1.
f) –3 ≤ n ≤ 11.*/

/*
 * Augusto Loose Bellinaso
 */

import java.security.SecureRandom;

public class Random {
	
	public static void main(String[] args) {
		SecureRandom randomNumber = new SecureRandom();//creating securerandom object
		
		
		//a) 1 ≤ n ≤ 2.
		System.out.printf("Random number between 1 and 2: %d%n", 1 + randomNumber.nextInt(2));
		
		//b) 1 ≤ n ≤ 100.
		System.out.printf("Random number between 1 and 100: %d%n", 1 + randomNumber.nextInt(100));
		
		//c) 0 ≤ n ≤ 9.
		System.out.printf("Random number between 0 and 9: %d%n", randomNumber.nextInt(10));
		
		//d) 1000 ≤ n ≤ 1112.
		System.out.printf("Random number between 1000 and 1112: %d%n", 1000 + randomNumber.nextInt(113));
		
		//e) –1 ≤ n ≤ 1.
		System.out.printf("Random number between -1 and 1: %d%n", randomNumber.nextInt(3) - 1);
		
		//f) –3 ≤ n ≤ 11.
		System.out.printf("Random number between -3 and 11: %d%n", randomNumber.nextInt(15) - 3);
		
		
	}

}
