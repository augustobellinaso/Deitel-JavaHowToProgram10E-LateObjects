/*Write method distance to calculate the distance between two
points (x1, y1) and (x2, y2). All numbers and return values should be of type double . Incorporate
this method into an application that enables the user to enter the coordinates of the points.*/
/*
 * Augusto Loose Bellinaso
 */

import java.util.Scanner;

public class PointsDistance {
	//main method
	public static void main(String[] args) {
		//variables
		Scanner input = new Scanner(System.in);
		double x1;
		double y1;
		double x2;
		double y2;
		
		//requesting using input
		System.out.print("Enter the x coordinate for point 1: ");
		x1 = input.nextDouble();
		System.out.print("Enter the y coordinate for point 1: ");
		y1 = input.nextDouble();
		System.out.print("Enter the x coordinate for point 2: ");
		x2 = input.nextDouble();
		System.out.print("Enter the y coordinate for point 2: ");
		y2 = input.nextDouble();
		
		System.out.printf("The distance between point 1 ate (%.3f, %.3f) and point 2 at (%.3f, %.3f) is: %f", x1, y1, x2, y2, distance(x1, y1, x2, y2));
		
		
	}//end main
	
	//distance method
	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
		
	}

}
