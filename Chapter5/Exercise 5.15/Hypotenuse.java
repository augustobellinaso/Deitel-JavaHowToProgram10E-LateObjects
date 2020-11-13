/*Define a method hypotenuse that calculates the hypotenuse of
a right triangle when the lengths of the other two sides are given. The method should take two ar-
guments of type double and return the hypotenuse as a double . Incorporate this method into an
application that reads values for side1 and side2 and performs the calculation with the hypotenuse
method. Use Math methods pow and sqrt to determine the length of the hypotenuse for each of the
triangles in Fig. 5.14. [Note: Class Math also provides method hypot to perform this calculation.]*/
/*
 * Augusto Loose Bellinaso
 */

//importing Scanner
import java.util.Scanner;

public class Hypotenuse {
	
	public static void main(String[] args) {
		//variables
		Scanner input = new Scanner(System.in);
		double side1; //to store the length of side1
		double side2; //to store the length of side2
		
		//requesting user input
		System.out.print("Enter the length of side1: ");
		side1 = input.nextDouble();
		System.out.print("Enter the length of side2: ");
		side2 = input.nextDouble();
		
		System.out.printf("%nSide1 = %f \t Side2 = %f \t Hypotenuse = %f%n", side1, side2, hypotenuse(side1, side2));
	}
	
	
	
	
	//creating method hypotenuse
	public static double hypotenuse(double side1, double side2) {
		return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));	
		
	}
}
