import javax.swing.JOptionPane;

public class RPSApp {
    public static void main(String[] args) {
        
        // input
        String[] options = {"Rock", "Paper", "Scissors"};
        //Integer[] options = {1, 3, 5, 7, 9, 11};
        //Double[] options = {3.141, 1.618};
        //Character[] options = {'a', 'b', 'c', 'd'};
        int plOption = JOptionPane.showOptionDialog(null, "Choose your weapon for this game",
                "Click a button",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]) + 1;

        RPS rpsComputer = new RPS();
        
        rpsComputer.setPlOption(plOption);

        // process
        // this resolves if we win, lose, or draw
        rpsComputer.computeGame();

        // output
        String result = rpsComputer.getResult();

        JOptionPane.showMessageDialog(null, result);


    }
}
