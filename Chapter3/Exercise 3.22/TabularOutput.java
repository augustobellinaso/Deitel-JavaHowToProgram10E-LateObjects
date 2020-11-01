/*
Augusto Loose Bellinaso
 */
//importing class Scanner
import java.util.Scanner;

public class TabularOutput {
	
	public static void main(String[] args) {
		
		//initialing variable
		Scanner input = new Scanner(System.in);
		int number;
		int counter = 1;
		
		System.out.print("Enter a number: ");
		number = input.nextInt();
		
		System.out.print("N \t 10*N \t 100*N \t 1000*N");
		while(counter <= number) {
			System.out.println();
			System.out.printf("%d \t %d \t %d \t %d", counter, counter * 10, counter * 100, counter * 1000);
			
			counter++;
						
		}
		
		
	}

}
