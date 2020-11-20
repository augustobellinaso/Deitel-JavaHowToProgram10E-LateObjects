/*Use a two-dimensional array to solve the following problem: A company has
four salespeople (1 to 4) who sell five different products (1 to 5). Once a day, each salesperson passes
in a slip for each type of product sold. Each slip contains the following:
a) The salesperson number
b) The product number
c) The total dollar value of that product sold that day
Thus, each salesperson passes in between 0 and 5 sales slips per day. Assume that the information
from all the slips for last month is available. Write an application that will read all this information for
last month’s sales and summarize the total sales by salesperson and by product. All totals should be
stored in the two-dimensional array sales . After processing all the information for last month, dis-
play the results in tabular format, with each column representing a salesperson and each row repre-
senting a particular product. Cross-total each row to get the total sales of each product for last month.
Cross-total each column to get the total sales by salesperson for last month. Your output should
include these cross-totals to the right of the totaled rows and to the bottom of the totaled columns.*/
/*
 * Augusto Loose Bellinaso
 */

import java.util.Scanner;

public class TotalSales {
	
	//declaring as static so can use it in diferent methods throughout the program
	private static Scanner input = new Scanner(System.in);
	
	//main
	public static void main(String[] args) {
		
		//initializing two-dimensional array
		double[][] slips = new double[6][5]; //we have 5 products, that will be the rows 1-5 and 4 salesman, that will be the columns 1-4
		
		//requesting for user input to initialize the program
		System.out.print("Enter 1 to input sales information or 2 to exit:" );
		int option = input.nextInt();
		
		while(option == 1) {
			//requesting for user to provides sales information
			//salesman number
			System.out.print("Enter salesman number (1 - 4): ");
			int salesman = input.nextInt();
			while(salesman < 1 || salesman > 4) {//validate input
				System.out.print("Enter salesman number (1 - 4): ");
				salesman = input.nextInt();
			}
			//product number
			System.out.print("Enter product number (1 - 5): ");
			int product = input.nextInt();
			while(product < 1 || product > 5) {
				System.out.print("Enter product number (1 - 5): ");
				product = input.nextInt();
			}
			//sales value			
			System.out.print("Enter the dollar value of the product sold: ");
			double value = input.nextDouble();
			//storing the sales value in the slips array. The indexes of the array correspond to the salesman and the product code
			slips[product][salesman] = value;
			
			
			System.out.print("Enter 1 to input sales information or 2 to exit:" );
			option = input.nextInt();
			
		}//end while
		
		
		//displaying the results in tabular form
		System.out.printf("                %15s%15s%15s%15s%15s%n", "Salesman1", "Salesman2", "Salesman3", "Salesman4", "Average");
		for (int row = 1; row < slips.length; row++) {
			System.out.printf("%10s%2d", "Product", row); //display product number
			double productTotal = 0; //the total of sales for each product sold
			//iterating over columns
			for (int column = 1; column < slips[row].length; column++) {
				System.out.printf("%15.2f ", slips[row][column]);
				productTotal += slips[row][column];
			}
			
			double productAverage = productTotal / 4;
			System.out.printf("%15.2f %n", productAverage);
		}

		
		//displaying the average sold by each salesman
		System.out.print("   Average  ");
		for (int row = 1; row < slips.length; row++) {
			double salesmanTotal = 0; //total of sales for each salesman
			for (int column = 1; column < slips[row].length; column++) {
				salesmanTotal += slips[row][column];
			}
			double salesmanAverage = salesmanTotal / 5; //average of sales for each salesman
			System.out.printf("%15.2f", salesmanAverage);
		}
		
		
	}//end main

}
