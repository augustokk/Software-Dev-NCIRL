/*
 Create an application that takes in a user's monthly
 wage and weekly hours and calculates how much they make
 per year and per hour
*/
//import javax.swing.JOptionPane;


import java.util.Scanner;
public class SalaryApp{
public static void main(String [] args){

		Scanner sc = new Scanner(System.in);

		Salary williamsSalary = new Salary();
		Salary JoannesSalary = new Salary(10000, 10);

		// INPUT
		// System.out.println("Enter monthly wage:");
		// int monthlyWage = sc.nextInt();

		// System.out.println("Enter weekly hours:");
		// int weeklyHours = sc.nextInt();

		//williamsSalary.setMonthlyWage(monthlyWage);
		//williamsSalary.setWeeklyHours(weeklyHours);
		//int monthlyWage = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter monthly wage"));
		//int weeklyHours = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter weekly hours"));

		// PROCESS
		williamsSalary.computeAnnualSalary();
		williamsSalary.computeHourlyRate();

		JoannesSalary.computeAnnualSalary();
		JoannesSalary.computeHourlyRate();



		// OUTPUT
		int annualSalary = williamsSalary.getAnnualSalary();
		double hourlyRate = williamsSalary.getHourlyRate();

		System.out.println("W: Annual Salary " + annualSalary);
		System.out.println("W: Hourly Rate " + hourlyRate);

		int jannualSalary = JoannesSalary.getAnnualSalary();
		double jhourlyRate = JoannesSalary.getHourlyRate();

		System.out.println("J: Annual Salary " + jannualSalary);
		System.out.println("J: Hourly Rate " + jhourlyRate);

		//JOptionPane.showMessageDialog(null, "Annual Salary " + annualSalary);
		//JOptionPane.showMessageDialog(null, "Hourly Rate " + hourlyRate);
	}
}