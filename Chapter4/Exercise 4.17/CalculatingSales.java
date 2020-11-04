/*An online retailer sells five products whose retail prices are as follows:
Product 1, $2.98; product 2, $4.50; product 3, $9.98; product 4, $4.49 and product 5, $6.87.
Write an application that reads a series of pairs of numbers as follows:
a) product number
b) quantity sold
Your program should use a switch statement to determine the retail price for each product. It
should calculate and display the total retail value of all products sold. Use a sentinel-controlled
loop to determine when the program should stop looping and display the final results.*/
/*
 * Augusto Loose Bellinaso
 */
//importing Scanner
import java.util.Scanner;

public class CalculatingSales {
	
	public static void main(String[] args) {
		//variables
		Scanner input = new Scanner(System.in);
		int productCode = 0; //the product number that is input by the user
		int productQuantity; //the quantity of the respective product that was bought by the user
		double retailPrice = 0.0; //the total retail price for each product
		
		//Displaying the product information for the user
		System.out.printf("Code \t Product \t Value %n");
		System.out.printf("1 \t Product 1 \t $2.98 %n");
		System.out.printf("2 \t Product 2 \t $4.50 %n");
		System.out.printf("3 \t Product 3 \t $9.98 %n");
		System.out.printf("4 \t Product 4 \t $4.49 %n");
		System.out.printf("5 \t Product 5 \t $6.87 %n");
		System.out.printf("******************************%n");
		System.out.print("Enter product code from table above or enter 6 to exit: ");
		productCode = input.nextInt(); //reading the product code from the user
		
		while(productCode != 6) {
			System.out.printf("Enter quantity for product %d: ", productCode);
			productQuantity = input.nextInt(); //reading product quantity for the user
			switch(productCode) {
				case 1:
					retailPrice += productQuantity * 2.98;
					break;
				case 2:
					retailPrice += productQuantity * 4.50;
					break;
				case 3:
					retailPrice += productQuantity * 9.98;
					break;
				case 4:
					retailPrice += productQuantity * 4.49;
					break;
				case 5:
					retailPrice += productQuantity * 6.87;
					break;
			} //end switch
			
			System.out.print("Enter product code from table above or enter 6 to exit: ");
			productCode = input.nextInt();	
			
		}//end while
		
		System.out.printf("Total retail value for all products sold: $%.2f.", retailPrice);
	}//end main

}
