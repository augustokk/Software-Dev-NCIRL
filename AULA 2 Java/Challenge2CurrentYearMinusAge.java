import javax.swing.JOptionPane;
public class Challenge2CurrentYearMinusAge{
	public static void main(String[] args){
		// ask the current year for the user
		int currentYear=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the current year"));

		// ask the current age of the user
		int userAge=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your age"));

		// do the maths to see when user was born
		int birthYear= currentYear - userAge;


		//print the year that user was born
		System.out.println("The user was born at " + birthYear);
		//print the year that user was bornas a dialog box:
		JOptionPane.showMessageDialog(null, ("The user was born at " + birthYear));
	}
}