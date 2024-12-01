/**
 * Create an app that takes in a String from a user and does the following:

Assume the String can only take letters spaces and full stops
    
    Counts the letters
    Counts vowels
    Stores a new String that only contains every second letter  
    Stores the positions of each space
    Outputs a new String with all vowels are replaced/printed as exclamation points 

Please note: Create only 1 app class, but either create multiple instantiable classes, or multiple computes to deal with each bullet point
 */


import javax.swing.JOptionPane;

public class StringManipApp{
    public static void main(String[] args) {
        
        // INPUT
        String text = JOptionPane.showInputDialog(null, "Please enter some text for us to manipulate");
        // assume text only contains letters, spaces, and fullstops
        StringManip sm = new StringManip(text);

        //PROCESS
        // Counts the letters
        sm.countLetters();
        

        // Counts vowels
        sm.countVowels();

        // Stores a new String that only contains every second letter  
        sm.computeNewSecondLetter();

        // Stores the positions of each space
        sm.computeSpacePositions();

        // Outputs a new String with all vowels are replaced/printed as exclamation points 
        sm.computeExclamation();

        // OUTPUT
        int letterCount = sm.getLetterCount();
        JOptionPane.showMessageDialog(null, "The total number of letters you have entered is: " + letterCount);

        int vowelCount = sm.getVowelCount();
        JOptionPane.showMessageDialog(null, "The total number of vowels you have entered is: " + vowelCount);

        String secondLetter = sm.getSecondLetter();
        JOptionPane.showMessageDialog(null, "This is the string using every second letter: " + secondLetter);

        String spacePositions = sm.getSpacePositions();
        JOptionPane.showMessageDialog(null, "The position of each space is: " + spacePositions);

        String exclamationVowel = sm.getExclamationVowel();
        JOptionPane.showMessageDialog(null, "The text with vowels replace with ! is as follows: " + exclamationVowel);

    }
}