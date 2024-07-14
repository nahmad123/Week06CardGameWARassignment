package CardGameWAR;

import java.util.ArrayList;
import java.util.List;

public class Player {

/*
 * i.     Fields

1.     hand (List of Card)
2.     score (set to 0 in the constructor)
3.     name

ii.    Methods

1.     describe (prints out information about the player and calls the describe method for each card in the Hand List)
2.     flip (removes and returns the top card of the Hand)
3.     draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
4.     incrementScore (adds 1 to the Player’s score field)
 */

	
	List<Card> hand = new ArrayList<Card>();
	int score = 0;
	String name;
	
	public Player(String name) {
		this.setName(name);
	}
	
	
	
	public void describe(Player player) {
		System.out.println(player.getName() + " has these cards ");
			for (Card card : this.hand) {
				card.describe();
			}		
		
	}
		
	
	
	public Card flip() {
	Card card = hand.get(0);
	hand.remove(0);
	return card;
	}



	public List<Card> getHand() {
		return hand;
	}



	public void setHand(List<Card> hand) {
		this.hand = hand;
	}



	public int getScore() {
		return score;
	}



	public void setScore(int score) {
		this.score = score;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
public void incrementScore() {
	this.score++;
}
}
