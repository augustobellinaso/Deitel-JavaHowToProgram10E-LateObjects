/*The greatest common divisor (GCD) of two integers is the largest
integer that evenly divides each of the two numbers. Write a method gcd that returns the greatest
common divisor of two integers. [Hint: You might want to use Euclid’s algorithm. You can find
information about it at en.wikipedia.org/wiki/Euclidean_algorithm .] Incorporate the method
into an application that reads two values from the user and displays the result.*/

/*
 * Augusto Loose Bellinaso
 */

import java.util.Scanner;

public class CommomDivisor {
	//main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1; //the first number input by user
		int number2; //the second number input by user
		
		//requesting input
		System.out.print("Enter the first integer: ");
		number1 = input.nextInt();
		System.out.print("Enter the second integer: ");
		number2 = input.nextInt();
		

		System.out.printf("The greatest commom divisor between %d and %d is: %d", number1, number2, gcd(number1, number2));
	
		
	}//end main
	
	

	
	//alternative to the gcd
	public static int gcd(int a, int b) {
		int divisor = 1;		
		for (int i = 1; i <= a; i++) {
			if (a % i == 0 && b % i == 0) {
				divisor = i;
			}
						
		}
		return divisor;
	}//end method

}
