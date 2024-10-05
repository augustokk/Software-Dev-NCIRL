import javax.swing.JOptionPane;
public class Exercise4{
	public static void main(String[] args){
		//Take in 2 numbers from a user and print all numbers between these 2
		int start=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter starting number"));
		int end=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter ending number"));
		for(int i=start;i<=end;i++){
			System.out.println(i);
		}
	}
}