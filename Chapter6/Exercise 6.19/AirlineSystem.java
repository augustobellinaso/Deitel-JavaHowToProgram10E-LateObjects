/*A small airline has just purchased a computer for its new au-
tomated reservations system. You’ve been asked to develop the new system. You’re to write an ap-
plication to assign seats on each flight of the airline’s only plane (capacity: 10 seats).
Your application should display the following alternatives: Please type 1 for First Class and
Please type 2 for Economy . If the user types 1 , your application should assign a seat in the first-
class section (seats 1–5). If the user types 2 , your application should assign a seat in the economy
section (seats 6–10). Your application should then display a boarding pass indicating the person’s
seat number and whether it’s in the first-class or economy section of the plane.
Use a one-dimensional array of primitive type boolean to represent the seating chart of the
plane. Initialize all the elements of the array to false to indicate that all the seats are empty. As
each seat is assigned, set the corresponding element of the array to true to indicate that the seat is
no longer available.
Your application should never assign a seat that has already been assigned. When the economy
section is full, your application should ask the person if it’s acceptable to be placed in the first-class
section (and vice versa). If yes, make the appropriate seat assignment. If no, display the message
"Next flight leaves in 3 hours."*/
/*
 * Augusto Loose Bellinaso
 */
import java.util.Scanner;


public class AirlineSystem {
	
	public static boolean[] seats = new boolean[11]; //creating array for the 10 seats. empty boolean array starts to false
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//variables

		int userChoice; //store user seat choice
		int count = 1; //to count over the 10 seats

		
		//displaying header and asking for user input
		while(count == 1) {
			System.out.println("Choose you seat class: ");
			System.out.print("1 for First Class\n"
					+ "2 for Economy Class\n");
			System.out.print("Enter you option: ");
			userChoice = input.nextInt();
			
			if (userChoice == 1) {
				firstClass();
			} else {
				economyClass();
			}//end if

			
			System.out.print("Enter 1 to buy again or 2 to exit: ");
			count = input.nextInt();
			
		}	
	}//end main
	
	
	//creating method to book first class seat 1-5
	public static void firstClass() {
		
		for (int i = 1; i <= 5; i++) {
			if(seats[i] == false) {
				seats[i] = true;
				System.out.printf("First class seat booked. Your seat number: %d%n", i);
				break;			
			} else if (seats[5] == true) { //first class booked
				//checking if entire plane is booked
				if (seats[10] == true) {
					System.out.println("Plane booked. Next flight leaves in 3 hours.");
					break;
				} else {
					System.out.print("First class is booked. If you would like to book at economy class, enter 1: ");
					int choice = input.nextInt();
					
					if (choice == 1) {
						economyClass();
						break;
					} else {
						System.out.println("Plane booked. Next flight leaves in 3 hours.\n");
						break;
					}
				}
			}
		}
		
	}//end first class method
	
	
	//creating economyclass method
	public static void economyClass() {
		
		for (int i = 6; i <= 10; i++) {
			if (seats[i] == false) {
				seats[i] = true;
				System.out.printf("Economy class seat booked. Your seat number: %d%n", i);
				break;
			} else if (seats[10] == true) { //if plane is booked
				if (seats[5] == true) {
					System.out.println("Plane booked. Next flight leaves in 3 hours.");
					break;
				} else {
					System.out.print("Economy class is booked. If you would like to book at first class, enter 1: ");
					int choice = input.nextInt();
					if (choice == 1) {
						firstClass();
						break;
					} else {
						System.out.println("Plane booked. Next flight leaves in 3 hours.\n");
						break;
					}
				}
				
				
			}
		}
	}//end economyclass

}


