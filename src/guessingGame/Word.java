package guessingGame;

import java.util.Scanner;

/**
 * 
 */
public class Word {

    /**
     * Default constructor
     */
    public Word() {
    }

    /**
     * 
     */
    private char[] letters;

    /**
     * this method is necessary to the method enterWord : 
     * it check if the entered word is composed of letters
     * @param String word
     * @return boolean
     */
    private boolean checkWord(String word)
	{
		for(int i = 0; i < word.length(); i++)
		{
			if(word.charAt(i) < 'a' || word.charAt(i) > 'z')
			{
				return false;
			}
		}
		return true;
	}
	/**
	 * scan a word then print 100 lines to hide the entered word
	 */
	public void enterWord()
	{
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		while(!checkWord(word))
		{
			System.out.println("Enter a word with lowercase letters");
			word = scan.next();
		}
		for(int i = 0; i <= 100; i++)
		{
			System.out.println("\n");
		}
		System.out.flush();
		letters = word.toCharArray();
	}

    /**
     * @return
     */
    public char[] generateHidden() {
    	
    	char[] hidden = new char[letters.length];
		for(int i = 0; i < letters.length; i++)
		{
			hidden[i] = '_';
		}
		
        return hidden;
    }

    /**
     * @return
     */
    public boolean isCompleted() {
    	for(int i = 0; i < letters.length; i++)
		{
			if(letters[i] == '_')
			{
				return false;
			}
		}
        return true;
    }

    /**
     * @return
     */
    public void display() {
        for(int i = 0; i < letters.length; i++)
        {
        	System.out.print(letters[i] + " ");
        }
        System.out.println("");
    }

    /**
     * @param c 
     * @return
     */
    public int[] guessChar(char c) {
        // TODO implement here
    }

    public void replaceChar(char c, int[] index) {
        // TODO implement here
    }
    /**
     * @param c 
     * @param Word 
     * @return
     */
    public void completeChar(char c, Word toGuess) {
        // TODO implement here
    }

	public char[] getLetters() {
		return letters;
	}

	public void setLetters(char[] letters) {
		this.letters = letters;
	}

}