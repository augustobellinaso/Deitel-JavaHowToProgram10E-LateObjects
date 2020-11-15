/*Write an application that displays a
table of the binary, octal and hexadecimal equivalents of the decimal numbers in the range 1
through 256. If you aren’t familiar with these number systems, read online Appendix J first.*/

/*
 * Augusto Loose Bellinaso
 */
public class ConverterTable {
	//main method
	public static void main(String[] args) {
		
		//variables
		int decimal;
		int binary;
		int remainder = 0;
		int position; //the position of the number
		
		//displaying header
		System.out.println("Decimal \t\t\t Binary \t\t\t Octal \t\t\t Hexadecimal");
		
		for (int i = 1; i <= 256; i++) {
			
			//decimal to binary
			decimal = i;
			binary = 0;
			position = 1;			
			while (decimal > 0) {
				remainder = decimal % 2;
				decimal /= 2;
				binary += (position * remainder);
				position *= 10;				
			}//end while		
			
			System.out.printf("%-20d\t\t%-20d\t\t", i, binary);
			
			//decimal to octal
			decimal = i;
			position = 1;			
			int octal = 0;
			while (decimal > 0) {
				remainder = decimal % 8;
				decimal /= 8;
				octal += (position * remainder);
				position *= 10;				
			}//end while
			
			System.out.printf("%-20d\t\t", octal);
			
			//decimal to hexadecimal
			decimal = i;
			position = 1;			
			String hex = ""; //to the number part
			String letter = ""; //to the letters
			while (decimal > 0) {
				remainder = decimal % 16;
				decimal /= 16;
				switch(remainder) {
					case 0:
						letter = "0";
						break;
					case 1:
						letter = "1";
						break;
					case 2:
						letter = "2";
						break;
					case 3:
						letter = "3";
						break;
					case 4:
						letter = "4";
						break;
					case 5:
						letter = "5";
						break;
					case 6:
						letter = "6";
						break;
					case 7:
						letter = "7";
						break;
					case 8:
						letter = "8";
						break;
					case 9:
						letter = "9";
						break;
					case 10:
						letter = "A";
						break;
					case 11:
						letter = "B";
						break;
					case 12:
						letter = "C";
						break;
					case 13:
						letter = "D";
						break;
					case 14:
						letter = "E";
						break;
					case 15:
						letter = "F";
						break;					
				}//end switch
				
				hex = letter + hex;
			}//end while
			
			System.out.printf("%-20s\t\t", hex);
			
			System.out.println();
		}//end for
		
	}

}
