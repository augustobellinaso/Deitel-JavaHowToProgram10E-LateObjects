//Write an application that finds the smallest of several integers.
//Assume that the first value read specifies the number of values to input from the user.
/*
Augusto Loose Bellinaso
*/
//importing Scanner
import java.util.Scanner;

public class SmallestValue {
	
	public static void main(String[] args) {
		
		//initializing variables
		Scanner input = new Scanner(System.in);
		int totalNumbers; //amount of numbers to be entered
		int number; //number entered by user
		int smallest = 0; //the smallest value	
		
		
		//requesting user input for the total of values that will be entered
		System.out.print("Enter the total of values that will be compared: ");
		totalNumbers = input.nextInt();
		
		//for loop to ask for the numbers
		for (int i = 1; i <= totalNumbers; i++) {
			System.out.print("Enter number: ");
			number = input.nextInt();
			
			if (i == 1) {
				smallest = number; //initialing the smallest to be equal to the first number entered
			}
			
			if (number < smallest) {
				smallest = number;
			}
		}
		
		System.out.printf("%nThe smallest value is %d.", smallest);
	}

}
