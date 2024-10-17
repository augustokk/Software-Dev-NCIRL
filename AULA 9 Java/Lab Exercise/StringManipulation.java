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

public class StringManipulation {

    // DECLARE VARIABLES
    private String userInput;
    private int numberOfLetters;
    private int numberOfVowels;
    private char currentChar;
    private int letterCount;
    // DECLARE OBJECTS
    private StringBuffer everySecondLetter;
    private StringBuffer spacePosition;
    private StringBuffer vowelReplace;

    // CONSTRUCTOR
    public StringManipulation() {
        userInput = " ";
        numberOfLetters = 0;
        numberOfVowels = 0;
        currentChar =' ';
        letterCount = 0;
        // CREATE OBJECTS
        everySecondLetter = new StringBuffer(); 
        spacePosition = new StringBuffer();
        vowelReplace = new StringBuffer();
    }

    // SET
    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    // PROCESS

    // That function will return a boolean expression after check all characters of the user string to confirm if there is only letters, spaces and full stops
    public boolean checkString() {
        for (int i = 0; i < userInput.length(); i = i + 1) {
            currentChar = userInput.charAt(i);
            if (!Character.isLetter(currentChar) && currentChar != ' ' && currentChar != '.') {
                System.out.println("INVALID STRING");
                return false; 
            }
        }
        return true;
    }

    // That function will check all characters of the user string and if there is any letter, it will sum it
    public void countLetters() {
        for (int i = 0; i < userInput.length(); i = i + 1) {
            currentChar = userInput.charAt(i);
            if (Character.isLetter(currentChar)) {
                numberOfLetters = numberOfLetters + 1;
            }
        }
    }

    // That function will check all characters of the user string and if there is any vowel, it will sum it
    public void countVowels() {
        for (int i = 0; i < userInput.length(); i = i + 1) {
            currentChar = Character.toLowerCase(userInput.charAt(i));
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' ||
                currentChar == 'o' || currentChar == 'u') {
                numberOfVowels = numberOfVowels + 1;
            }
        }
    }
    
    // That function will check all characters of the user string and if there is any vowel, it will replace it to exclamation mark in a StringBuffer 
    public void replaceVowel() {
        vowelReplace = new StringBuffer(userInput); 
        for (int i = 0; i < userInput.length(); i = i + 1) {
            currentChar = Character.toLowerCase(userInput.charAt(i));
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' ||
                currentChar == 'o' || currentChar == 'u') {
                vowelReplace.setCharAt(i, '!');
            }
        }
    }


    // That function will check all characters of the user string and only if it is a letter will sum it and then go to the nested conditional, with that summed number we will be able to check if this is the second letter or not using the modulus operator, then will append the letter in a StringBuffer.
    public void storeEverySecondLetter() {
        for (int i = 0; i < userInput.length(); i = i + 1) {
            currentChar = userInput.charAt(i);
            if (Character.isLetter(currentChar)) {
                letterCount = letterCount + 1;

                if (letterCount % 2 == 0) {
                    everySecondLetter.append(currentChar);
                }
            }
        }
    }

    // That function will check all characters of the user string and if if there is any blank space will append the position in a StringBuffer (added + 1 to avoid the index 0 and confusions)
    public void storeEverySpacePosition() {
        for (int i = 0; i < userInput.length(); i = i + 1) {
            currentChar = userInput.charAt(i);
            if (currentChar == ' ') {
                spacePosition.append(i+1).append(" "); 
            }
        }
    }

    // GET
    public String getNumberOfLetters() {
        return Integer.toString(numberOfLetters); 
    }

    public String getNumberOfVowels() {
        return Integer.toString(numberOfVowels);
    }

    public String getVowelReplace() {
        return vowelReplace.toString();
    }

    public String getEverySecondLetter() {
        return everySecondLetter.toString();
    }

    public String getSpacePosition() {
        return spacePosition.toString();
    }
}
