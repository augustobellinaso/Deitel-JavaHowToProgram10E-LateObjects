/*Calculate the value of π from the infinite series
π = 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + ...
Print a table that shows the value of π approximated by computing the first 200,000 terms of this
series. How many terms do you have to use before you first get a value that begins with 3.14159?*/
/*
 * Augusto Loose Bellinaso
 */
public class ValueOfPi {
	
	public static void main(String[] args) {
		
		//declaring variables
		double pi = 0;  //to store the value of Pi. Since it's a Sum we initialize it with 0
		int terms = 200000; //the amount of terms of pi
		int x = 1; //to find the amount of terms when pi = 3.14159
		double value = 0; //to store the number of terms needed to find pi = 3.14159
		
		//displaying header
		System.out.printf("Terms \t Pi Value");
		
		
		//initializing loops
		for (double i = 1; i <= terms; i++) {
			
			//first term
			if (i == 1) {
				pi += 4;
				//System.out.printf("%n%,.0f \t %f", i, pi);
				continue;				
			}
			
			//even terms that have the minus signal
			if (i % 2 == 0) {
				pi -= (4 / ((2 * i) - 1));
				System.out.printf("%n%,.0f \t %f", i, pi);
				
			}
			
			//odd terms that have the plus signal
			if (i % 2 != 0) {
				pi += (4 / ((2 * i) - 1));
				System.out.printf("%n%,.0f \t %f", i, pi);
				
			}
			
			//finding the amount of terms needed for pi to begin with 3.14159
			if ( Math.abs(pi - 3.14159 ) <= 0.000005) 
            {
                while (x > 0)
                {
                    value = i;
                    x--;
                }
            }	
												
		} //end for
		
		System.out.println();
		System.out.printf("The first term where the value begins with 3.14159 is %,.0f%n", value);
	}

}
