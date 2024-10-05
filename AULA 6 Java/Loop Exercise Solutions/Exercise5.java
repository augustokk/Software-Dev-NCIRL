import javax.swing.JOptionPane;
public class Exercise5{
	public static void main(String[] args){
		//Take in 3 numbers from a user and use them to set all 3 parts of the loop and print
		//(Eg 1,10,2 would print from 1-10 in increments of 2)
		int start=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter starting number"));
		int end=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter ending number"));
		int inc=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter increment"));
		for(int i=start;i<=end;i=i+inc){
			System.out.println(i);
		}
	}
}