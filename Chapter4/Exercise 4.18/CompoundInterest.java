/*Modify the application in Fig. 4.6 to use only in-
tegers to calculate the compound interest. [Hint: Treat all monetary amounts as integral numbers
of pennies. Then break the result into its dollars and cents portions by using the division and re-
mainder operations, respectively. Insert a period between the dollars and the cents portions.] */
/*
 * Augusto Loose Bellinaso
 */

//importing scanner
import java.util.Scanner;

public class CompoundInterest {
	
	public static void main(String[] args) {
		
		//declaring variables
		Scanner input = new Scanner(System.in);
		int amount; //amount on deposit at end of each year, in pennies
		int principal; //initial amount before interest, in pennies
		int rate = 5; //rate of interest. In this case it is 5%
		int cents; //to store the cents part of the values, amount / 100
		int dollars; //to store the dollars part of the values, amount % 100
		
		//requesting user input for the principal value
		System.out.print("Enter the initial amount before interest, in pennies: ");
		principal = input.nextInt();
		
		//displaying headers
		System.out.printf("%s%20s%n", "Year", "Amount on Deposit");
		
		//looping through the years to calculate the amount after interest
		for (int year = 1; year <= 10; year++) {
			//calculating new amount for specified year
			amount = (principal * (100 + rate)) / 100;
			principal = amount;
			dollars = amount / 100;
			cents = amount % 100;
			
			//displaying in and amount
			System.out.printf("%4d %20d.%d%n", year, dollars, cents);
		}
		
	}

}
