/*Math.floor can be used to round values to the nearest integer—e.g.,
y = Math.floor(x + 0.5);
will round the number x to the nearest integer and assign the result to y . Write an application that
reads double values and uses the preceding statement to round each of the numbers to the nearest
integer. For each number processed, display both the original number and the rounded number.*/
/*
 * Augusto Loose Bellinaso
 */

import java.util.Scanner;

public class RoundingNumbers {
	
	public static void main(String[] args) {
		
		//variables
		Scanner input = new Scanner(System.in);
		double number;
		
		//requesting user input
		System.out.print("Enter a floating-point number of -1 to quit: ");
		number = input.nextDouble();
		
		while (number != -1) {
			System.out.printf("The number you entered is: %f%n ", number);
			System.out.printf("The rounded number is: %f%n", Math.floor(number + 0.5));
			
			
			System.out.print("Enter a floating-point number of -1 to quit: ");
			number = input.nextDouble();
		}
	}

}
