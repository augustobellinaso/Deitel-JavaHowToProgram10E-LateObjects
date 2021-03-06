
/*Write an application that computes the value of ex by using the following formula. Al-
low the user to enter the number of terms to calculate.*/
/*
Augusto Loose Bellinaso
 */
import java.util.Scanner;

public class ExponentialX {

	public static void main(String[] args) {
		//initializing variables
		Scanner input = new Scanner(System.in);
		int numberOfTerms; //number of terms to calculate, input by user
		int counter1 = 1; //to use in the loop
		int x; //x exponent for the exponential
		float e = 1; //value of e
		
		System.out.print("Enter the number of terms you want to calculate: ");
		numberOfTerms = input.nextInt();
		System.out.print("Enter the value of x: ");
		x = input.nextInt();
		
		
		while(counter1 <= numberOfTerms) {
			int factorial = 1; //to calculate the factorial for the approximation
			int counter2 = 1; //to the second while loop used to calculate the factorial
			
			while(counter2 <= counter1) {
				factorial = factorial * counter2;
				counter2 ++;
			}
			
			e = e +  (float) Math.pow(x, counter1) / (float) factorial;
			
			counter1++;
		}
		
		
		System.out.printf("The approximation for e with %d terms is: %f.", numberOfTerms, e);
	}
}
