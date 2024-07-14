package CardGameWAR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	/*
	 *   i.     Fields
			1.     cards (List of Card)

   		ii.    Methods
			 1.     shuffle (randomizes the order of the cards)
			 2.     draw (removes and returns the top card of the Cards field)
			 3.     In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.
	 */
	
List<Card> cards = new ArrayList<Card>();
		
Deck () {

String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", 
					"Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
for (int i = 0; i < numbers.length; i ++) {
	for (int s = 0; s < suits.length; s ++) {
		Card c = new Card();
		c.setValue(i + 2);
		
		c.setName(numbers[i] + " of " + suits[s]);
		cards.add(c);
	}
}

}


public List<Card> getCards() {
return cards;
}

public void setCards(List<Card> cards) {
this.cards = cards;
}

public void describe() {
for (Card card : this.cards) {
card.describe();
}		
}

public void shuffle() {
Collections.shuffle(this.cards);
}

public Card draw() {
Card card = this.cards.remove(0);
return card;
}		
}

	


