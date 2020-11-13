/*Implement the following integer methods:
a) Method celsius returns the Celsius equivalent of a Fahrenheit temperature, using the
calculation
celsius = 5.0 / 9.0 * (fahrenheit - 32);
b) Method fahrenheit returns the Fahrenheit equivalent of a Celsius temperature, using
the calculation
fahrenheit = 9.0 / 5.0 * celsius + 32;
c) Use the methods from parts (a) and (b) to write an application that enables the user ei-
ther to enter a Fahrenheit temperature and display the Celsius equivalent or to enter a
Celsius temperature and display the Fahrenheit equivalent.*/

/*
 * Augusto Loose Bellinaso
 */
import java.util.Scanner;
public class TemperatureConversion {
	//main method
	public static void main(String[] args) {
		//variables
		Scanner input = new Scanner(System.in);
		double temp; //to store the temperature input
		int choice; //to store the choice made by user
		
		//requesting for user input
		System.out.println("Temperature conversion method:");
		System.out.println("1 - Convert from Fahrenheit to Celsius.");
		System.out.println("2 - Convert from Celsius to Fahrenheit.");
		System.out.println("0 - to exit.");
		System.out.print("Enter your choice: ");
		choice = input.nextInt();
		
		while(choice != 0) {
			//fahrenheit to celsius
			if (choice == 1) {
				System.out.print("Enter temperature in Fahrenheit: ");
				temp = input.nextDouble();
				System.out.printf("The temperature in Celsius is: %.2f%n", celsius(temp));				
			} else {
				System.out.print("Enter temperature in Celsius: ");
				temp = input.nextDouble();
				System.out.printf("The temperature in Fahrenheit is: %.2f%n", fahrenheit(temp));
			}
			System.out.println();
			System.out.println("Temperature conversion method:");
			System.out.println("1 - Convert from Fahrenheit to Celsius.");
			System.out.println("2 - Convert from Celsius to Fahrenheit.");
			System.out.println("0 - to exit.");
			System.out.print("Enter your choice: ");
			choice = input.nextInt();
		}
		
	}//end main
	
	
	//celsius method
	public static double celsius(double fTemperature) {
		double cTemperature;
		cTemperature = (9.0 / 5.0) * (fTemperature - 32.0);
		return cTemperature;
	}
	//fahrenheit method
	public static double fahrenheit(double cTemperature) {
		double fTemperature;
		fTemperature = (9.0 / 5.0) * cTemperature + 32.0;
		return fTemperature;
	}

}
