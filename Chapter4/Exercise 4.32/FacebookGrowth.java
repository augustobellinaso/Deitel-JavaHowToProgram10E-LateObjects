/* According to CNNMoney.com, Facebook hit one billion us-
ers in October 2012. Using the compound-growth technique you learned in Fig. 4.6 and assuming
its user base grows at a rate of 4% per month, how many months will it take for Facebook to grow
its user base to 1.5 billion users? How many months will it take for Facebook to grow its user base
to two billion users?*/

/*
 * Augusto Loose Bellinaso
 */
public class FacebookGrowth {
	public static void main(String[] args) {
		
		//variables
		double initialUsers = 1.0; //initial users of facebook, in billions
		double users; //users at the end of each month
		double growthRate = 0.04; //growth rate of users per month. 4%
		int totalMonths = 20;
		int firstMonth = 0; //to store the month when hit 1.5 users
		int doubledMonth = 0; //to store the month when hit 2.0 users
	
		//finding the amount of months to reach 1.5 billion users
		for (users = 1; users <= 1.5;) {
			users = users * 1.04;
			firstMonth++;
		}	
		System.out.println();
		
		//finding the amount of months to reach 2 billion users
		for (users = 1; users <= 2.0;) {
			users = users * 1.04;
			doubledMonth++;
		}
		System.out.println();
		System.out.println("Facebook had 1 billion users in October 2012.");
		System.out.printf("Facebook hit 1.5 billion users after %d months%n", firstMonth);
		System.out.printf("Facebook hit 2.0 billion users after %d months%n", doubledMonth);
		
		//displaying header
//		System.out.printf("%s%20s%n", "Month", "Billion Users");
//		
//		for (int months = 1; months <= totalMonths; months++) {
//			//calculating amount of users at the end of each month
//			
//			users = initialUsers * Math.pow(1.0 + growthRate, months);
//			
//			//displaying the month number and the amount of users
//			System.out.printf("%4d %,20.2f%n", months, users);
//
//		}
//		System.out.println();

		
	}
	
	
	
}


