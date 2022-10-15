
public class cardClass { 							//Beginning of card class
	
	
	
	/*1a.	Card Fields
			1.	value (contains a value from 2-14 representing cards 2-Ace)
			2.	name (e.g. Ace of Diamonds, or Two of Hearts)
	 */
	
	private String name;  							// Created both of our instance variables
	
	private int value;
	
													// Using switch statements to determine if the value expression equals the word expression the statement will be executed.
	
	
	public cardClass (int value, String suit) {		//Creating a method that utilizes switch statements. and linking each case number to a written string.
		this.value = value;
		
		switch(value) {
        case 2:
        	name = "Two";
            break;
        case 3:
        	name = "Three";
            break;
        case 4: 
        	name = "Four";
            break;
        case 5: 
        	name = "Five";
            break;
        case 6: 
        	name = "Six";
            break;
        case 7: 
        	name = "Seven";
            break;
        case 8:
        	name = "Eight";
            break;
        case 9: 
        	name = "Nine";
            break;
        case 10:
        	name = "Ten";
            break;
        case 11: 
        	name = "Jack";
            break;
        case 12: 
        	name = "Queen";
            break;
        case 13:
        	name = "King";
            break;
        case 14:
        	name = "Ace";
            break;
		}
										// This will add name expression and suit(when passed) with "of" in the middle.
		name += " of " + suit; 			//suit is being passed in once we create a new card in the deck class and because its looped and all 4 suits will be created for that value.
		
	}
	

	
	public void describe() {			//Description method for printing name of card
		System.out.println(name);
	}
	
	
										// Getters and Setters for all instance variables
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	
	
	} // End Of Class
