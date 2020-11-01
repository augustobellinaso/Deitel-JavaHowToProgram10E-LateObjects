/*
Augusto Loose Bellinaso
 */
import java.util.Scanner;

public class Decryption {

	public static void main(String[] args) {
				
		Scanner input = new Scanner(System.in);
		int number; //four-digit integer input by user that will be encrypted
		int digit; //to access each digit of the number
		int newDigit; //the new digit to replace the old digit
		int decryptedNumber = 0; //the number after decryption
		int counter = 0; //to use in the while loop;
		
					
		//Requesting user input
		System.out.print("Enter a four-digit integer to decrypt: ");
		number = input.nextInt();
		//validating the input to be only a four-digit integer
		while(number < 1000 || number > 9999) {
			System.out.print("Enter a four-digit integer to encrypt: ");
			number = input.nextInt();
		}
		
		while(counter <= 3) {
			digit = number % 10;
			number = number / 10;
			newDigit = (digit + 3) % 10;
			//to create the2 encrypted integer using decimal
			decryptedNumber = decryptedNumber + newDigit * ((int) Math.pow(10, counter));
						
			counter++;
		}		
		
		System.out.printf("The decrypted number is: %d", decryptedNumber);
	}
	
	
}
