 /*An integer number is said to be a perfect number if its factors, including
1 (but not the number itself), sum to the number. For example, 6 is a perfect number, because 6 =
1 + 2 + 3. Write a method isPerfect that determines whether parameter number is a perfect number.
Use this method in an application that displays all the perfect numbers between 1 and 1000. Display
the factors of each perfect number to confirm that the number is indeed perfect. Challenge the com-
puting power of your computer by testing numbers much larger than 1000. Display the results.*/

/*
 * Augusto Loose Bellinaso	
 */

public class PerfectNumbers {
	//method main
	public static void main(String[] args) {
		//displaying headers
		System.out.println("The perfect numbers between 1 and 1000 are: ");
		
		for (int i = 1; i <= 1000; i++) {
			if (isPerfect(i)) {
				System.out.printf("%d is a perfect number: ", i);
				factors(i);//displaying factors
				System.out.println();
			}
		}
	}//end main
	
	
	//creating method isPerfect
	public static boolean isPerfect(int number) {
		int factorsSum = 0; //to store the sum of the factors and compare it with the number
		//looping the find the factors of the number, i.e, if the remainder of the division is 0
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				factorsSum += i;
			}//end if			
		}//end for
		//checking if is perfect or no
		if (factorsSum == number) {
			return true;
		} else {
			return false;
		}//end if		
	}//end isPerfect()
	
	
	//secondary method to print the factors for each number
	public static void factors(int number) {
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				System.out.print(i + " ");
			}//end if
		}//end for
	}//end factors
}
