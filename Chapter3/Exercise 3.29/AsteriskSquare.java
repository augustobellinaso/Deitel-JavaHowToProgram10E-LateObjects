/*Write an application that prompts the user to enter the size of the side
of a square, then displays a hollow square of that size made of asterisks. Your program should work
for squares of all side lengths between 1 and 20.*/
/*
Augusto Loose Bellinaso
 */
//importing Scanner class
import java.util.Scanner;

public class AsteriskSquare {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size; //size of the square
		int row = 0; //the position to place the asterisks
		int column = 0; //position for the asterisk
		
		
		System.out.print("Enter the size of the square (between 1 and 20): ");
		size = input.nextInt();
		
		while(size <= 1 || size > 20) {//refuse sizes that aren't between 1 and 20
			System.out.print("Enter the size of the square (between 1 and 20): ");
			size = input.nextInt();
		}
		
		while(column < size) {
			row = 0;
			
			while (row < size) {
				System.out.print("*");
				row++;
			}
			System.out.println();
			column++;
		}
		
	}

}
