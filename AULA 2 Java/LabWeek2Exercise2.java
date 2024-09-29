//Create an application that takes in a user's monthly wage and weekly hours and calculates how much they make per year and per hour
import javax.swing.JOptionPane;
public class LabWeek2Exercise2{
	public static void main(String[] args){
		// ask the monthly wage for the user
		double monthlyWage = Double.parseDouble(JOptionPane.showInputDialog(null,"Please provide your monthly wage: "));

		// ask how may weekly hours the user works
		double weeklyHours=Double.parseDouble(JOptionPane.showInputDialog(null,"Please provide how many hours per week do you work"));

		// do the maths to see how much user make per year
		double yearSalary = monthlyWage * 12;

        // do the maths to see how much user make per week
        double weeklySalary = yearSalary / 52;

        // do the maths to see how much user make per hour
        double hourSalary = weeklySalary / weeklyHours;


		//print the value that user receives per year
		System.out.println("The user receives per year " + yearSalary);
        JOptionPane.showMessageDialog(null, ("The user receives per year " + yearSalary));

		//print the value that user receives per hour
        System.out.println("The user receives per hour " + hourSalary);
		JOptionPane.showMessageDialog(null, ("The user receives per hour " + hourSalary));
	}
}