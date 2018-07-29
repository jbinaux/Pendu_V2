package guessingGame;


/**
 * 
 */
public class Player {

    /**
     * Default constructor
     */
    public Player() {
    }

    private Score playerScore = new Score();

    private String nickname;

    private boolean guessing;
    
    public boolean nicknameUsed(String test)
    {
    	if(test.length() != nickname.length())
    	{
    		return false;
    	}
    	
    	for(int i = 0; i < test.length(); i++)
    	{
    		if(test.charAt(i) != nickname.charAt(i))
    		{
    			return false;
    		}
    	}
    	return true;
    }

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