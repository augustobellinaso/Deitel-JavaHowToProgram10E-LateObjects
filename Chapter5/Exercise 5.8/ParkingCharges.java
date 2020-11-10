/*A parking garage charges a $2.00 minimum fee to park for up to three
hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three
hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for
longer than 24 hours at a time. Write an application that calculates and displays the parking charges
for each customer who parked in the garage yesterday. You should enter the hours parked for each
customer. The program should display the charge for the current customer and should calculate and
display the running total of yesterday’s receipts. It should use the method calculateCharges to de-
termine the charge for each customer.*/

/*
 * Augusto Loose Bellinaso
 */
import java.util.Scanner;
public class ParkingCharges {
	
	public static void main(String[] args) {
		
		//variables
		Scanner input = new Scanner(System.in);
		double parkingTime = 0; //to store the total time that the input customer was parked
		double totalCharges; //total of charges for customers during each day
		int customerCount = 1; //to store the number of customers in order to display it
		
		//requestin user input
		System.out.printf("Enter hours parked in garage for customer %d or enter -1 to quit: ", customerCount);
		parkingTime = input.nextDouble();
		
		
		//looping for more customers
		while (parkingTime != -1) {
			
			//calculating charges
			totalCharges = calculateCharges(parkingTime);
			
			//displaying total charges for each customer
			System.out.printf("The total charged for customer %d is: $%.2f%n", customerCount, totalCharges);
			
			//incrementing customerCount
			customerCount++;
			
			System.out.printf("Enter hours parked in garage for customer %d or enter -1 to quit: ", customerCount);
			parkingTime = input.nextDouble();
		}
		
	}//end main
	

	//creating method calculateCharges
	public static double calculateCharges(double hours) {
		double charges = 0;
		
		if (hours <= 3) { //for this period only pays 2
			charges = 2.00;			
		} else {
			charges = (Math.ceil(hours) - 3) * 0.5 + 2.00; 
		}
		
		if (charges > 10) { //10 is the maximum you will pay for 24 hours
			charges = 10;
		}
		
		return charges;
		
	}//end method
	
}//end class
