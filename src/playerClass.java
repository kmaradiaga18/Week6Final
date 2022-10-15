import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class playerClass {

		/*	C.	Player
				i.	Fields
					1.	hand (List of Card)
					2.	score (set to 0 in the constructor)
					3.	name
				ii.	Methods
					1.	describe (prints out information about the player and calls the describe method for each card in the Hand List)
					2.	flip (removes and returns the top card of the Hand)
					3.	draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
					4.	incrementScore (adds 1 to the Player’s score field)
		 */

			
	private List<cardClass> hand = new ArrayList<>(); // created new array list because hand will change but also we leave it empty because we don't know what card values we get
	private int score;	
	private String playerName;
	
	
	
	public playerClass(String name) {				// Here we are making sure when a new instance of a playerName is created, the score will start with 0 as well
		score = 0;
		playerName = name;
	}
	
	
	
													//Methods	
	public void describe() {
		System.out.println(playerName);				// We will print players name and the cards in their hand by creating a hand using the cardClass
		for(cardClass card:hand) {
		card.describe();
		}
	}

	public void playerDraw(cardClass singleCard) {  // Adding a single card to the hand
		hand.add(singleCard);
	}
	
	public cardClass flip() {
		cardClass card = hand.remove(0);         	// Removes card from hand and returns (since we have no discard pile/deck)
		return card;
		
	}
	
	public void incrementScore() {
		score = score + 1; 						//Take current score add by 1
	}
	
	// Getter for Score
	
	public int getScore() {						// Had to create getter to use score in app
		return score;
	}
	
} // End Of Class



