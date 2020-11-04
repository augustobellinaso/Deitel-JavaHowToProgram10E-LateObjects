/*One interesting application of computers is to display
graphs and bar charts. Write an application that reads five numbers between 1 and 30. For each
number that’s read, your program should display the same number of adjacent asterisks. For exam-
ple, if your program reads the number 7, it should display ******* . Display the bars of asterisks after
you read all five numbers.*/

/* 
 * Augusto Loose Bellinaso
 */
//importing Scanner
import java.util.Scanner; 

public class BarChart {
	
	public static void main(String[] args) {
		//variables
		Scanner input = new Scanner(System.in);
		int number; //to store the number input by user
		
		
		//Requesting user input
		System.out.printf("Enter five integers between 1 and 30 (space-separated): ");
		
		
		while(input.hasNextInt()) {
			
			number = input.nextInt();
			
			for (; number > 0; number--) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		
		
		
		
		
	}//end of main

}
