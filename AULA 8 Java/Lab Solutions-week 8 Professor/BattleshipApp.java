import javax.swing.JOptionPane;

public class BattleshipApp {
    public static void main(String[] args) {
        
        // each player has a 3x3 grid
        BattleshipGrid player = new BattleshipGrid();

        int playerRowCoordinate = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a row coordinate for your own battleship (0-2):"));
        int playerColCoordinate = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a col coordinate for your own battleship (0-2):"));

        // we allow the player to set where to place their ship
        player.setShip(playerRowCoordinate, playerColCoordinate);

    
        // one for the computer and another for the player
        BattleshipGrid computer = new BattleshipGrid();

        int computerRowCoordinate = (int) (Math.random() * 2); //Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a row coordinate for your own battleship (0-2):"));
        int computerColCoordinate = (int) (Math.random() * 2); //Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a col coordinate for your own battleship (0-2):"));

        computer.setShip(computerRowCoordinate, computerColCoordinate);
        
        // we should keep track of whether we're still alive or not within this grid
        while(player.getIsAlive() && computer.getIsAlive()){

            // they should then be able to make guesses on where their opponents ship is
            // allow the player to guess where the computers ship is
            playerRowCoordinate = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a row coordinate to attack the computer (0-2):"));
            playerColCoordinate = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a col coordinate to attack the computer (0-2):"));

            // this will be the player attacking the computer
            computer.setGuess(playerRowCoordinate, playerColCoordinate);

            if(computer.getIsAlive()){
                 // allow the computer to guess where the players ship is
                computerRowCoordinate = (int) (Math.random() * 2); //Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a row coordinate to attack the player (0-2):"));
                computerColCoordinate = (int) (Math.random() * 2); //Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a col coordinate to attack the player (0-2):"));

                // this will be the player attacking the computer
                player.setGuess(computerRowCoordinate, computerColCoordinate);
                JOptionPane.showMessageDialog(null, "Computer attack coordinates: " + computerRowCoordinate + ", "+ computerColCoordinate);
            }

        }


        
        
        // if they make a correct guess then the game ends, and a winnner is announced
        if(computer.getIsAlive()){
            JOptionPane.showMessageDialog(null, "The computer wins haha");
        }
        else{
            JOptionPane.showMessageDialog(null, "Congratulations you have won");
        }


    }
}
