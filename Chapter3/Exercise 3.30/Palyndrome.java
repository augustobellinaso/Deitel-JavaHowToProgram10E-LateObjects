/*A palindrome is a sequence of characters that reads the same backward as for-
ward. For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554
and 11611. Write an application that reads in a five-digit integer and determines whether it’s a pal-
indrome. If the number is not five digits long, display an error message and allow the user to enter
a new value.*/
/*
Augusto Loose Bellinaso
 */
//importing Scanner class
import java.util.Scanner;

public class Palyndrome {
	
	public static void main(String[] args) {
		
		//creating Scanner object to read input
		Scanner input = new Scanner(System.in);
		int number; //store the input number
		int digit1;
		int digit2;
		int digit3;
		int digit4;
		int digit5;
		
		//Requesting user input
		System.out.print("Enter a five digit number: ");
		number = input.nextInt();
		
		//validating if the number has 5 digits
//		while(number / 10000 > 10 || number / 10000 <= 0) {
//			System.out.print("Error: the entered number doesn't have five digits. Try again.");
//			System.out.print("\nEnter a five digit number: ");
//			number = input.nextInt();
//		}
		
		while(number < 10000 || number > 99999) {
			System.out.print("Error: the entered number doesn't have five digits. Try again.");
//			System.out.print("\nEnter a five digit number: ");
//			number = input.nextInt();
		}
		
		digit1 = number / 10000; //obtain the first digit
		digit2 = (number % 10000) / 1000; //second digit
		digit3 = (number % 1000) / 100; //third digit
		digit4 = (number % 100) / 10;
		digit5 = number % 10;
		
		//checking if its a palyndrome or not:
		if (digit1 != digit5) {
			System.out.println("The number is not a palyndrome!");
		} else if (digit2 != digit4) {
			System.out.println("The number is not a palyndrome!");
		} else {
			System.out.println("The number is a palyndrome!");
		}
		
		
		
	}

}
