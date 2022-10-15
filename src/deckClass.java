import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class deckClass {
	/* B.	Deck
		i.	Fields
			1.	cards (List of Card)
		ii.	Methods
			1.	shuffle (randomizes the order of the cards)
			2.	draw (removes and returns the top card of the Cards field)
		3.	In the constructor, when a new Deck is instantiated
	*/
		
	List<cardClass> cards = new ArrayList<cardClass>();								 //Array list of cards with no value	  
	List<String> suits = Arrays.asList("Diamonds", "Hearts", "Clubs", "Spades");	 //Array list of suits
	
	public deckClass() { 											 // Constructor2r
		for(int i=2;i<=14;i++) { 									 //Start the loop at 2 which is out smallest number card number, iterate for 14 times where 14 is Ace
			for(String suit : suits) {								 // For loop that goes through all 4 suits for the specific card i	
			//	System.out.println("Card: " + i + " of " + suit);
				cards.add(new cardClass(i, suit)); 					//Create 52 instances of card class stored into cards List (i,suit) refers to the cardclass(). we created in other tab.
			}	
		}	
	}
		
	public void shuffle(){
		Collections.shuffle(cards); 		//Because lists is a collection we could call collections 1st because its easier to shuffle. then apply shuffle(). to our cards we instantiated.
	}
	
	public cardClass draw(){ 				// Created a methods referring to cardClass saying that card is to remove the top card (0) and return.
		cardClass card = cards.remove(0);
		return card;
	}
}
