/*Combine the statements that you wrote in Exercise 3.5 into a Java application that calcu-
lates and prints the sum of the integers from 1 to 10. Use a while statement to loop through the
calculation and increment statements. The loop should terminate when the value of x becomes 11.*/

/*
Augusto Loose Bellinaso
 */

public class Calculate {
	
	public static void main(String[] args) {
					
		//inicializando as variáveis
		int sum = 0;
		int x = 1; //# of numbers to sum
		
		while (x <= 10) {
			//sum = sum + x;
			sum += x;
			x++;			
		}
		
		System.out.printf("The sum is %d.%n", sum);
		
	}

}
