/*Drivers are concerned with the mileage their automobiles get. One driver has
kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
a Java application that will input the miles driven and gallons used (both as integers) for each trip.
The program should calculate and display the miles per gallon obtained for each trip and print the
combined miles per gallon obtained for all trips up to this point. All averaging calculations should
produce floating-point results. Use class Scanner and sentinel-controlled repetition to obtain the
data from the user.*/

/*
Augusto Loose Bellinaso
 */

//importing Scanner class
import java.util.Scanner;

public class GasMileage {
	
	public static void main(String[] args) {
		
		//creating Scanner object;
		Scanner input = new Scanner(System.in);
		
		//initializing variables
		int miles; //miles for each individual trip
		int gallons; //gallons for each individual trip
		int totalMiles = 0; //total miles for all trips
		int totalGallons = 0; //total gallons for all trips
		int tripCounter = 0;
		
		//requesting user input
		System.out.print("Enter miles for trip or 0 to quit: ");
		miles = input.nextInt();
		
		//loop for the program
		while(miles != 0) {
			totalMiles += miles; //for the total miles of the trips
			System.out.print("Enter gallons of gas used: ");
			gallons = input.nextInt();
			totalGallons += gallons;
			tripCounter += 1;
			
			System.out.printf("%nMiles driven for this trip: %d.%n", miles);
			System.out.printf("Gallons used for this trip: %d.%n", gallons);
			System.out.printf("Average mpg for this trip: %.2f.%n", (double) miles / gallons);
			System.out.printf("Average mpg for all %d trips: %.2f.%n", tripCounter, (double) totalMiles / totalGallons);
			System.out.println();
			System.out.print("Enter miles for trip or 0 to quit: ");
			miles = input.nextInt();
		}
		
	}

}
