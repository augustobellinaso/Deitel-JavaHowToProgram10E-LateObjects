/*Using an approach similar to that for Exercise 3.21, find
the two largest values of the 10 values entered. [Note: You may input each number only once.*/

/*
Augusto Loose Bellinaso
 */
//importing Scanner class
import java.util.Scanner;

public class LargestsNumbers {
	public static void main(String[] args) {
		//initializing variables
		Scanner input = new Scanner(System.in);
		int counter = 1; //the counter for the while loop
		int number; //to store the input number
		int largest1; //the first largest number
		int largest2; //the second largest number
		
		System.out.print("Enter a number: ");
		number = input.nextInt();
		largest1 = number; //by default the largest number is the first one entered
		largest2 = number; //set the second largest to also be the first number entered
		
		while(counter < 10) {
			System.out.print("Enter a number: ");
			number = input.nextInt();
			
			if (number > largest1) {
				largest2 = largest1;
				largest1 = number;
			}
			
			if (number < largest1 && number > largest2) {
				largest2 = number;
			}	
			
			counter++;
		}
		
		System.out.printf("The largest number is %d.%n", largest1);
		System.out.printf("The second largest number is %d.%n", largest2);
	}

}
