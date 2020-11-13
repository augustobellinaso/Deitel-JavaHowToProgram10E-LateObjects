/*Write methods that accomplish each of the following tasks:
a) Calculate the integer part of the quotient when integer a is divided by integer b .
b) Calculate the integer remainder when integer a is divided by integer b .
c) Use the methods developed in parts (a) and (b) to write a method displayDigits that
receives an integer between 1 and 99999 and displays it as a sequence of digits, separating
each pair of digits by two spaces. For example, the integer 4562 should appear as
4  5  6  2
Incorporate the methods into an application that inputs an integer and calls display-
Digits by passing the method the integer entered. Display the results.*/

/*
 * Augusto Loose Bellinaso
 */

//importing scanner
import java.util.Scanner;
public class SeparatingDigits {
	
	//method main
	public static void main(String[] args) {
		//variables
		Scanner input = new Scanner(System.in);
		int number; //to store the number input by user
		
		//requesting user input
		System.out.print("Enter an integer between 1 and 99999: ");
		number = input.nextInt();
		
		//validating input
		while (number < 1 || number > 99999) {
			System.out.print("Invalid number. Enter an integer between 1 and 99999: ");
			number = input.nextInt();
		}
		
		displayDigits(number);
	}//end main
	
	//a) Calculate the integer part of the quotient when integer a is divided by integer b .
	public static int integerPart(int a, int b) {
		return a / b;
	}
	
	//b) Calculate the integer remainder when integer a is divided by integer b .
	public static int integerRemainder(int a, int b) {
		return a % b;
	}
	
	//method displayDigits
	public static void displayDigits(int number) {
		int digit1 = integerRemainder(number, 10); //the 1's digit
		int digit2 = integerPart(integerRemainder(number, 100), 10); //the 10's digit
		int digit3 = integerPart(integerRemainder(number, 1000), 100); //the 100's digit
		int digit4 = integerPart(integerRemainder(number, 10000), 1000); //the 1000's digit
		int digit5 = integerPart(number, 10000); //the 10000's part
		
		//printing the result
		System.out.printf("The digits are %d  %d  %d  %d  %d", digit5, digit4, digit3, digit2, digit1);
		
	}

}
