/*Write a method isEven that uses the remainder operator ( % ) to determine
whether an integer is even. The method should take an integer argument and return true if the in-
teger is even and false otherwise. Incorporate this method into an application that inputs a se-
quence of integers (one at a time) and determines whether each is even or odd.*/

/*
 * Augusto Loose Bellinaso
 */

//importing Scanner
import java.util.Scanner;


public class EvenOrOdd {
	
	public static void main(String[] args) {
		//variables
		Scanner input = new Scanner(System.in);
		int num; //to store the input number
		
		//requesting user input
		System.out.printf("Enter a sequence of integers or A to quit: ");
		
		while (!input.hasNext("A")) {//will exit the loop is enter A
			num = input.nextInt();
			
			if (isEven(num)) {
				System.out.printf("%n%d is an even number!", num);
			} else {
				System.out.printf("%n%d is an odd number!", num);
			}
					
		}//end while
		
		
	}//end main
	
	
	//creating method isEven
	public static boolean isEven(int number) {
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}//end method

}
