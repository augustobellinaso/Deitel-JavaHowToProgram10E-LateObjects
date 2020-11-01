/*The process of finding the largest value is used frequently in com-
puter applications. For example, a program that determines the winner of a sales contest would input
the number of units sold by each salesperson. The salesperson who sells the most units wins the con-
test. Write a pseudocode program, then a Java application that inputs a series of 10 integers and deter-
mines and prints the largest integer. Your program should use at least the following three variables:
a) counter : A counter to count to 10 (i.e., to keep track of how many numbers have been
input and to determine when all 10 numbers have been processed).
b) number : The integer most recently input by the user.
c) largest : The largest number found so far.*/


/*
Augusto Loose Bellinaso
 */
//importing Scanner class
import java.util.Scanner;

public class LargestNumber {
	
	public static void main(String[] args) {
		//initializing variables
		Scanner input = new Scanner(System.in);
		int counter = 1; //to count to amount of numbers informed by the user
		int number; //number entered by the user
		int largest; //to store the largest
		
		//entering the first number
		System.out.print("Enter an integer: ");
		number = input.nextInt();
		largest = number;
		
		//creating a loop
		while(counter < 10) {
			System.out.print("Enter an integer: ");
			number = input.nextInt();
			
			if(number > largest) {
				largest = number;
			}		
				
			counter++;
		}
		
		System.out.printf("The largest number is: %d. ", largest);
		
	}

}
