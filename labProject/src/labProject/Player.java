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
		Card[] tmp = new Card[this.cards.length-1];
		
		for (int i = 0; i < this.cards.length - 1; i++) {
			tmp[i] = this.cards[i];
		}
		this.cards = new Card[tmp.length];
		
		for (int i = 0; i < tmp.length; i++) {
			this.cards[i] = tmp[i];
		}
	}
	
	public Card[] getCards() {
	
		return this.cards;
	}
	public void aceptCard() {
		Card[] tmp = new Card[] {this.cards[0], this.cards[1], this.cards[2], this.cards[3], this.cards[4], this.cards[5], Durak.createRandomCard()};
		cards = tmp;
	}

}
