/*One problem in CAI environ-
ments is student fatigue. This can be reduced by varying the computer’s responses to hold the stu-
dent’s attention. Modify the program of Exercise 5.35 so that various comments are displayed for
each answer as follows:
Possible responses to a correct answer:
Very good!
Excellent!
Nice work!
Keep up the good work!
Possible responses to an incorrect answer:
No. Please try again.
Wrong. Try once more.
Don't give up!
No. Keep trying.
Use random-number generation to choose a number from 1 to 4 that will be used to select
one of the four appropriate responses to each correct or incorrect answer. Use a switch statement to
issue the responses.*/

/*
 * Augusto Loose Bellinaso
 */
import java.util.Scanner;
import java.security.SecureRandom;

public class CAI2 {
	
	private static final SecureRandom randomNumber = new SecureRandom();
	private static final int MAXIMUM_NUMBER = 10; //to change the maximum number you will use in the questions
	
	//main method
	public static void main(String[] args) {
		//variables
		Scanner input = new Scanner(System.in);
		int answer; //store the answer input by user
		boolean nextQuestion = false; //to control if going to the next question or not
		
		do {
			int message = 1 + randomNumber.nextInt(4); //to display one of the motivational messages
			
			//randomly choosen the numbers to be displayed
			int number1 = 1 + randomNumber.nextInt(MAXIMUM_NUMBER);
			int number2 = 1 + randomNumber.nextInt(MAXIMUM_NUMBER);
			//calling method to display question
			questions(number1, number2);
			//store user's answer
			answer = input.nextInt();
			
			while (answer != number1 * number2) {
				motivationalIncorrect(message);
				questions(number1, number2);
				answer = input.nextInt();
				
				message = 1 + randomNumber.nextInt(4);
			}
			
			//if answer is correct:
			motivationalCorrect(message);
			
			
		} while(!nextQuestion);
		
	}//end main
	
	//method to display the questions
	public static void questions(int number1, int number2) {
		System.out.printf("How much is %d times %d? ", number1, number2);
	}
	
	//motivational
	public static void motivationalCorrect(int number) {
		switch(number) {
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
				System.out.println("Keep up the wrong work!");
				break;
		}//end switch
	}//end method
	
	//motivational for incorrect answers
	public static void motivationalIncorrect(int number) {
		switch(number) {
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
