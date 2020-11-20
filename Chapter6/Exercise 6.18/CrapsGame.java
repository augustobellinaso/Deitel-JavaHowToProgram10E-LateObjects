/*Write an application that runs 1,000,000 games of craps (Fig. 5.8) and
answers the following questions:
a) How many games are won on the first roll, second roll, ..., twentieth roll and after the
twentieth roll?
b) How many games are lost on the first roll, second roll, ..., twentieth roll and after the
twentieth roll?
c) What are the chances of winning at craps? [Note: You should discover that craps is one
of the fairest casino games. What do you suppose this means?]
d) What is the average length of a game of craps?
e) Do the chances of winning improve with the length of the game?*/
/*
 * Augusto Loose Bellinaso
 */
import java.security.SecureRandom;

public class CrapsGame {
	
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
		
		int counter = 1; //to count the numbers of games played
		int wins[] = new int[22]; //to store the number of games won on first, second, ... twentieth roll
		int loses[] = new int[22]; //to store the number of games lost on first, second, ... twentieth roll
		int totalGames = 0; //total of rolls throughout all games (in order to find the average of rolls 
		int countWon = 0; //number of times player won 
		int countLost = 0; //number of times player lost
		int winTotal = 0; //to store the number of wins after all games
		int lossTotal = 0; //total number of losses after all games
		
		
		
		while(counter < 1000000) {	
			
			int gameRolls = 0; //number of rolls at each game
			
			
			int sumOfDice = rollDice(); //first roll of the dice
			gameRolls++;
			
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
					break;
			} //end switch
			
			//looping while game is not over
			while (gameStatus == Status.CONTINUE) {
				sumOfDice = rollDice(); //roll dice again
				gameRolls++;
				
				if (sumOfDice == myPoint) { //win by making point
					gameStatus = Status.WON;
				} else if (sumOfDice == SEVEN) { //lose by rolling 7 before point
					gameStatus = Status.LOST;
				} //end if
			} //end while
			
			//increasing the totalGames played
			totalGames += gameRolls;
			
			//we are only counting until 20 rolls
			if(gameRolls > 20) {
				gameRolls = 21;
			}
			
			if (gameStatus == Status.WON) {
				countWon++;
				wins[gameRolls]++;
			} else {
				countLost++;
				loses[gameRolls]++;
			}
			
			
			counter++;	
		}//end while
		
		
		
		//displaying number of rolls needed to win each game
		System.out.printf("Win\t\tRolls\n");
		for(int i = 1; i < wins.length; i++) {
			if ( i <= 20) {
				System.out.printf("%d\t\t%d%n", i, wins[i]);
			} else {
				System.out.printf("21+\t\t%d%n", wins[21]);
			}
		}//end for
		
		System.out.println();
		//displaying number of losses per number of rolls
		System.out.printf("Loss\t\tRolls\n");
		for(int i = 1; i < loses.length; i++) {
			if ( i <= 20) {
				System.out.printf("%d\t\t%d%n", i, loses[i]);
			} else {
				System.out.printf("21+\t\t%d%n", loses[21]);
			}
		}//end for
		System.out.println();
		
		
		//total amount of games won
		for(int i : wins) {
			winTotal += i;
		}
		
		//percentage of games won
		System.out.printf("Percentage of games won is: %d%s%n", winTotal / 10000, "%");
		
		//average number of rolls per game
		System.out.printf("The average number of rolls per game is: %d%n", totalGames / 1000000);
		
		

			
			
	} //end main
	
	//creating roll dice method
	//roll dice, calculate sum and display results
	public static int rollDice() {
		//pick random value
		int die1 = 1 + randomNumber.nextInt(6);
		int die2 = 1 + randomNumber.nextInt(6);
		int sum = die1 + die2; //sum of die values
		
		return sum;
	}//end rollDice
	

}//end class Craps
