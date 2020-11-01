/*Write an application that reads three nonzero values entered by the
user and determines and prints whether they could represent the sides of a triangle.
Conditions:
a + b < c
a + c < b
b + c < c
*/
/*
Augusto Loose Bellinaso
 */
//importing Scanner class
import java.util.Scanner;


public class SidesOfTriangle {
	
	public static void main(String[] args) {
		
		//initializing variables
		Scanner input = new Scanner(System.in);
		int side1;
		int side2;
		int side3;
		
		
		//requesting user input
		System.out.print("Enter the first side of the triangle: ");
		side1 = input.nextInt();
		System.out.print("Enter the second side of the triangle: ");
		side2 = input.nextInt();
		System.out.print("Enter the third side of the triangle: ");
		side3 = input.nextInt();
		
		//testing for the conditions to exist the triangle with the sides input by users
		
		if (side1 + side2 < side3) {
			System.out.println("Cannot form a triangle with these numbers");
		} else if (side1 + side2 < side2) {
			System.out.println("Cannot form a triangle with these numbers");
		} else if (side2 + side3 < side1) {
			System.out.println("Cannot form a triangle with these numbers");
		} else {
			System.out.println("Can form a triangle with these numbers");
		}
	}

}
