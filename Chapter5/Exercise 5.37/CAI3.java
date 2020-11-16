/*More sophisticated
computer-assisted instruction systems monitor the student’s performance over a period of time. The
decision to begin a new topic is often based on the student’s success with previous topics. Modify
the program of Exercise 5.36 to count the number of correct and incorrect responses typed by the student. 
After the student types 10 answers, your program should calculate the percentage that are
correct. If the percentage is lower than 75%, display " Please ask your teacher for extra help .",
then reset the program so another student can try it. If the percentage is 75% or higher, display
" Congratulations, you are ready to go to the next level! ", then reset the program so another
student can try it.

/*
 * Augusto Loose Bellinaso
 */
import java.util.Scanner;
import java.security.SecureRandom;

public class CAI3 {
	
	private static final SecureRandom randomNumber = new SecureRandom();
	private static final int MAXIMUM_NUMBER = 10; //to change the maximum number you will use in the questions
	
	//main method
	public static void main(String[] args) {
		//variables
		Scanner input = new Scanner(System.in);
		int answer; //store the answer input by user
		int count = 0; //counting the number of questions
		int correctCount = 0; //to store the number of correct questions
		int choice = 1; //to choose if continues or not
		
		do {
			
			while (count <= 10) {
				//randomly choosen the numbers to be displayed
				int number1 = 1 + randomNumber.nextInt(MAXIMUM_NUMBER);
				int number2 = 1 + randomNumber.nextInt(MAXIMUM_NUMBER);
				
				//calling method to display question
				questions(number1, number2);
				//store user's answer
				answer = input.nextInt();
				count++;
				
				//looping if incorrect answer
				while (answer != number1 * number2) {
					motivationalIncorrect();
					questions(number1, number2);
					answer = input.nextInt();
					count++;		
				
					
					if (count == 10) {
						break;
					}
				}//end while
				
				//if correct answer
				if (answer == number1 * number2) {
					motivationalCorrect();
					correctCount++;
				}
				
				if (count == 10) {
					break;
				}
			}//end while	
				
				if (correctCount <= 7) {
					System.out.print("Please ask your teacher for extra help. \n");
				} else {
					System.out.print(" Congratulations, you are ready to go to the next level!\n");
				}
				
				//asking if wanna continue
				System.out.println();
				System.out.print("Enter 1 for next question or 2 to exit: ");
				choice = input.nextInt();
				
							
			
		} while(choice != 2);
		
	}//end main
	
	//method to display the questions
	public static void questions(int number1, int number2) {
		System.out.printf("How much is %d times %d? ", number1, number2);
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
	
	

}
