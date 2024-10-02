// Augusto Kuusberg Elias
// Student Number x24126357
// Week 3 Lab 
// Fix the code

//fix the code by figuring out what should be in the **** sections
public class EggBox{
	//vars 
	// added private int 
	private int eggs;
	private int boxSize;
	private int numBoxes;
	private int leftOverEggs;

	// ADDED CONSTRUCTOR
	public EggBox(){
		eggs=0;
		boxSize=0;
		numBoxes=0;
		leftOverEggs=0;
	}
	
	//set
	// added void
	public void setEggs(int eggs){
		this.eggs=eggs;
	}
	// added void | parameter | assigned data
	public void setBoxSize(int boxSize){
		this.boxSize=boxSize;
	}

	//compute
	public void computeBoxes(){
		numBoxes=eggs/6;
	}
	// added the logic
	public void computeLeftover(){
		leftOverEggs= eggs % boxSize;
	}
	//get
	//added datatype int | corrected the variable names
	public int getBoxes(){
		return numBoxes;
	}
	public int getLeftover(){
		return leftOverEggs;
	}
}