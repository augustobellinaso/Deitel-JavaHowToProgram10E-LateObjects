/*Modify the program of Exercise 5.30 to count the num-
ber of guesses the player makes. If the number is 10 or fewer, display Either you know the secret
or you got lucky! If the player guesses the number in 10 tries, display Aha! You know the secret!
If the player makes more than 10 guesses, display You should be able to do better! Why should it
take no more than 10 guesses? Well, with each “good guess,” the player should be able to eliminate
half of the numbers, then half of the remaining numbers, and so on*/

/*
 * Augusto Loose Bellinaso
 */

import java.util.Scanner;
import java.security.SecureRandom;
public class ModifiedGuessNumber {
	//main method
	public static void main(String[] args) {
		//variables
		Scanner input = new Scanner(System.in);
		SecureRandom randomNumber = new SecureRandom();
		int guess; //to store the guess made by user
		int choice; //to store the choice made by user after guessing the number]
		int count = 1; //to store the number of attempts made
	
		boolean guessAgain = false; //to control the execution of the loop
		
				
		//displaying prompt and loop
		while (!guessAgain) {
			System.out.print("Guess a number between 1 and 1000: ");
			guess = input.nextInt();
			
			int programNumber = 1 + randomNumber.nextInt(1000); //random number chosen by computer
			
			while (guess != programNumber) {
				
				if (guess > programNumber) {
					System.out.println("Too high! Try again.");
					count++;
				} else if (guess < programNumber) {
					System.out.println("Too low! Try again.");
					count++;
				}
				
				guess = input.nextInt();
												
			}//end while
			
			System.out.print("Congratulations! You guesse the number!\n");
			if (count <= 10) {
				System.out.println("Aha! You know the secret!");
			} else {
				System.out.println("You should be able to do better!");
			}
			
			System.out.print("Enter 1 to play again or 2 to exit: ");
			choice = input.nextInt();
			if (choice == 1) {
				guessAgain = false;
				count = 1;
			} else {
				guessAgain = true;
			}//end if
						
		}//end while
	}//end main
}
