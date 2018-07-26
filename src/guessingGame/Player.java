package guessingGame;


/**
 * 
 */
public class Player {

    /**
     * Default constructor
     */
    private Player() {
    }

    /**
     * 
     */
    private Score playerScore;

    /**
     * 
     */
    private String nickname;

    /**
     * 
     */
    private boolean guessing;

	public Score getPlayerScore() {
		return playerScore;
	}

	public void setPlayerScore(Score playerScore) {
		this.playerScore = playerScore;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public boolean isGuessing() {
		return guessing;
	}

	public void setGuessing(boolean guessing) {
		this.guessing = guessing;
	}

    
}