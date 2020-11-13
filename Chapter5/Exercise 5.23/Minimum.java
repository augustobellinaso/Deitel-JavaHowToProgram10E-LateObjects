/*Write a method minimum3 that returns the smallest of three floating-
point numbers. Use the Math.min method to implement minimum3 . Incorporate the method into an
application that reads three values from the user, determines the smallest value and displays the re-
sult.*/
/*
 * Augusto Loose Bellinaso
 */

import java.util.Scanner;

public class Minimum {
	
	public static void main(String[] args) {
		//variables
		Scanner input = new Scanner(System.in);
		double number1; //store the input number
		double number2;
		double number3;
		
		//requesting input
		System.out.print("Enter first number: ");
		number1 = input.nextDouble();
		System.out.print("Enter second number: ");
		number2 = input.nextDouble();
		System.out.print("Enter third number: ");
		number3 = input.nextDouble();
		
		System.out.printf("The smallest value is: %f", minimum3(number1, number2, number3));
	}//end main
	
	//creating method
	public static double minimum3(double x, double y, double z) {
		double minimum;
		minimum = Math.min(Math.min(x, y), z);
		return minimum;
	}

}
