/*Write an application that reads three nonzero integers and de-
termines and prints whether they could represent the sides of a right triangle.*/
/*
Augusto Loose Bellinaso
 */
//importing Scanner
import java.util.Scanner;

public class RightTriangle {
	
	public static void main(String[] args) {
		
		//initializing variables
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		int c;
		
		//requesting user input
		System.out.print("Enter the first side: ");
		a = input.nextInt();
		System.out.print("Enter the second side: ");
		b = input.nextInt();
		System.out.print("Enter the third side: ");
		c = input.nextInt();
		
		//checking the input using Pitagoras
		if (a * a + b * b == c * c) {
			System.out.println("These number can make a right triangle!");
		} else if (a * a + c * c == b * b) {
			System.out.println("These number can make a right triangle!");
		} else if (b * b + c * c == a * a) {
			System.out.println("These number can make a right triangle!");
		} else {
			System.out.println("These number cannot make a right triangle!");
		}
	}

}
