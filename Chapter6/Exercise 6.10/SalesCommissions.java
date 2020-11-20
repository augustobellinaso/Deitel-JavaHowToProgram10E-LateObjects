/*Use a one-dimensional array to solve the following problem: A com-
pany pays its salespeople on a commission basis. The salespeople receive $200 per week plus 9% of
their gross sales for that week. For example, a salesperson who grosses $5,000 in sales in a week re-
ceives $200 plus 9% of $5,000, or a total of $650. Write an application (using an array of counters)
that determines how many of the salespeople earned salaries in each of the following ranges (assume
that each salesperson’s salary is truncated to an integer amount):
a) $200–299
b) $300–399
c) $400–499
d) $500–599
e) $600–699
f) $700–799
g) $800–899
h) $900–999
i) $1,000 and over
Summarize the results in tabular format.*/
/*
 * Augusto Loose Bellinaso
 */

import java.util.Scanner;

public class SalesCommissions {
	
	public static void main(String[] args) {
		
		//variables
		Scanner input = new Scanner(System.in);
		int[] array = new int[9]; //an int array to store the amount of salespeople in each range of values
		double sales; //the sales of each salesman
		int counter = 0; //to count and request for user input
		

		
		while (counter < 10) {
			//requesting user input
			System.out.print("Enter sales: ");
			sales = input.nextDouble();
			sales = sales * 0.09 + 200; //calculating the commission based on each salesman sales
			
			//checking the range in which sales is
			if (sales >= 200 && sales <= 299) {
				array[0]++; //increment in the array
			} else if (sales <= 399) {
				array[1]++;
			} else if (sales <= 499) {
				array[2]++;
			} else if (sales <= 599) {
				array[3]++;
			} else if (sales <= 699) {
				array[4]++;
			} else if (sales <= 799) {
				array[5]++;
			} else if (sales <= 899) {
				array[6]++;
			} else if (sales <= 999) {
				array[7]++;
			} else {
				array[8]++;
			}			
			
			counter++;
		}//end while
		
		
		//displaying results in tabular form
		System.out.printf("Range\t\t\tNo. of Salesman");
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			headers(i);
			System.out.printf("%d", array[i]);
			System.out.println();
			
		}
		
		
	}//end main
	
	//creating method to display the range of values
	public static void headers(int number) {
		switch(number) {
			case 0:
				System.out.printf("$200-$299\t\t\t");
				break;
			case 1:
				System.out.printf("$300-$399\t\t\t");
				break;
			case 2:
				System.out.printf("$400-$499\t\t\t");
				break;
			case 3:
				System.out.printf("$500-$599\t\t\t");
				break;
			case 4:
				System.out.printf("$600-$699\t\t\t");
				break;
			case 5:
				System.out.printf("$700-$799\t\t\t");
				break;
			case 6:
				System.out.printf("$800-$899\t\t\t");
				break;
			case 7:
				System.out.printf("$900-$999\t\t\t");
				break;
			case 8:
				System.out.printf("$1000+\t\t\t\t");
				break;
		}
	}

}
