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
	public Card giveCard() {
		Card ret;
		Card[] tmp = new Card[this.cards.length-1];
		
		for (int i = 0; i < this.cards.length - 1; i++) {
			tmp[i] = this.cards[i];
		}
		ret = this.cards[this.cards.length - 1];
		this.cards = new Card[tmp.length];
		
		for (int i = 0; i < tmp.length; i++) {
			this.cards[i] = tmp[i];
		}
		return ret;
	}
	
	public Card[] getCards() {
	
		return this.cards;
	}
	public void aceptCard() {
		Card[] tmp = new Card[this.cards.length + 1];
		
		for (int i = 0; i < this.cards.length; i++) {
			 tmp[i] = this.cards[i];
		}
		tmp[tmp.length - 1] = Durak.createRandomCard();
		cards = tmp;
	}

}
