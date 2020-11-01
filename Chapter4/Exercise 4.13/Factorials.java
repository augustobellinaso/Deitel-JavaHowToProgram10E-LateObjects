/*Factorials are used frequently in probability problems. The factorial of a positive
integer n (written n! and pronounced “n factorial”) is equal to the product of the positive integers from
1 to n. Write an application that calculates the factorials of 1 through 20. Use type long . Display the
results in tabular format. What difficulty might prevent you from calculating the factorial of 100?*/
/*
Augusto Loose Bellinaso
*/
public class Factorials {
	
	public static void main(String[] args) {
		//variables
		long number = 1; //to calculate the factorial
		
		
		System.out.printf("Number\tFactorial%n");
		
		
		for (int i = 1; i <= 20; i++) {
			number = i;
			long factorial = 1; //to reset the factorial at each iteraction
			
			for (int j = 1; j <= number; j++) {
				factorial *= j;
			}
			
			System.out.printf("%d\t%d%n", i, factorial);
			
		}
	}

}
