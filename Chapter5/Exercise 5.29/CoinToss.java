/*Write an application that simulates coin tossing. Let the program toss a coin
each time the user chooses the “ Toss Coin ” menu option. Count the number of times each side of
the coin appears. Display the results. The program should call a separate method flip that takes no
arguments and returns a value from a Coin enum ( HEADS and TAILS ). [Note: If the program realistically
simulates coin tossing, each side of the coin should appear approximately half the time.]*/

/*
 * Augusto Loose Bellinaso
 */

import java.security.SecureRandom;
import java.util.Scanner;

public class CoinToss {
	//static constants/variables
	private enum Coin {HEADS, TAILS};
	
	//main method
	public static void main(String[] args) {
		//variables
		Scanner input = new Scanner(System.in);
		int choice; //to store the choice in the menu
		int headsCount = 0; //to count the amount of times the toss result is heads
		int tailsCount = 0; //to count the amount of times the toss result is tails
		
		
		
		//displaying menu
		System.out.println("Welcome to the coin tossing program! Choose one of the options below:");
		System.out.println("1 - Toss coin.");
		System.out.println("0 - Exit and display results.");
		System.out.print("Enter your choice: ");
		choice = input.nextInt();
		
		do {
			if (flip() == Coin.HEADS) {
				headsCount++;
				System.out.print("Heads! \n");
			} else {
				tailsCount++;
				System.out.print("Tails! \n");
			}
			
			System.out.print("Enter your choice: ");
			choice = input.nextInt();
			
		} while (choice != 0);
		
		
		//displaying results
		System.out.printf("Number of heads: %d%n", headsCount);
		System.out.printf("Number of tails: %d", tailsCount);

	
		
	}//end main
	
	
	//creating flip method
	public static Coin flip() {//will return a variable with type Coin which is an enum
		Coin coinFace; //the face of the coi, which is HEADS or TAILS
		SecureRandom randomNumber = new SecureRandom(); //to generate the random number
		
		int toss = randomNumber.nextInt(2); //randomly choose 0 or 1
		
		if (toss == 0) {
			coinFace = Coin.HEADS;
		} else {
			coinFace = Coin.TAILS;
		}
		
		return coinFace; 
	}

}
