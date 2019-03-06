package labProject;

public class Player {

	private Card[] cards;
	public int play() {
		
		return 0;
	}
	public Card getCard(int i) {
		return cards[i];
	}
	public void setCards(Card[] cards) {
		this.cards = cards;
	}
	public void giveCard() {
		Card[] tmp = new Card[] {this.cards[0], this.cards[1], this.cards[2], this.cards[3], this.cards[4], this.cards[5]};
		this.cards = new Card[5];
		
		for (int i = 0; i < 5; i++) {
			this.cards[i] = tmp[i];
		}
	}
	public Card[] getCards() {
	
		return this.cards;
	}

}
