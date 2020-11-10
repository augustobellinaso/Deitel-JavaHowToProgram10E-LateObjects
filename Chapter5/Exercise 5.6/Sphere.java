/*Declare method sphereVolume to calculate and return the volume of the sphere. Use the
following statement to calculate the volume:
double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)
Write a Java application that prompts the user for the double radius of a sphere, calls sphereVolume
to calculate the volume and displays the result.*/

/*
 * Augusto Loose Bellinaso
 */

//importing Scanner
import java.util.Scanner;

public class Sphere {
	
	public static void main(String[] args) {
		//variables
		Scanner input = new Scanner(System.in);
		double radius;
		
		
		//requesting user to input radius
		System.out.printf("Enter the radius of the sphere to calculate its volume (enter as a floating-point number): ");
		radius = input.nextDouble();
		
		System.out.printf("The volume of the sphere with radius %f is: %f%n", radius, sphereVolume(radius));
				
	}//end main	
	
	//creating method sphereVolume
	public static double sphereVolume(double radius) {
		double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
		
		return volume;
				
	}
	

}
