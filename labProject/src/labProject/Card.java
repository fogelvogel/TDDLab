package labProject;

public class Card {
	public Card (String s, String n) {
		this.suit = s;
		this.number = n;
	}

	String suit, number; 
	public String getSuit() {

		return suit;
	}

	public String getNumber() {
		
		return number;
	}

}
