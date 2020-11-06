/*Write an application that uses repetition and
switch statements to print the song “The Twelve Days of Christmas.” One switch statement should
be used to print the day (“first,” “second,” and so on). A separate switch statement should be used
to print the remainder of each verse. Visit the website en.wikipedia.org/wiki/The_Twelve_Days_
of_Christmas_(song) for the lyrics of the song.*/

/*
 * Augusto Loose Bellinaso
 */

public class TwelveDays {
	
	public static void main(String[] args) {
		
		int day = 1; //initializing the current day where the song is
		
		for (day = 1; day <= 12; day++) {
			
			
			//switch for the first part (printing the days)
			switch(day) {
				case 1:
					System.out.println("On the first day of Christmas my true love sent to me");
					break;
				case 2:
					System.out.println("On the second day of Christmas my true love sent to me");
					break;
				case 3:
					System.out.println("On the third day of Christmas my true love sent to me");
					break;
				case 4:
					System.out.println("On the fourth day of Christmas my true love sent to me");
					break;
				case 5:
					System.out.println("On the fifth day of Christmas my true love sent to me");
					break;
				case 6:
					System.out.println("On the sixth day of Christmas my true love sent to me");
					break;
				case 7:
					System.out.println("On the seventh day of Christmas my true love sent to me");
					break;
				case 8:
					System.out.println("On the eighth day of Christmas my true love sent to me");
					break;
				case 9:
					System.out.println("On the ninth day of Christmas my true love sent to me");
					break;
				case 10:
					System.out.println("On the tenth day of Christmas my true love sent to me");
					break;
				case 11:
					System.out.println("On the eleventh day of Christmas my true love sent to me");
					break;
				case 12:
					System.out.println("On the twelfth day of Christmas my true love sent to me");
					break;
			}
			
			//second switch to print the remainder of the verses
			switch(day) {
				case 12:
					System.out.println("Twelve drummers drumming");
				case 11:
					System.out.println("Eleven pipers piping");
				case 10:
					System.out.println("Ten lords a-leaping");
				case 9:
					System.out.println("Nine ladies dancing");
				case 8:
					System.out.println("Eight mais a-milking");
				case 7:
					System.out.println("Seven swans a-swimming");
				case 6:
					System.out.println("Six geese a-laying");
				case 5:
					System.out.println("Five gold rings");
				case 4:
					System.out.println("Four calling birds");
				case 3:
					System.out.println("Three french hens");
				case 2:
					System.out.println("Two turtles");					
				case 1:
					System.out.println("A partridge in a pear tree");
					
			}
			
			
		}
		
	}

}
