/*Modify the program in Fig. 3.10 to validate its inputs. For any in-
put, if the value entered is other than 1 or 2, keep looping until the user enters a correct value.*/
// Analysis of examination results using nested control statements.
/*
Augusto Loose Bellinaso
 */
//importing Scanner
import java.util.Scanner;

public class ValidatingInput {
	
	public static void main(String[] args) {
		//creating Scanner object
		Scanner input = new Scanner(System.in);
		
		//initializing variables
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;
		
		//processing 10 students using counter-controlled loop
		while(studentCounter <= 10) {
			
			//asking the user to inform if the student passed or failed
			System.out.print("Enter result (1 = passed, 2 = failed): ");
			int result = input.nextInt();
			
			//validating the input to count only if typed 1 or 2
			while(result != 1 && result != 2) {
				System.out.print("Enter result (1 = passed, 2 = failed): ");
				result = input.nextInt();
			}
			
			if(result == 1) {
				passes += 1;
			} else if (result == 2) {
				failures += 1;
			}
			
			studentCounter++;
		}
		
		System.out.printf("Passed: %d.%nFailed: %d.%n", passes, failures);
		
		if (passes > 8) {
			System.out.println("Bonus for the instructor!");
		}
	}

}
