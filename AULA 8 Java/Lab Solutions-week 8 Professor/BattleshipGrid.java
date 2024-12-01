public class BattleshipGrid {
    int [][] grid; // zero means there is no ship, and 1 means there is a ship here
    boolean isAlive; 

    BattleshipGrid(){
        isAlive = true;
        grid = new int[3][3];
    }
    // TODO: we could expand this game to a larger grid using the constructor
    
    // they can place their ship somewhere on this grid
    public void setShip(int rowCoordinate, int colCoordinate){
        grid[rowCoordinate][colCoordinate] = 1; 
    }

    public void setGuess(int rowCoordinate, int colCoordinate){
        
        // this means we found our ship we targeted
        // so we set out alive state to false
        if(grid[rowCoordinate][colCoordinate] == 1){
            isAlive = false; 
        }
    }

    public boolean getIsAlive(){
        return isAlive;
    }
}
