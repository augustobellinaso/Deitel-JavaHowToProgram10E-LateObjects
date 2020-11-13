/*Write an application that prompts the user for the radius of a circle and uses
a method called circleArea to calculate the area of the circle.*/

/*
 * Augusto Loose Bellinaso
 */

import java.util.Scanner;
public class CircleArea {
	
	public static void main(String[] args) {
		//variables
		Scanner input = new Scanner(System.in);
		double radius; //the radius of the circle
		
		//requesting user input
		System.out.print("Enter the circle radius to calculate its area: ");
		radius = input.nextDouble();
		
		System.out.printf("The are of the circle with radius = %f is: %f.", radius, circleArea(radius));
	}//end main
	
	//creating method to calculate area
	public static double circleArea(double radius) {
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}

}
