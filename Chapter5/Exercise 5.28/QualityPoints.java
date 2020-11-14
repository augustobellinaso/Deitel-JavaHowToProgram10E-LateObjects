/*Write a method qualityPoints that inputs a student’s average and returns 4 if it’s 90–100,
3 if 80–89, 2 if 70–79, 1 if 60–69 and 0 if lower than 60. Incorporate the method into an application
that reads a value from the user and displays the result.*/

/*
 * Augusto Loose Bellinaso
 */

import java.util.Scanner;

public class QualityPoints {
	//main method
	public static void main(String[] args) {
		//variables
		Scanner input = new Scanner(System.in);
		double average; //the average input by user
		int count = 1; //to store the number of students
		
		//requesting user input
		System.out.print("Enter the student's average (from 0 to 100) or -1 to quit: ");
		average = input.nextDouble();
		
		while (average != -1) {
			System.out.printf("The result for student %d is: %d.%n ", count, qualityPoints(average));
			count++;
			System.out.println();
			System.out.print("Enter the student's average (from 0 to 100) or -1 to quit: ");
			average = input.nextDouble();
		}
	}//end main
	
	//qualityPoints method
	public static int qualityPoints(double average) {
		if (average >= 90.0) {
			return 4;
		} else if(average >= 80.0 && average < 90.0) {
			return 3;
		} else if (average >= 70.0 && average < 80.0) {
			return 2;
		} else if (average >= 60 && average < 70.0) {
			return 1;
		} else {
			return 0;
		}
	}

}
