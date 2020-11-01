/* A large company pays its salespeople on a commission basis.
The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5000, or a
total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
these items are as follows:
Item
1
2
3
4
Value
239.99
129.75
99.95
350.89
Develop a Java application that inputs one salesperson’s items sold for last week and calculates and
displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.*/

/*
Augusto Loose Bellinaso
 */

//importing class Scanner
import java.util.Scanner;

public class SalesCommission {
	
	public static void main(String[] args) {
		//creating Scanner object and initializing variables
		Scanner input = new Scanner(System.in);
		int item1; //number sold for first item which costs 239.99
		int item2; //number sold for second item which costs 129.75
		int item3; //number sold for third item which costs 99.95
		int item4; //number sold for fourth item which costs 350.89
		double totalSales = 0; //total sales made during the week
		int counter = 1; //sentinel for the while loop
		
		while(counter != -1) {
			System.out.print("Enter the number sold for the first item: ");
			item1 = input.nextInt();
			totalSales += (double) (item1 * 239.99); //adding this to the total of sales
			System.out.print("Enter the number sold for the second item: ");
			item2 = input.nextInt();
			totalSales += (double) (item2 * 129.75); //adding this to the total of sales
			System.out.print("Enter the number sold for the third item: ");
			item3 = input.nextInt();
			totalSales += (double) (item3 * 99.95); //adding this to the total of sales
			System.out.print("Enter the number sold for the fourth item: ");
			item4 = input.nextInt();
			totalSales += (double) (item4 * 350.89); //adding this to the total of sales
			
			System.out.printf("Total earned during the week: %.2f.%n", 200.0 + (9.0 / 100) * totalSales);
			System.out.print("Enter 1 to calculate more or -1 to quit: ");
			counter = input.nextInt();
			
			
		}
		
	}

}
