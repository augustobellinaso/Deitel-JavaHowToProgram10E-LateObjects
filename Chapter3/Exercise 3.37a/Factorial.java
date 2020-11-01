/*Write an application that reads a nonnegative integer and computes and prints its fac-
torial.*/
/*
Augusto Loose Bellinaso
 */
//importing scanner
import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		//initializing variables
		Scanner input = new Scanner(System.in);
		int number;
		int counter = 1;
		int fatorial;
		
		//requesting user input
		System.out.print("Enter a nonnegative integer: ");
		number = input.nextInt();
		fatorial = number;
		
		if(number == 0) {
			fatorial = 1;
			System.out.printf("The fatorial of %d is: %d", number, fatorial);
		} else {
			
			while(counter < number) {
				fatorial = fatorial * (number - counter);
				counter++;			
			
			}
		
			System.out.printf("The fatorial of %d is: %d.", number, fatorial);
		}
		
	}

}
