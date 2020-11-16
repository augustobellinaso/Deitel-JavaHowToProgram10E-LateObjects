/*
 * Modify the program of
Exercise 5.38 to allow the user to pick a type of arithmetic problem to study. An option of 1 means
addition problems only, 2 means subtraction problems only, 3 means multiplication problems only,
4 means division problems only and 5 means a random mixture of all these types.
 */

/*
 * Augusto Loose Bellinaso
 */

import java.util.Scanner;
import java.security.SecureRandom;

public class CAI5Final {
	public static SecureRandom randomNumber = new SecureRandom();
	//main method
	public static void main(String[] args) {
		//variables
		Scanner input = new Scanner(System.in);
		int difficulty; //choosing the difficulty of the problems
		int type; //the type of arithmetic problems that will appear: addition, subtraction, ...
		int choice = 1; //to control the repetition process
		int userAnswer; //to store the users answer
		int correctAnswer; //the correct answer, i.e. the answer to the problem
		
		//displaying headers
		System.out.print("Difficulty levels:\n"
				+ "1 - Single-digit numbers; \n"
				+ "2 - Double-digit numbers; \n"
				+ "3 - Triple-digit numbers.");
		System.out.print("\nArithmethic type:\n"
				+ "1 - Addition; \n"
				+ "2 - Subtraction; \n"
				+ "3 - Multiplication; \n"
				+ "4 - Division; \n"
				+ "5 - Mixture.\n");
		
		do {
			//requesting user input
			System.out.print("Choose difficulty: ");
			difficulty = input.nextInt();
			System.out.print("Choose type: ");
			type = input.nextInt();
			
			//variables in the loop
			int correctCount = 0; //the number of correct answers
			int answers = 0; //to count the number of questions answered/ or tries
			int mixture = 0; //when the type 5 mixture is chosen
			
			while (answers <= 10) {//loop of the program
				if (type == 5) {
					mixture = 1 + randomNumber.nextInt(4);
					correctAnswer = questions(difficulty, mixture);
				} else {
					correctAnswer = questions(difficulty, type);
				}
				
				
				userAnswer = input.nextInt();
				answers++;
				
				//if incorrect
				while(userAnswer != correctAnswer) {
					motivationalIncorrect();
					userAnswer = input.nextInt();
					answers++;
					
					if (answers == 10) {
						break;
					}
				}//end incorrect while
				
				if (userAnswer == correctAnswer) {
					motivationalCorrect();
					correctCount++;
				}//end correct if
				
				if (answers == 10) {
					break;
				}
				
			}//end while
			
			if (correctCount <= 7) {
				System.out.print("Please ask your teacher for extra help. \n");
			} else {
				System.out.print(" Congratulations, you are ready to go to the next level!\n");
			}
			
			System.out.println();
			System.out.print("Enter 1 for next question or 2 to exit: ");
			choice = input.nextInt();
			
		} while (choice != 2);
	}//end main
	
	
	public static int questions(int difficulty, int type) {
		int number1 = 0;
		int number2 = 0;
		
		switch(difficulty) {
			case 1:
				number1 = 1 + randomNumber.nextInt(10);
				number2 = 1 + randomNumber.nextInt(10);
				break;
			case 2:
				number1 = 1 + randomNumber.nextInt(100);
				number2 = 1 + randomNumber.nextInt(100);
				break;
			case 3:
				number1 = 1 + randomNumber.nextInt(1000);
				number2 = 1 + randomNumber.nextInt(1000);
				break;
		}
		//making the questions based on type
		switch(type) {
			case 1:
				System.out.printf("How much is %d plus %d? ", number1, number2);
				return number1 + number2;
			case 2:
				System.out.printf("How much is %d minus %d? ", number1, number2);
				return number1 - number2;
			case 3:
				System.out.printf("How much is %d times %d? ", number1, number2);
				return number1 * number2;
			case 4:
				System.out.printf("How much is %d divided %d (only the integer part)? ", number1, number2);
				return number1 / number2;
		}
		
		System.out.printf("How much is %d times %d? ", number1, number2);
		return number1 * number2;
	}
	
	//motivational
	public static void motivationalCorrect() {
		int message = 1 + randomNumber.nextInt(4);
		switch(message) {
			case 1:
				System.out.println("Very Good!");
				break;
			case 2:
				System.out.println("Excelent!");
				break;
			case 3:
				System.out.println("Nice work!");
				break;
			case 4:
				System.out.println("Keep up the good work!");
				break;
		}//end switch
	}//end method
	
	//motivational for incorrect answers
	public static void motivationalIncorrect() {
		int message = 1 + randomNumber.nextInt(4);
		switch(message) {
		case 1:
			System.out.println("No. Please try again");
			break;
		case 2:
			System.out.println("Wrong. Try once more.");
			break;
		case 3:
			System.out.println("Don't give up!");
			break;
		case 4:
			System.out.println("No. Keep trying.");
			break;
		}//end switch
	}

}//end class
