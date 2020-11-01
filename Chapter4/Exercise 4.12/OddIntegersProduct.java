//Write an application that calculates the product
//of the odd integers from 1 to 15
/*
Augusto Loose Bellinaso
*/
public class OddIntegersProduct {
	
	public static void main(String[] args) {
		
		//initialize variables
		int product = 1; //since it is a product you need to initialize as 1
		
		for (int i = 1; i <= 15; i += 2) {
			product *= i;
		}
		
		System.out.printf("%nThe product of the odd integers from 1 to 15 is: %d", product);
	}

}
