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
	
	// ����� ������ �������� ����� ���� �� ����
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
	// ����� ������ �������� ���� ����� �� ����
		@Test
		public void testOfGivingCard() {
			Player instance = new Player();
			instance.setCards(Durak.createSixCard());
			instance.giveCard();
			assertEquals(instance.getCards().length, 5);
		}
		// ����� ������ �������� ��� ���� ���� ����� �� ����
				@Test
				public void testOfGivingTwoCard() {
					Player instance = new Player();
					instance.setCards(Durak.createSixCard());
					instance.giveCard();
					instance.giveCard();
					assertEquals(instance.getCards().length, 4);
				}
		
		// ����� ������ ������� �����
				@Test
				public void testOfAceptingCard() {
					Player instance = new Player();
					instance.setCards(Durak.createSixCard());
					instance.aceptCard();
					assertEquals(instance.getCards().length, 7);
				}
}
