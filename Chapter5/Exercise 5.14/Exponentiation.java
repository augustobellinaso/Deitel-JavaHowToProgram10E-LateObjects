/*Write a method integerPower(base, exponent) that returns the value of
base exponent
For example, integerPower(3, 4) calculates 3 4 (or 3 * 3 * 3 * 3 ). Assume that exponent is a posi-
tive, nonzero integer and that base is an integer. Use a for or while statement to control the calcu-
lation. Do not use any Math class methods. Incorporate this method into an application that reads
integer values for base and exponent and performs the calculation with the integerPower method.*/

/*
 * Augusto Loose Bellinaso
 */

//importing Scanner
import java.util.Scanner;

public class Exponentiation {
	
	public static void main(String[] args) {
		//variables
		Scanner input = new Scanner(System.in);
		int base; //to store the base from user's input
		int exponent;  //to store the exponent from user's input
		
		//requesting for user input
		System.out.print("Enter an integer base: ");
		base = input.nextInt();
		System.out.print("Enter the exponent (positive non-zero integer): ");
		exponent = input.nextInt();
		
		//to validate the input
		while (base < 0 || exponent < 0) {
			System.out.print("Enter an integer base: ");
			base = input.nextInt();
			System.out.print("Enter the exponent (positive non-zero integer): ");
			exponent = input.nextInt();
		}
		
		System.out.printf("%nThe result for base %d and exponent %d is: %d.%n", base, exponent, integerPower(base, exponent));
					
	}//end main
	
	
	//creating method to calculate the integer power
	public static int integerPower(int base, int exponent) {
		int result = 1; //to store the result. Initialize with 1 because it is a multiplication
		for (int i = 1; i <= exponent; i++) {
			result *= base;
		}//end for
		return result;
	}//end integerPower

}
