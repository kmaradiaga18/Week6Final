
public class App {

	public static void main(String[] args) {
	
		deckClass mainDeck = new deckClass(); 
		
		playerClass P1 = new playerClass("P1"); 
		
		playerClass P2 = new playerClass("P2");
		
		
		
		mainDeck.shuffle();						
		for(int i=0;i<26; i++) {      				// Iteration is 26 because there is a limit of 52 in our mainDeck. 
			P1.playerDraw(mainDeck.draw());			// Now each player draws 26 cards and store them in their hands.
			P2.playerDraw(mainDeck.draw());
		}
		
		
		for(int j=0;j<26; j++) {												//Now we run a for loop to iterate 26 times because only 52 cards and we want it to go through for 2 players
			cardClass player1Card = P1.flip();									//Use flip from player class, repeat for player 2
			System.out.println("Player 1 plays: " + player1Card.getName());		//Use getname getter from cardClass to recall correct, card name repeat for player 2
			cardClass player2Card = P2.flip();
			System.out.println("Player 2 plays: " + player2Card.getName());
			
			if(player1Card.getValue() < player2Card.getValue()) {				//Now if create if else statement to determine in which situations player would receive the point
				P2.incrementScore();
			} else {
				P1.incrementScore();
			}
		}
																					//After running game play loop, run loop for announcing winner and recall score
		if(P1.getScore() == P2.getScore()) {										//If statement in case of draw & what it should print
			System.out.println("Cease fire. It's a draw.");
		} else if(P1.getScore() > P2.getScore()) {
			System.out.println("Player One wins. Final Score:" + P1.getScore());	//Else/else if statements if one the players win
		} else {
			System.out.println("Player Two wins. Final Score:" + P2.getScore());
		}
				
		}

} // End of main method
