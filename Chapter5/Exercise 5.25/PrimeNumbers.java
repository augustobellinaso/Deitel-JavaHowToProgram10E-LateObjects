/*A positive integer is prime if it’s divisible by only 1 and itself. For example,
2, 3, 5 and 7 are prime, but 4, 6, 8 and 9 are not. The number 1, by definition, is not prime.
a) Write a method that determines whether a number is prime.
b) Use this method in an application that determines and displays all the prime numbers
less than 10,000. How many numbers up to 10,000 do you have to test to ensure that
you’ve found all the primes?
c) Initially, you might think that n/2 is the upper limit for which you must test to see
whether a number n is prime, but you need only go as high as the square root of n. Re-
write the program, and run it both ways.*/

/*
 * Augusto Loose Bellinaso
 */

public class PrimeNumbers {
	//main method
	public static void main(String[] args) {
		
		for (int i = 1; i <= 10000; i++) {
			if(isPrimeSqrt(i)) {
				System.out.printf("%d is prime!%n", i);
			}
		}
		
		
		
	}//end main
	
	
	//isPrime method
	public static boolean isPrime(int number) {
		for (int i = 2; i < number  ; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		
		return true;
	}//end method
	
	//isPrime method using number /2
	public static boolean isPrimeHalf(int number) {
		for (int i = 2; i <= number /2  ; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		
		return true;
	}//end method

	//isPrime method using sqrtNumber
	public static boolean isPrimeSqrt(int number) {
		for (int i = 2; i <= Math.sqrt(number)  ; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		
		return true;
	}//end method

}
