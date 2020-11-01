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
		
	
	//creating Scanner object
	Scanner input = new Scanner(System.in);
	
	//initializing variables
	int totalMiles = 0;
	int totalGallons= 0;
	int tripCounter = 0;
	double tripMilesPerGallon;
	
	//Asking for the user input and informing the sentinel to exit the program/loop
	System.out.print("Enter the amount of miles driven or 0 to exit: ");
	int milesDriven = input.nextInt();
	System.out.print("Enter the amount of gallons used or 0 to exit: ");
	int gallonsUsed = input.nextInt();
	
	while(milesDriven != 0 || gallonsUsed != 0) {
		totalMiles = totalMiles + milesDriven;
		totalGallons = totalGallons + gallonsUsed;
		tripCounter += 1;
		
		tripMilesPerGallon = (double) milesDriven /gallonsUsed;
		System.out.printf("%nFor this trip you did %.2f miles per gallon. %n", tripMilesPerGallon);
		
		System.out.print("Enter the amount of miles driven or 0 to exit: ");
		milesDriven = input.nextInt();
		System.out.print("Enter the amount of gallons used or 0 to exit: ");
		gallonsUsed = input.nextInt();
		
	}
	
	//termination phase (check if user entered information
	if (totalMiles != 0 && totalGallons != 0) {
		double averageMilesPerGallon = (double) totalMiles / totalGallons;
		System.out.printf("%nThe average for the %d trips is %.2f miles per gallon. %n", tripCounter, averageMilesPerGallon);
	} else {
		System.out.println("No trip record entered.");
	}
	
	}
}
