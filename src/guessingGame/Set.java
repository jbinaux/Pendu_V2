package guessingGame;


/**
 * 
 */
public class Set {

    /**
     * Default constructor
     */
    public Set() {
    }

    /**
     * 
     */
    private Word toGuess;

    /**
     * 
     */
    private Word Hidden;

    /**
     * 
     */
    private Player activePlayer;


    /**
     * enter a word, then display hidden word , usedChar and player name until the word is guessed or number of try is 0
     * @return
     */
    public void playSet() {
        // TODO implement here
    }


	public Word getToGuess() {
		return toGuess;
	}


	public void setToGuess(Word toGuess) {
		this.toGuess = toGuess;
	}


	public Word getHidden() {
		return Hidden;
	}


	public void setHidden(Word hidden) {
		Hidden = hidden;
	}


	public Player getActivePlayer() {
		return activePlayer;
	}


	public void setActivePlayer(Player activePlayer) {
		this.activePlayer = activePlayer;
	}

    
}