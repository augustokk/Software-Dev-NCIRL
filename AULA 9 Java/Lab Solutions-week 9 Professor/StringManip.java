public class StringManip {
    // local vars
    private String text;
    private int letterCount; 
    private int vowelCount;
    private String secondLetter; 
    private String spacePositions; 
    private String exclamationVowel;

    // CONSTRUCTOR
    StringManip(String text){
        this.text = text;
    }


    /**
     * This should iterate through each index in the string 'text'
     * Then we should count each instance of a letter (a-z or A-Z)
     * We will store the count in the variable letterCount
     * (assume text only contains letters, spaces, and fullstops)
     * basically increase the lettercount for anything that is not a space or a fullstop
     */
    public void countLetters(){
        letterCount = 0;

        // textIndex is a variable we will use to step through each position inside of the string
        // charAt will be a method we use to find what character is found at each position.
        for(int textIndex = 0; textIndex < text.length(); textIndex++){
            //if(text.charAt(textIndex) != '.' && text.charAt(textIndex) != ' '){
            if((text.charAt(textIndex) >= 97 && text.charAt(textIndex) <= 122) || (text.charAt(textIndex) >= 65 && text.charAt(textIndex) <= 90)){
                // then it must be a letter based on the assumption above
                letterCount++;
            }
        }
    }

    /**
     * This should iterate through each index in the string 'text'
     * Then we should count each instance of a vowel (a,e,i,o,u -don't forget uppercase)
     * We will store the count in the variable vowelCount
     * basically increase the vowelcount for any instances of a,e,i,o,u
     */
    public void countVowels(){
        vowelCount = 0;
        String lText = text.toLowerCase();

        // textIndex is a variable we will use to step through each position inside of the string
        // charAt will be a method we use to find what character is found at each position.
        for(int textIndex = 0; textIndex < text.length(); textIndex++){
            
            if(lText.charAt(textIndex)=='a' || lText.charAt(textIndex)=='e' || lText.charAt(textIndex)=='i' || lText.charAt(textIndex)=='o' || lText.charAt(textIndex)=='u'){
                // we only look for a, e, i, o, and u and we don't test the uppercase because we already set every letter to lowercase
                vowelCount++;
            }
        }
    }


    /**
     * We will create a new string that will store
     * every second letter from 'text'
     * We can do this by iterating though text and only adding a letter
     * when we notice that the indexing is odd
     */
    public void computeNewSecondLetter(){

        // create a string buffer to add each letter one at a time
        StringBuffer strBuff = new StringBuffer();

        // alternatively we could write a loop starting from one and increasing by two each time
        // this means the loop would execute/end faster
        int letterIndex = 0;
        
        for(int textIndex = 0 ; textIndex < text.length(); textIndex++){
            
            
            if((text.charAt(textIndex) >= 97 && text.charAt(textIndex) <= 122) || (text.charAt(textIndex) >= 65 && text.charAt(textIndex) <= 90)){
                if(letterIndex % 2 != 0){
                    strBuff.append(text.charAt(textIndex));
                }
                letterIndex++;
            }
            
        }

        secondLetter = strBuff.toString();

    }

    /**
     * I will iterate through each index in the string
     * each time I find a space, I will add the index of this space
     * to a list (this list will be saved to a string called space positions)
     */
    public void computeSpacePositions(){
        StringBuffer strBuff = new StringBuffer("[");

        for(int textIndex = 0 ; textIndex < text.length(); textIndex++){
        
            // checking if the current index is a space
            if(text.charAt(textIndex) == ' '){
                // if so then add it to the buffer
                strBuff.append(textIndex + ",");
            }
        }

        // trying to remove the last comma and replace is with a closing bracket
        strBuff.deleteCharAt(strBuff.length()-1);
        strBuff.append("]");

        spacePositions = strBuff.toString();
    }


    /**
     * we will iterate through each index in text
     * when we find a vowel, we will replace it with an
     * exclamation mark
     */
    public void computeExclamation(){
        String lText = text.toLowerCase();
        StringBuffer strBuff = new StringBuffer();

        // textIndex is a variable we will use to step through each position inside of the string
        // charAt will be a method we use to find what character is found at each position.
        for(int textIndex = 0; textIndex < text.length(); textIndex++){
            
            // if it is a vowel we add a !
            if(lText.charAt(textIndex)=='a' || lText.charAt(textIndex)=='e' || lText.charAt(textIndex)=='i' || lText.charAt(textIndex)=='o' || lText.charAt(textIndex)=='u'){
                // we only look for a, e, i, o, and u and we don't test the uppercase because we already set every letter to lowercase
                strBuff.append("!");
            } 
            // otherwise we add the current letter
            else{
                strBuff.append(text.charAt(textIndex));
            }
        }

        exclamationVowel = strBuff.toString();
    }

    // getter
    public int getLetterCount(){
        return letterCount;
    }

    public int getVowelCount(){
        return vowelCount;
    }

    public String getSecondLetter(){
        return secondLetter;
    }

    public String getSpacePositions(){
        return spacePositions;
    }

    public String getExclamationVowel(){
        return exclamationVowel;
    }

}
