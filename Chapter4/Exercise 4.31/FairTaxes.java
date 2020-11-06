/*There are many proposals to make taxation fairer.
Check out the FairTax initiative in the United States at www.fairtax.org . Research how the pro-
posed FairTax works. One suggestion is to eliminate income taxes and most other taxes in favor of
a 23% consumption tax on all products and services that you buy. Some FairTax opponents ques-
tion the 23% figure and say that because of the way the tax is calculated, it would be more accurate
to say the rate is 30%—check this carefully. Write a program that prompts the user to enter expenses
in various expense categories they have (e.g., housing, food, clothing, transportation, education,
health care, vacations), then prints the estimated FairTax that person would pay.*/

/*
 * Augusto Loose Bellinaso
 */

import java.util.Scanner;

public class FairTaxes {
	
	public static void main(String[] args) {
		
		//variables
		Scanner input = new Scanner(System.in);
		double totalExpenses = 0; //to store the total of expenses
		String category; //to store the expense category
		
		System.out.println("Calculating the FairTax at 25% \n");
		
		System.out.printf("Enter the expenses category or type exit to end the program: ");
		category = input.next();
		
		while(!category.equals("Exit")) { //using the equals() method from String class
			System.out.printf("Enter the total expenses for %s: ", category);
			totalExpenses += input.nextDouble();
			
			System.out.printf("Enter the expenses category or type exit to end the program: ");
			category = input.next();
		}
		
		
		System.out.printf("The total of the expenses is: $%.2f %n", totalExpenses);
		System.out.printf("Your taxes are: $%.2f.", (totalExpenses * 0.25));
		
		
		
		
	}

}
