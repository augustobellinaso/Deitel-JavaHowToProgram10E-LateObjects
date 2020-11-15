/*Write an application that plays “guess the number” as follows: Your
program chooses the number to be guessed by selecting a random integer in the range 1 to 1000.
The application displays the prompt Guess a number between 1 and 1000 . The player inputs a first
guess. If the player's guess is incorrect, your program should display Too high. Try again. or Too
low. Try again. to help the player “zero in” on the correct answer. The program should prompt the
user for the next guess. When the user enters the correct answer, display Congratulations. You
guessed the number! , and allow the user to choose whether to play again. [Note: The guessing tech-
nique employed in this problem is similar to a binary search, which is discussed in Chapter 19,
Searching, Sorting and Big O.]*/

/*
 * Augusto Loose Bellinaso
 */
import java.util.Scanner;
import java.security.SecureRandom;

public class NumberGuessing {
	//main method
	public static void main(String[] args) {
		//variables
		Scanner input = new Scanner(System.in);
		SecureRandom randomNumber = new SecureRandom();
		int guess; //to store the guess made by user
		int choice; //to store the choice made by user after guessing the number
	
		boolean guessAgain = false; //to control the execution of the loop
		
				
		//displaying prompt and loop
		while (!guessAgain) {
			System.out.print("Guess a number between 1 and 1000: ");
			guess = input.nextInt();
			
			int programNumber = 1 + randomNumber.nextInt(1000); //random number chosen by computer
			
			while (guess != programNumber) {
				
				if (guess > programNumber) {
					System.out.println("Too high! Try again.");
				} else if (guess < programNumber) {
					System.out.println("Too low! Try again.");
				}
				
				guess = input.nextInt();
												
			}//end while
			
			System.out.print("Congratulations! You guesse the number!\n");
			System.out.print("Enter 1 to play again or 2 to exit: ");
			choice = input.nextInt();
			if (choice == 1) {
				guessAgain = false;
			} else {
				guessAgain = true;
			}//end if
						
		}//end while
	}//end main
	

}
