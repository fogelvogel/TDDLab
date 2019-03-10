package labProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void testOfCreationPlayer() {
		Player instance = new Player();
		assertNotNull(instance);
	}
	
	@Test
	public void testOfPlaying() {
		Player instance = new Player();
		int success = instance.play();
		assertEquals(success, 0);
	}
	
	// игрок должен получить шесть карт на руки
	@Test
	public void testOfGettingCards() {
		Player instance = new Player();
		instance.setCards(Durak.createSixCard());
		boolean isNull = false;
		for (int i = 0; i < 6; i++) {
			if(instance.getCard(i) == null) {
				isNull = true;
			}
		}
		assertFalse(isNull);
	}
	// игрок должен выложить одну карту на стол
		@Test
		public void testOfGivingCard() {
			Player instance = new Player();
			instance.setCards(Durak.createSixCard());
			instance.giveCard();
			assertEquals(instance.getCards().length, 5);
		}
		// функция выкладывания карты должна возвращать выложенную карту
		@Test
		public void testOfGivingCardReturn() {
			Player instance = new Player();
			instance.setCards(Durak.createSixCard());
			Card ret = instance.giveCard();
			assertNotNull(ret);
		}
		// игрок должен выложить два раза одну карту на стол
				@Test
				public void testOfGivingTwoCard() {
					Player instance = new Player();
					instance.setCards(Durak.createSixCard());
					instance.giveCard();
					instance.giveCard();
					assertEquals(instance.getCards().length, 4);
				}
		
				// игрок должен принять карту, переданную в параметрах
				@Test
				public void testOfAceptingCardParams() {
					Player instance = new Player();
					instance.setCards(Durak.createSixCard());
					Card card = new Card("spades", "jack");
					instance.aceptCard(card);
					assertEquals(instance.getCards().length, 7);
				}
				// игрок должен принять карту
				@Test
				public void testOfAceptingCard() {
					Player instance = new Player();
					instance.setCards(Durak.createSixCard());
					instance.aceptCard();
					assertEquals(instance.getCards().length, 7);
				}
				// игрок должен принять карту два раза
				@Test
				public void testOfAceptingTwoCard() {
					Player instance = new Player();
					instance.setCards(Durak.createSixCard());
					instance.aceptCard();
					instance.aceptCard();
					assertEquals(instance.getCards().length, 8);
				}
}
