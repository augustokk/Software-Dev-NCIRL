//fix the code by figuring out what should be in the **** sections
public class EggBox{
	//vars
	private int eggs;
	private int boxSize;
	private int numBoxes;
	private int leftOverEggs;
	//set
	public void setEggs(int eggs){
		this.eggs=eggs;
	}
	public void setBoxSize(int boxSize){
		this.boxSize=boxSize;
	}
	//compute
	public void computeBoxes(){
		numBoxes=eggs/boxSize;
	}

	public void computeLeftover(){
		leftOverEggs=eggs%boxSize;
	}
	//get
	public int getNumBoxes(){
		return numBoxes;
	}
	public int getLeftover(){
		return leftOverEggs;
	}
}