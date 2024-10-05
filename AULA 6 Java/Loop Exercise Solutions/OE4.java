import javax.swing.JOptionPane;
public class OE4{
	public static void main(String[] args){
		//Write a loop that takes in 2 numbers from a user and raises the first number to the power of the second
		int num1=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter number "));
		int power=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter number "));
		int ans=1;
		for(int i=1;i<=power;i++){
			ans=ans*num1;
			//System.out.println("Current:"+ans);
		}
		//after loop ends print the sum
		System.out.println(num1+" to the power of "+power+" is: "+ans);
	}
}