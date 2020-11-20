/*Write an application to simulate the rolling of two dice. The application
should use an object of class Random once to roll the first die and again to roll the second die. The
sum of the two values should then be calculated. Each die can show an integer value from 1 to 6, so
the sum of the values will vary from 2 to 12, with 7 being the most frequent sum, and 2 and 12 the
least frequent. Figure 6.21 shows the 36 possible combinations of the two dice. Your application
should roll the dice 36,000,000 times. Use a one-dimensional array to tally the number of times
each possible sum appears. Display the results in tabular format.*/
/*
 * Augusto Loose Bellinaso
 */

import java.util.Random;

public class DiceRolling {
	
	private static Random randomNumber = new Random();
	
	public static void main(String[] args) {
		
		int[] sumsFrequency = new int[13]; //array to store the sum of the 2 rolls
		
		
		//rolling 36000000 times
		for (int roll = 1; roll <= 36000000; roll++) {
			++sumsFrequency[diceSum()];
		}
		
		System.out.print("Sum\tFrequency");
		System.out.println();
		for (int element = 2; element < sumsFrequency.length; element++) {
			System.out.printf("%d\t%d", element, sumsFrequency[element]);
			System.out.println();
		}
		
	}//end main
	
	
	//method to roll two dies and sum its values
	public static int diceSum() {
		int roll1 = 1 + randomNumber.nextInt(6);
		int roll2 = 1 + randomNumber.nextInt(6);
		int sum = roll1 + roll2;
		
		return sum;
		}

}
