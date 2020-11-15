/*Modify the craps program of Fig. 5.8 to allow wagering. Ini-
tialize variable bankBalance to 1000 dollars. Prompt the player to enter a wager . Check that wager
is less than or equal to bankBalance , and if it’s not, have the user reenter wager until a valid wager
is entered. Then, run one game of craps. If the player wins, increase bankBalance by wager and dis-
play the new bankBalance . If the player loses, decrease bankBalance by wager , display the new bank-
Balance , check whether bankBalance has become zero and, if so, display the message "Sorry. You
busted!" As the game progresses, display various messages to create some “chatter,” such as "Oh,
you're going for broke, huh?" or "Aw c'mon, take a chance!" or "You're up big. Now's the time to cash in your chips!" .
Implement the “chatter” as a separate method that randomly chooses the
string to display.*/

/*
 * Augusto Loose Bellinaso
 */
import java.security.SecureRandom;
import java.util.Scanner;

public class ModifiedCraps {
	
	//creating a securerandom number generator to use in the method rollDice
	private static final SecureRandom randomNumber = new SecureRandom();
	
	//enum type with constants that represents the game status
	private enum Status {CONTINUE, WON, LOST};
	
	//constants that represent common rolls of the dice
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	
	//plays one game of craps
	public static void main(String[] args) {
		
		//variables
		int myPoint = 0; //to store points if no win or loss on first roll
		Status gameStatus; //can contain CONTINUE, WON or LOST
		int option = 1; //the option chosen by user to play again or to exit
		Scanner input = new Scanner(System.in);
		double bankBalance = 1000; //the initial balance in the account to wager
		double wager; //the amount of money in each wager
	
		do {
			//random number to choose a random message from method chatter
			int randomMessage = randomNumber.nextInt(3); 
			
			
			//displaying balance and asking for wager
			System.out.printf("Your bank balance is: %f%n", bankBalance);
			System.out.print("Enter wager: ");
			wager = input.nextDouble();
			
			while (wager > bankBalance) {//to validate the wager to be limited to the total in the bankBalance
				System.out.print("Invalid wager. Enter again: ");
				wager = input.nextDouble();
			}
			
			
			int sumOfDice = rollDice(); //first roll of the dice
			
			//determine game status and point based on first roll
			switch(sumOfDice) {
				case SEVEN: //win with 7 on first roll
				case YO_LEVEN: //win with 11 on first roll
					gameStatus = Status.WON;
					break;
				case SNAKE_EYES: //lose with 2 on first row
				case TREY: //lose with 3 on first row
				case BOX_CARS: //lose with 12 on first row
					gameStatus = Status.LOST;
					break;
				default: //did not win or lose, so stores point (sum of dices)
					gameStatus = Status.CONTINUE; //game is not over
					myPoint = sumOfDice; //remember the point
					System.out.printf("Point is %d%n", myPoint);
					break;
			} //end switch
			
			//looping while game is not over
			while (gameStatus == Status.CONTINUE) {
				sumOfDice = rollDice(); //roll dice again
				
				if (sumOfDice == myPoint) { //win by making point
					gameStatus = Status.WON;
					bankBalance += wager;
				} else if (sumOfDice == SEVEN) { //lose by rolling 7 before point
					gameStatus = Status.LOST;
					bankBalance -= wager;
				} //end if
			} //end while
			
			//display won or lost message
			if (gameStatus == Status.WON) {
				System.out.println("Player Wins!");
			} else {
				System.out.println("Player loses!");
			} //end if
			
			chatter(randomMessage);
			
			//play again or quit
			System.out.print("Choose 1 to play again or 2 to quit: ");
			option = input.nextInt();
			System.out.println();
			
			
			
		} while (option != 2);

	} //end main
	
	//creating roll dice method
	//roll dice, calculate sum and display results
	public static int rollDice() {
		//pick random value
		int die1 = 1 + randomNumber.nextInt(6);
		int die2 = 1 + randomNumber.nextInt(6);
		
		int sum = die1 + die2; //sum of die values
		
		//display results of this roll
		System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
		
		return sum;
	}//end rollDice
	
	//implementing method do display random messages
	public static void chatter(int number) {
		if (number == 0) {
			System.out.println("Oh, you're going for broke, huh?");
		} else if (number == 1) {
			System.out.println("Aw c'mon, take a chance!");
		} else if (number == 2) {
			System.out.println("You're up big. Now's the time to cash in your chips!");
		}
		
	}
	

}//end class Craps