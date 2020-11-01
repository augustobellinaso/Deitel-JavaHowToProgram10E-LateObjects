/* Write an application that keeps displaying in the com-
mand window the multiples of the integer 2—namely, 2, 4, 8, 16, 32, 64, and so on. Your loop should
not terminate (i.e., it should create an infinite loop). What happens when you run this program?*/
/*
Augusto Loose Bellinaso
 */
public class MultiplesOfTwo {
	
	public static void main(String[] args) {
		
		boolean condition = true;
		int power = 1;
		
		while (condition) {
			System.out.println(2 * power);
			power ++;
			
			
		}
	}

}
