package CardGameWAR;

public class App {

	/*
	 * a. Instantiate a Deck and two Players, call the shuffle method on the deck.
	   b.Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.   
	   c.Using a traditional for loop, iterate 26 times and call the flip method for each player.
Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.  Print a message to say which player received a point.
Note:  If the values are equal (it is a tie), print a message saying that no point was awarded.
	   d.After the loop, compare the final score from each player.
	   e.Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.
	 * 
	 */
		
public static void main(String[] args) {		
	
	Deck deck = new Deck();

	deck.shuffle();
	Player p1 = new Player("Joe");
	Player p2 = new Player ("Leonardo");
	for (int i = 0; i < 26 ; i++) {
	p1.getHand().add(deck.draw());
	p2.getHand().add(deck.draw());
	}
	
	
	for (int i = 0; i < 26 ; i++) {
	Card p1card = p1.flip();
	Card p2card = p2.flip();
	
	System.out.print(p1.getName() + " flips: ");
	p1card.describe();
	System.out.print(p2.getName() + " flips: ");
	p2card.describe();
	
	if (p1card.getValue() > p2card.getValue()) {
		System.out.println(p1.getName() + " received a point");	
		p1.incrementScore();
	}else if (p1card.getValue() < p2card.getValue()){
		System.out.println(p2.getName() + " received a point");	
		p2.incrementScore();
	}else {
		System.out.println("Draw");	
		}
	System.out.println();
	}
	System.out.println("******************");
	if (p1.getScore() > p2.getScore()) {
		System.out.println(p1.getName() + " wins the game!");	
	}else if (p1.getScore() < p2.getScore()){
		System.out.println(p2.getName() + " wins the game!");	
		
	}else {
		System.out.println("Tie. No one wins in war!!");	
		}
	System.out.println(p1.getName() + " Final Score " + p1.getScore());
	System.out.println(p2.getName() + " Final Score " + p2.getScore());
}

	}	
	

