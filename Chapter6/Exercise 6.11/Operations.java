/*Write statements that perform the following one-dimensional-array operations:
a) Set the 10 elements of integer array counts to zero.
b) Add one to each of the 15 elements of integer array bonus .
c) Display the five values of integer array bestScores in column format.*/

/*
 * Augusto Loose Bellinaso
 */
import java.util.Arrays;

public class Operations {
	
	public static void main(String[] args) {
		
		//a) Set the 10 elements of integer array counts to zero.
		int[] counts = new int[10];
		Arrays.fill(counts, 0);
		displayArray(counts);
		System.out.println();
		
		//b) Add one to each of the 15 elements of integer array bonus .
		int[] bonus = new int[15];
		for (int counter = 0; counter < bonus.length; counter++) {
			bonus[counter]++;
		}
		displayArray(bonus);
		System.out.println();
		
		//c) Display the five values of integer array bestScores in column format.
		int[] bestScores = {5, 10, 15, 20, 25};
		for (int value : bestScores) {
			System.out.printf(" %d%n", value);
		}
		
	}//end main
	
	//method to display arrays
	public static void displayArray(int[] array) {
		for (int value : array) {
			System.out.printf("%d ", value);
		}
	}

}
