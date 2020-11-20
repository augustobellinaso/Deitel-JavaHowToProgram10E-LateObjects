/*Write an application that calculates the product of a series
of integers that are passed to method product using a variable-length argument list. Test your meth-
od with several calls, each with a different number of arguments.*/

/*
 * Augusto Loose Bellinaso
 */

public class VariableLength {
	
	public static int integersProduct(int... number) {
		int product = 1;
		
		for (int i : number) {
			product *= i;
		}
		
		return product;
	}
	
	public static void main(String[] args) {
		//entering variables
		int n1 = 5;
		int n2 = 6;
		int n3 = 10;
		int n4 = 4;
		int n5 = 3;
		
		
		System.out.printf("Product between 2 numbers: %d", integersProduct(n1, n2));
		System.out.printf("%nProduct between 3 numbers: %d", integersProduct(n1, n2, n3));
		System.out.printf("%nProduct between 4 numbers: %d", integersProduct(n1, n2, n3, n4));
		System.out.printf("%nProduct between 5 numbers: %d", integersProduct(n1, n2, n3, n4, n5));
		
		
	}//end main

}
