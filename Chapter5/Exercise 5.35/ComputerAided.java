/*The use of computers in education is referred to as com-
puter-assisted instruction (CAI). Write a program that will help an elementary school student learn
multiplication. Use a SecureRandom object to produce two positive one-digit integers. The program
should then prompt the user with a question, such as
How much is 6 times 7?
The student then inputs the answer. Next, the program checks the student’s answer. If it’s correct,
display the message "Very good!" and ask another multiplication question. If the answer is wrong,
display the message "No. Please try again." and let the student try the same question repeatedly
until the student finally gets it right. A separate method should be used to generate each new ques-
tion. This method should be called once when the application begins execution and each time the
user answers the question correctly.*/

/*
 * Augusto Loose Bellinaso
 */

import java.util.Scanner;
import java.security.SecureRandom;

public class ComputerAided {
	
	private static final SecureRandom randomNumber = new SecureRandom();
	private static final int MAXIMUM_NUMBER = 10; //to change the maximum number you will use in the questions
	
	//main method
	public static void main(String[] args) {
		//variables
		Scanner input = new Scanner(System.in);
		int answer; //store the answer input by user
		boolean nextQuestion = false; //to control if going to the next question or not
		
		do {
			//randomly choosen the numbers to be displayed
			int number1 = 1 + randomNumber.nextInt(MAXIMUM_NUMBER);
			int number2 = 1 + randomNumber.nextInt(MAXIMUM_NUMBER);
			//calling method to display question
			questions(number1, number2);
			//store user's answer
			answer = input.nextInt();
			
			while (answer != number1 * number2) {
				System.out.println("No. Please try again!");
				questions(number1, number2);
				answer = input.nextInt();
			}
			
			//if answer is correct:
			System.out.println("Very Good!");
			
			
		} while(!nextQuestion);
		
	}//end main
	
	//method to display the questions
	public static void questions(int number1, int number2) {
		System.out.printf("How much is %d times %d? ", number1, number2);
	}

}
