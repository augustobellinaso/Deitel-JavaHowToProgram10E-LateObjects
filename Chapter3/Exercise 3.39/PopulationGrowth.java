/*World population has grown considerably over the centuries.
Continued growth could eventually challenge the limits of breathable air, drinkable water, arable
cropland and other limited resources. There’s evidence that growth has been slowing in recent years
and that world population could peak sometime this century, then start to decline.
For this exercise, research world population growth issues online. Be sure to investigate various
viewpoints. Get estimates for the current world population and its growth rate (the percentage by
which it’s likely to increase this year). Write a program that calculates world population growth
each year for the next 75 years, using the simplifying assumption that the current growth rate will stay constant. 
Print the results in a table. The first column should display the year from year 1 to year
75. The second column should display the anticipated world population at the end of that year.
The third column should display the numerical increase in the world population that would occur
that year. Using your results, determine the year in which the population would be double what it
is today, if this year’s growth rate were to persist.*/

/*
Augusto Loose Bellinaso
 */
public class PopulationGrowth {
	public static void main(String[] args) {
		//initializing variables
		double worldPop = 7.8; //the world population in billions
		double popGrowth = 1.1; //population growth input by user
		int year = 2020;
		int doublePop; //store the year when population will double the current
		int counter = 1; //for the while loop to count the years
		
		System.out.println("Year \t Population \t\t Increase ");
		System.out.println("2020 \t 7.8 \t\t\t 0");
		
		while(worldPop < 15.6) {
			System.out.printf("%d \t %.2f \t\t\t %.2f%n", year + 1, worldPop * popGrowth, worldPop * 0.11);
			worldPop *= popGrowth;
			year++;
		}

		doublePop = year; //storing the year in which population doubled
		while(year < 2095) {
			System.out.printf("%d \t %.2f \t\t %.2f%n", year + 1, worldPop * popGrowth, worldPop * 0.11);
			worldPop *= popGrowth;
			year++;
		}
		
		System.out.printf("%nThe population will double in the year %d.%n", doublePop);
		
		
	}

}
