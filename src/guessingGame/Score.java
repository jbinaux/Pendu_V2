package guessingGame;


/**
 * 
 */
public class Score {

    /**
     * Default constructor
     */
    public Score() {
    }

    /**
     * 
     */
    private int points = 0;

    /**
     * @param pointMax 
     * @param malus 
     * @return
     */
    public int calculatePoints(int pointMax, int malus, int numberOfTry) {
    	points += pointMax - (malus * (10 - numberOfTry));
    	return pointMax - (malus * (10 - numberOfTry));
    }

    /**
     * @param p1 
     * @param p2 
     * @return
     */
    public Player compareScores(Player p1, Player p2) {

    	if (p1.getPlayerScore().getPoints() < p2.getPlayerScore().getPoints())
    	{
    		return p2;
    	}
    	else if (p1.getPlayerScore().getPoints() > p2.getPlayerScore().getPoints())
    	{
    		return p1;
    	}
        return null;
    }

    /**
     * @return
     */
    public void display() {
    	System.out.println("You have " + points + " points" );
    }

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

}