package guessingGame;

import java.util.Scanner;

/**
 * 
 */
public class Set {

    /**
     * Default constructor
     */
    public Set() {
    }

 
    private Word toGuess = new Word();

  
    private Word hidden = new Word();

   
    private Player activePlayer;

    private Player otherPlayer;

    private int numberOfTry = 10;
    /**
     * enter a word, then display hidden word , usedChar and player name until the word is guessed or number of try is 0
     * @return
     */
    public void playSet() {
    	String s;
    	Scanner scan = new Scanner(System.in);
        System.out.println(otherPlayer.getNickname() + ", enter a word");
        toGuess.enterWord();
        hidden.setLetters(toGuess.generateHidden());
        while(!hidden.isCompleted() && numberOfTry != 0)
        {
        	System.out.flush();
        	System.out.println(activePlayer.getNickname() + ", you have " + numberOfTry + " tries remaining");
        	hidden.display();
        	System.out.println(activePlayer.getNickname() + ", enter a character");
        	s = scan.nextLine();
        	while(s.length() == 0)
        	{
        		s = scan.nextLine();
        	}
        	while(s.length() > 1 || (s.charAt(0) < 'a' && s.charAt(0) < 'z'))
    		{
    			System.out.println("Enter one lowercase letter");
    			s = scan.nextLine();
    		}
        	if(toGuess.guessChar(s.charAt(0)))
        	{
        		hidden.replaceChar(s.charAt(0), toGuess);
        	}
        	else
        	{
        		numberOfTry--;
        	}
        	
        	
        }
    }


	public Word getToGuess() {
		return toGuess;
	}


	public void setToGuess(Word toGuess) {
		this.toGuess = toGuess;
	}


	public Word getHidden() {
		return hidden;
	}


	public void setHidden(Word hidden) {
		this.hidden = hidden;
	}


	public Player getActivePlayer() {
		return activePlayer;
	}


	public void setActivePlayer(Player activePlayer) {
		this.activePlayer = activePlayer;
	}


	public Player getOtherPlayer() {
		return otherPlayer;
	}


	public void setOtherPlayer(Player otherPlayer) {
		this.otherPlayer = otherPlayer;
	}


	public int getNumberOfTry() {
		return numberOfTry;
	}


	public void setNumberOfTry(int numberOfTry) {
		this.numberOfTry = numberOfTry;
	}

    
}