/*The explosive growth of Internet communications
and data storage on Internet-connected computers has greatly increased privacy concerns. The field
of cryptography is concerned with coding data to make it difficult (and hopefully—with the most
advanced schemes—impossible) for unauthorized users to read. In this exercise you’ll investigate a
simple scheme for encrypting and decrypting data. A company that wants to send data over the In-
ternet has asked you to write a program that will encrypt it so that it may be transmitted more se-
curely. All the data is transmitted as four-digit integers. Your application should read a four-digit
integer entered by the user and encrypt it as follows: Replace each digit with the result of adding 7
to the digit and getting the remainder after dividing the new value by 10. Then swap the first digit
with the third, and swap the second digit with the fourth. Then print the encrypted integer. Write
a separate application that inputs an encrypted four-digit integer and decrypts it (by reversing the
encryption scheme) to form the original number. [Optional reading project: Research “public key
cryptography” in general and the PGP (Pretty Good Privacy) specific public key scheme. You may
also want to investigate the RSA scheme, which is widely used in industrial-strength applications.]*/
/*
Augusto Loose Bellinaso
 */
//importing Scanner
import java.util.Scanner;

public class Encryption {
	public static void main(String[] args) {
		//initializing variables
		Scanner input = new Scanner(System.in);
		int number; //four-digit integer input by user that will be encrypted
		int digit; //to access each digit of the number
		int newDigit; //the new digit to replace the old digit
		int encryptedNumber = 0; //the number after encryption
		int counter = 0; //to use in the while loop;
		
		//Encrypting the number

		//requesting user input
		System.out.print("Enter a four-digit integer to encrypt: ");
		number = input.nextInt();
		
		//validating the input to be only a four-digit integer
		while(number < 1000 || number > 9999) {
			System.out.print("Enter a four-digit integer to encrypt: ");
			number = input.nextInt();
		}
		
		while(counter <= 3) {
			digit = number % 10;
			number = number / 10;
			newDigit = (digit + 7) % 10;
			//to create the encrypted integer using decimal
			encryptedNumber = encryptedNumber + newDigit * ((int) Math.pow(10, counter));
						
			counter++;
		}
		
		System.out.printf("The encrypted number is: %d", encryptedNumber);
				

		
	}

}
