/*T o round numbers to specific decimal places, use a statement like
y = Math.floor(x * 10 + 0.5) / 10;
which rounds x to the tenths position (i.e., the first position to the right of the decimal point), or
y = Math.floor(x * 100 + 0.5) / 100;
which rounds x to the hundredths position (i.e., the second position to the right of the decimal
point). Write an application that defines four methods for rounding a number x in various ways:
a) roundToInteger(number)
b) roundToTenths(number)
c) roundToHundredths(number)
d) roundToThousandths(number)
For each value read, your program should display the original value, the number rounded to the
nearest integer, the number rounded to the nearest tenth, the number rounded to the nearest hun-
dredth and the number rounded to the nearest thousandth.*/
/*
 * Augusto Loose Bellinaso
 */

//importing Scanner
import java.util.Scanner;
public class Rounding {
	
	public static void main(String[] args) {
		
		//declaring variables
		Scanner input = new Scanner(System.in);
		double number; //to store the input number
		
		//requesting input
		System.out.print("Enter a floating-point number of -1 to quit: ");
		number = input.nextDouble();
		
		//while loop
		while (number != -1) {
			System.out.printf("The input number is: %f%n", number);
			System.out.printf("The number rounded to the nearest integer is: %f%n", roundToInteger(number));
			System.out.printf("The number rounded to the nearest tenth is: %f%n", roundToTenths(number));
			System.out.printf("The number rounded to the nearest hundreth is: %f%n", roundToHundreths(number));
			System.out.printf("The number rounded to the nearest thousandth is: %f%n", roundToThousandths(number));
			
			System.out.print("Enter a floating-point number of -1 to quit: ");
			number = input.nextDouble();
			
		}
		
		
	}//end main
	
	
	//creating the rounding methods
	//roundToInteger
	public static double roundToInteger(double number) {
		return Math.floor(number + 0.5);
	}
	
	//roundToTenths
	public static double roundToTenths(double number) {
		return (Math.floor(number * 10 + 0.5) ) / 10;
	}
	
	//roundToHundreths
		public static double roundToHundreths(double number) {
			return (Math.floor(number * 100 + 0.5) ) / 100;
		}
	
	//roundToThousandths
	public static double roundToThousandths(double number) {
		return (Math.floor(number * 1000 + 0.5) ) / 1000;
	}

}
