import javax.swing.JOptionPane;
public class OE3{
	public static void main(String[] args){
		//Write a loop that takes in 5 numbers from a user and outputs the sum of all inputted numbers
		int sum=0;
		for(int i=0;i<=4;i++){
			sum=sum+Integer.parseInt(JOptionPane.showInputDialog(null,"Enter number "+(i+1)));
		}
		//after loop ends print the sum
		System.out.println("Sum of all 5 nums: "+sum);
	}
}