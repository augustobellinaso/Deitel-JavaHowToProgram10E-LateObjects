/*Write a method isMultiple that determines, for a pair of integers, whether the
second integer is a multiple of the first. The method should take two integer arguments and return
true if the second is a multiple of the first and false otherwise. [Hint: Use the remainder operator.]
Incorporate this method into an application that inputs a series of pairs of integers (one pair at a
time) and determines whether the second value in each pair is a multiple of the first.*/

/*
 * Augusto Loose Bellinaso
 */

//importing scanner
import java.util.Scanner;

public class Multiples {
	
	public static void main(String[] args) {
		//variables
		Scanner input = new Scanner(System.in);
		int num1; //store the first number
		int num2; //store the second number
		
		//requesting user input
		System.out.print("Enter a pair of numbers or enter A to quit: ");
		
		while (!input.hasNext("A")) {
			num1 = input.nextInt();
			num2 = input.nextInt();
			
			//testing the numbers
			if (isMultiple(num1, num2)) {
				System.out.printf("%d is multiple of %d.%n", num2, num1);
			} else {
				System.out.printf("%d is not multiple of %d.%n", num2, num1);
			}
			
			System.out.println();
			System.out.print("Enter a pair of numbers or enter A to quit: ");
			
		}
		
	}//end main
	
	//creating method isIMultiple
	public static boolean isMultiple(int a, int b) {
		
		if (b % a == 0) { //in this case it is multiple
			return true;
		} else {
			return false;
		}
		
	}//end method

}
