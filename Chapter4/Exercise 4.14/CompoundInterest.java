/*Modify the compound-interest application of
Fig. 4.6 to repeat its steps for interest rates of 5%, 6%, 7%, 8%, 9% and 10%. Use a for loop to
vary the interest rate.*/
/*
Augusto Loose Bellinaso
*/
public class CompoundInterest {

	public static void main(String[] args){
		
		//declaring variables
		double amount; //the amount on deposit at the end of the nth year
		double principal = 1000.0; //original amount invested
		double rate = 5; //annual interest rate
		int counter = 0; // to count over all interest rates
		
		for (counter = 0; counter <= 5; counter++) {
			
		
			//displaying headers
			System.out.printf("Interest rate: %.2f%s%n", counter + rate, "%");
			System.out.printf("%s%20s%n", "Year", "Amount on deposit");
		
		
		//calculate amount on deposit for each of the ten years
			for (int year = 1; year <= 10; ++year){
				//calculating the amount at specified year
				amount = principal * Math.pow(1.0 + (double)((counter + rate) / 100), year);
			
				//display the year and the amount
				System.out.printf("%4d %,20.2f%n", year, amount);
			}
			System.out.println();
		}
	}
}
