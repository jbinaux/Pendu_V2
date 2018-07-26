package guessingGame;


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
     * @return
     */
    public Word enterWord() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Word generateHidden() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public boolean completed() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public void display() {
        // TODO implement here

    }

    /**
     * @param c 
     * @return
     */
    public boolean guessChar(char c) {
        // TODO implement here
        return false;
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