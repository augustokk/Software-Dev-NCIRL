// Augusto Kuusberg Elias
// Student Number x24126357
// Week 3 Lab 
// Fix the code

//fix the code by figuring out what should be in the **** sections
//added swing
import javax.swing.JOptionPane;
//added correct name of class
public class EggBoxApp{
	public static void main(String[] args){

		//variables
		int eggs;
		int boxSize;
		int numBoxes;
		int leftOverEggs;

		//objects
		//created a object
		EggBox egg;
		egg =new EggBox();

		//inputs
		//addedd missing words
		eggs=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number of eggs"));
		boxSize=6;

		//set
		//added correct variables
		egg.setEggs(eggs);
		egg.setBoxSize(boxSize);

		//compute
		//added the name of object
		egg.computeBoxes();
		egg.computeLeftover();

		//get
		// assigned correct variables
		numBoxes=egg.getBoxes();
		leftOverEggs=egg.getLeftover();

		//output
		//addedd missing words
		JOptionPane.showMessageDialog(null,"Number of boxes needed "+numBoxes);

		JOptionPane.showMessageDialog(null,"Number of eggs left over "+leftOverEggs);
	}
}