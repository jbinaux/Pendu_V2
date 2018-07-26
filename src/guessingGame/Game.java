package guessingGame;

import java.util.Scanner;

public class Game {

    /**
     * Default constructor
     */
    public Game() {
    }

    private int nbSet;

    private int pointMax = 100;

    private int malus = 10;

    private Player p1 = new Player();

    private Player p2 = new Player();

    /**
     * initialise the game with  players names, point system and number of sets
     */
    public void initialiseGame() {
    	Scanner scan = new Scanner(System.in);
    	char c;
    	String input;
    	
    	System.out.print("Enter player 1 name : ");
    	input = scan.nextLine();
    	while(input.length() == 0)
    	{
    		input = scan.nextLine();
    	}
    	p1.setNickname(input);
    	System.out.flush();
    	System.out.print("Enter player 2 name : ");
    	input = scan.nextLine();
    	while(input.length() == 0 || p1.nicknameUsed(input))
    	{
    		if(p1.nicknameUsed(input))
    		{
    			System.out.println("Name already taken !");
    		}
    		input = scan.nextLine();
    	}
    	p2.setNickname(input);
    	System.out.flush();
    	System.out.print("Enter number of sets : ");
    	nbSet = scan.nextInt();
    	System.out.flush();
    	System.out.println("Play with default point system ? Y/N");
    	c = scan.next().charAt(0);
    	while(c != 'y' && c != 'Y' && c != 'n' && c != 'N')
    	{
    		c = scan.next().charAt(0);
    	}
    	if(c == 'n' || c == 'N')
    	{
    		System.out.print("Enter maximum of points : ");
        	pointMax = scan.nextInt();
        	System.out.flush();
        	System.out.print("Enter malus : ");
        	malus = scan.nextInt();
        	System.out.flush();
    	}
    	else
    	{
    		System.out.println("maximum of points = 100\nmalus = 10");
    	}
    }

    /**
     * play (nbSet * 2) sets of the game with alternating active players
     */
    public void playGame() {
       initialiseGame();
       for(int i = 1; i <= nbSet; i++)
       {
    	   Set s1 = new Set();
    	   Set s2 = new Set();
    	   s1.setOtherPlayer(p1);
    	   s1.setActivePlayer(p2);
    	   s1.playSet();
    	   s2.setOtherPlayer(p2);
    	   s2.setActivePlayer(p1);
       }
    }

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