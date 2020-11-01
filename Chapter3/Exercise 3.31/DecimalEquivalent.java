/*Write an application that inputs an
integer containing only 0s and 1s (i.e., a binary integer) and prints its decimal equivalent. [Hint: Use
the remainder and division operators to pick off the binary number’s digits one at a time, from right
to left. In the decimal number system, the rightmost digit has a positional value of 1 and the next
digit to the left a positional value of 10, then 100, then 1000, and so on. The decimal number 234
can be interpreted as 4 * 1 + 3 * 10 + 2 * 100. In the binary number system, the rightmost digit has
a positional value of 1, the next digit to the left a positional value of 2, then 4, then 8, and so on.
The decimal equivalent of binary 1101 is 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8, or 1 + 0 + 4 + 8 or, 13.]*/

/*
Augusto Loose Bellinaso
 */
//importing Scanner class
import java.util.Scanner;

public class DecimalEquivalent {
	
	public static void main(String[] args) {
		
		//creating Scanner object
		Scanner input = new Scanner(System.in);
		int binaryNumber; //binary number input by user
		int binary; //just to store the initial binary value
		int remainder;  //remainder to use in calculations
		int decimal = 0; //the decimal output. Initialize in order to calculate it during the while loop
		int power = 0; //the power used to convert binary to decimal, like 2^power
		
		
		
		//requesting user input
		System.out.print("Enter a binary integer: ");
		binaryNumber = input.nextInt();
		binary = binaryNumber;
		
		
		
		while(binaryNumber != 0) {
			remainder = binaryNumber % 10;
			decimal = (int) (decimal + remainder * Math.pow(2, power));
			binaryNumber = binaryNumber / 10;
			power++;
		}
		
		System.out.printf("The decimal correspondent to the binary %d is: %d.", binary, decimal);
		
	}

}
