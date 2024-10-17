// Augusto Kuusberg Elias
// Student Number x24126357
// Week 9 - LAB
// Create an app that takes in a String from a user and does the following:
// Assume the String can only take letters spaces and full stops
// Counts the letters
// Counts vowels
// Stores a new String that only contains every second letter
// Stores the positions of each space
// Outputs a new String with all vowels are replaced/printed as exclamation points 

import javax.swing.JOptionPane;

public class StringManipulationApp {

    public static void main(String[] args) {
        // VARIABLES
        String userInput;
        String msgNumberOfLetters;
        String msgNumberOfVowels;
        String msgVowelsReplaced;
        String msgSecondLetter;
        String msgSpacePositions;


        // CREATE OBJECT
        StringManipulation s = new StringManipulation();

        // INPUT
        userInput = JOptionPane.showInputDialog(null, "Enter a string to be checked: \n\n (Only letters, spaces and full stop are characters allowed)");

        // SET
        s.setUserInput(userInput);

        // VALIDATE THE INPUT (String can only take letters spaces and full stops)
        if (s.checkString()) {

            // COMPUTE
            s.countLetters();
            s.countVowels();
            s.storeEverySecondLetter();
            s.storeEverySpacePosition();
            s.replaceVowel();

            // GET
            msgNumberOfLetters = s.getNumberOfLetters();
            msgNumberOfVowels = s.getNumberOfVowels();
            msgSecondLetter = s.getEverySecondLetter();
            msgSpacePositions = s.getSpacePosition();
            msgVowelsReplaced = s.getVowelReplace();


            // OUTPUT
            JOptionPane.showMessageDialog(null, 
                (" Total of letters: " + msgNumberOfLetters 
                + "\n\n Total of vowels: " + msgNumberOfVowels
                + "\n\n String that only contains every second letter: " + msgSecondLetter
                + "\n\n The positions of each space on the string: " + msgSpacePositions 
                + "\n\n String with all vowels replaced with exclamation points : " + msgVowelsReplaced
                ));
        } 
        
        else {
            // messgage if user select something outside letters, spaces and .
            JOptionPane.showMessageDialog(null, "INVALID STRING");
        }
    }
}
