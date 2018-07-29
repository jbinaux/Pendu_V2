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

    private UsedLetters used = new UsedLetters();
    
    private Player activePlayer;

    private Player otherPlayer;
    
    private int pointMax;

    private int malus;

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
        	System.out.print("\033[H\033[2J");
        	System.out.flush();
        	System.out.println(activePlayer.getNickname() + ", you have " + numberOfTry + " tries remaining");
        	activePlayer.getPlayerScore().display();
        	hidden.display();
        	used.display();
        	System.out.println(activePlayer.getNickname() + ", enter a character");
        	s = scan.nextLine();
        	while(s.length() == 0 || s.length() > 1 || (s.charAt(0) < 'a' && s.charAt(0) < 'z'))
    		{
    			System.out.println("Enter one lowercase letter");
    			s = scan.nextLine();
    		}
        	if(used.isUsed(s.charAt(0)))
    		{
    			System.out.println("This letter was already tried");
    			continue;
    		}
        	used.addLetter(s.charAt(0));
        	if(toGuess.guessChar(s.charAt(0)))
        	{
        			hidden.replaceChar(s.charAt(0), toGuess);
        	}
        	else
        	{
        		numberOfTry--;
        	}
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
        hidden.display();
        System.out.println("you won " + activePlayer.getPlayerScore().calculatePoints(pointMax, malus, numberOfTry) + " points");
        activePlayer.getPlayerScore().display();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        System.out.print("\033[H\033[2J");
        System.out.flush();
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


	public int getPointMax() {
		return pointMax;
	}


	public void setPointMax(int pointMax) {
		this.pointMax = pointMax;
	}


	public int getMalus() {
		return malus;
	}


	public void setMalus(int malus) {
		this.malus = malus;
	}

    
}