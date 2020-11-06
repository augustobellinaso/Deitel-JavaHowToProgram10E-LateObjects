/*The controversial issue of global warming has been widely
publicized by the film “An Inconvenient Truth,” featuring former Vice President Al Gore. Mr. Gore
and a U.N. network of scientists, the Intergovernmental Panel on Climate Change, shared the 2007
Nobel Peace Prize in recognition of “their efforts to build up and disseminate greater knowledge
about man-made climate change.” Research both sides of the global warming issue online (you
might want to search for phrases like “global warming skeptics”). Create a five-question multiple-
choice quiz on global warming, each question having four possible answers (numbered 1–4). Be ob-
jective and try to fairly represent both sides of the issue. Next, write an application that administers
the quiz, calculates the number of correct answers (zero through five) and returns a message to the
user. If the user correctly answers five questions, print “Excellent”; if four, print “Very good”; if
three or fewer, print “Time to brush up on your knowledge of global warming,” and include a list
of some of the websites where you found your facts.*/

/*
 * Augusto Loose Bellinaso
 */

//importing Scanner
import java.util.Scanner;

public class GlobalWarmingQuiz {
	
	public static void main(String[] args) {
		
		//variables
		Scanner input = new Scanner(System.in);
		int answer; //to read the answer of the user
		int correctAnswers = 0; //to store the number of correct answers
		
		
		//First Question
		System.out.print("Which of the following gases do NOT contribute to the greenhouse efect? \n"
				+ "1 - Water vapor;"
				+ "2 - Oxygen" //correct answer
				+ "3 - Methane"
				+ "4 - Carbon dioxide");
		answer = input.nextInt();
		if (answer == 2) {
			correctAnswers++;
		}
		
		
		//Second question
		
	}

}
