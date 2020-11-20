/*Use a one-dimensional array to solve the following problem:
Write an application that inputs five numbers, each between 10 and 100, inclusive. As each number
is read, display it only if it’s not a duplicate of a number already read. Provide for the “worst case,”
in which all five numbers are different. Use the smallest possible array to solve this problem. Display
the complete set of unique values input after the user enters each new value.*/

/*
 * Augusto Loose Bellinaso
 */

import java.util.Scanner;

public class DuplicateElimination {
	
	public static void main(String[] args) {
		//variables
		Scanner input = new Scanner(System.in);
		int userValue; //to store the input value
		int[] numbers = new int[5]; //to store the five input numbers
		int counter = 0; //to count the iterations
		
		while (counter < numbers.length) {
			boolean duplicate = false;
			
			//requesting user input and storing in the array numbers
			System.out.printf("Enter an integer between 10 and 100: ");
			userValue = input.nextInt();
			
			
			//validating input
			while(userValue < 10 || userValue > 100) {
				System.out.printf("Enter an integer between 10 and 100: ");
				userValue = input.nextInt();
			} //end validation
		
			//verifying if duplicate or not
			for (int j = 0; j < numbers.length; j++) {
				if (userValue == numbers[j]) {
					System.out.println("Number already entered");
					duplicate = true;
				}
			}
			
			if (!duplicate) {
				numbers[counter] = userValue;
				counter++;
				
				for (int i = 0; i < counter; i++) {
					System.out.printf("%d ", numbers[i]);
				}
			}
			
			
			System.out.println();
			
			
		}//end while
		
		
		
	}

}
