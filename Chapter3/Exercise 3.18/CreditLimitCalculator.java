/*Develop a Java application that determines whether any of several
department-store customers has exceeded the credit limit on a charge account. For each customer,
the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit.
The program should input all these facts as integers, calculate the new balance (= beginning balance
+ charges – credits), display the new balance and determine whether the new balance exceeds the
customer’s credit limit. For those customers whose credit limit is exceeded, the program should dis-
play the message "Credit limit exceeded" .*/

/*
Augusto Loose Bellinaso
 */

//importing Scanner class
import java.util.Scanner;

public class CreditLimitCalculator {
	
	public static void main(String[] args) {
		
		//creating Scanner object and variables
		Scanner input = new Scanner(System.in);
		int account; //account number
		int beginningBalance; //balance at the beginning of the month
		int charges; //total of all itens charged by the customer this month
		int credits; //credits applied to the customer's account this month
		int creditLimit; //allowed limit of credit
		int newBalance; // newBalance = beginningBalance + charges - credits
		
		//requesting user input
		System.out.print("Enter the account number or -1 to quit: ");
		account = input.nextInt();
		
		//loop to request the other informations from each customer
		while(account != -1) {
			//requesting information
			System.out.print("Enter the balance at the beginning of the month: ");
			beginningBalance = input.nextInt();
			System.out.print("Enter all charges: ");
			charges = input.nextInt();
			System.out.print("Enter all credits: ");
			credits = input.nextInt();
			System.out.print("Enter the credit limit: ");
			creditLimit = input.nextInt();
			
			//calculating the new balance
			newBalance = beginningBalance + charges - credits;
			
			//displaying customer's information
			if(newBalance > creditLimit) {
				System.out.println("Credit limit exceeded!\n");
			} else {
				System.out.println("You are within the credit limit!\n");
			}
			
			System.out.print("Enter the account number or -1 to quit: ");
			account = input.nextInt();
			
		}
		
		
		
		
		
	}

}
