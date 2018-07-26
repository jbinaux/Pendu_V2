package guessingGame;


/**
 * 
 */
public class Game {

    /**
     * Default constructor
     */
    public Game() {
    }

    /**
     * 
     */
    private int nbSet;

    /**
     * 
     */
    private int pointMax;

    /**
     * 
     */
    private int malus;

    /**
     * premier joueur
     */
    private Player p1;

    /**
     * deuxieme joueur
     */
    private Player p2;

    /**
     * initialise the game with  players names, point system and number of sets
     * @return
     */
    public void initialiseGame() {
        // TODO implement here
    }

    /**
     * play (nbSet * 2) sets of  guessing the word
     * @return
     */
    public void playGame() {
        // TODO implement here
    }

    /**
     * @return
     */
    public void displayWinner() {
        // TODO implement here
    }

	public int getNbSet() {
		return nbSet;
	}

	public void setNbSet(int nbSet) {
		this.nbSet = nbSet;
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

	public Player getP1() {
		return p1;
	}

	public void setP1(Player p1) {
		this.p1 = p1;
	}

	public Player getP2() {
		return p2;
	}

	public void setP2(Player p2) {
		this.p2 = p2;
	}

}