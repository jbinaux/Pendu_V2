package guessingGame;


/**
 * 
 */
public class UsedLetters {

    /**
     * Default constructor
     */
    public UsedLetters() {
    }

    /**
     * 
     */
    private char[] letters = new char[0];

    /**
     * @param char 
     * @return boolean
     */
    public boolean isUsed(char c) {

    	for(int i = 0; i < letters.length; i++)
    	{
    		if(letters[i] == c)
    		{
    			return true;
    		}
    	}
        return false;
    }

    /**
     * @param char 
     * @return
     */
    public void addLetter(char c) {

    	char[] tmp = new char[letters.length];
    	for(int i = 0; i < letters.length; i++)
    	{
    		tmp[i] = letters[i];
    	}
    	letters = new char[letters.length + 1];
    	for(int i = 0; i < tmp.length; i++)
    	{
    		letters[i] = tmp[i];
    	}
    	letters[letters.length - 1] = c;
    }

    /**
     * @return
     */
    public void display() {

    	System.out.print("Used letters : \u001b[31m");
    	for(int i = 0; i < letters.length; i++)
    	{
    		System.out.print(letters[i] + " ");
    	}
    	System.out.print("\u001b[0m\n");
    }

	public char[] getLetters() {
		return letters;
	}

	public void setLetters(char[] letters) {
		this.letters = letters;
	}

}