/*Develop a Java application that determines the gross pay for each of three
employees. The company pays straight time for the first 40 hours worked by each employee and time
and a half for all hours worked in excess of 40. You’re given a list of the employees, their number of
hours worked last week and their hourly rates. Your program should input this information for each
employee, then determine and display the employee’s gross pay. Use class Scanner to input the data.*/

/*
Augusto Loose Bellinaso
 */
//importing Scanner class
import java.util.Scanner;

public class SalaryCalculator {
	public static void main(String[] args) {
		//initializing variables
		Scanner input = new Scanner(System.in);
		int hoursWorked;
		int employeeNumber = 1;
		double hourlyRate;
		double grossPay;
		
		while(employeeNumber <= 3) {
			System.out.printf("%nEnter the number of hours worked this week for employee %d: ", employeeNumber);
			hoursWorked = input.nextInt();
			System.out.printf("Enter the hourly rate for employee %d: ", employeeNumber);
			hourlyRate = input.nextDouble();
			
			//calculating the gross pay
			if(hoursWorked <= 40) {
				grossPay = hoursWorked * hourlyRate;
				System.out.printf("The gross pay for employee %d is: %.2f%n", employeeNumber, grossPay);
			} else {
				grossPay = (double) 40 * hourlyRate + (hoursWorked - 40) * (hourlyRate * 1.5);
				System.out.printf("The gross pay for employee %d is: %.2f%n", employeeNumber, grossPay);
			}
			
			
			
			employeeNumber += 1;
		}
		
		
	}

}
