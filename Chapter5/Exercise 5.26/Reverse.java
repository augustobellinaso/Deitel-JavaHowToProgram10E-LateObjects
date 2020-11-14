/*Write a method that takes an integer value and returns the number with
its digits reversed. For example, given the number 7631, the method should return 1367. Incorpo-
rate the method into an application that reads a value from the user and displays the result.*/

/*
 * Augusto Loose Bellinaso
 */

import java.util.Scanner;
public class Reverse {
	
	//main method
	public static void main(String[] args) {
		//variables
		Scanner input = new Scanner(System.in);
		int number; //to store the number that is input by user
		
		//requesting for user input
		System.out.print("Enter a integer number to reverse its digits: ");
		number = input.nextInt();
		
		System.out.println("The reverse number is: ");
		reverseDigits(number);
		System.out.println();
	}//end main
	
	
	//creating method to reverse digits
	
	public static void reverseDigits(int number) {
		while (number > 0) {
			System.out.printf("%d", number % 10);
			number = number / 10;
		}
	}

}
