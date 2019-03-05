package labProject;

import org.junit.Test;
import static org.junit.Assert.*;

public class DurakTest {

	@Test
	public void testOfCreationDurak() {
		Durak instance = new Durak();
		assertNotNull(instance);
	}
	
	@Test
	public void testOfCreationCard() {
		Card instance = new Card();
		assertNotNull(instance);
	}
	
	@Test
	public void testOfCreationCardByDurak() {
		Card instance = Durak.createRandomCard();
		assertNotNull(instance);
	}
	@Test
	public void testOfSuitOfCard() {
		Card instance = Durak.createRandomCard();
		String suit = instance.getSuit();
		assertNotNull(suit);
	}
	
	//  ����� ����� ������ ���� ����, �����, ������ ��� ����
	@Test
	public void testOfCorrectSuitOfCard() {
		Card instance = Durak.createRandomCard();
		String suit = instance.getSuit();
		boolean wrongSuit = true;
		if (suit == "diamonds" || suit == "hearts" || suit == "clubs" || suit == "spades") {
			wrongSuit = false;
		}
		assertFalse(wrongSuit);
	}
	@Test
	public void testOfNumberOfCard() {
		Card instance = Durak.createRandomCard();
		String number = instance.getNumber();
		assertNotNull(number);
	}
	
//  ����� ������ ���� �� 6 �� 10, �����, ����, ������ ��� ���
	@Test
	public void testOfCorrectNumberOfCard() {
		Card instance = Durak.createRandomCard();
		String number = instance.getNumber();
		boolean wrongNumber = true;
		if (number == "jack" || number == "queen" || number == "king" || number == "ace") {
			wrongNumber = false;
		} else {
			for (int i = 6; i < 10; i++) {
				if (Integer.toString(i) == number) {
					wrongNumber = false;
					break;
				}
			}
		}
		assertFalse(wrongNumber);
	}
	
	@Test
	public void testOfCreationSixCardsByDurak() {
		Card[] array = Durak.createSixCard();
		assertNotNull(array);
	}
	
	// ���� ��� ���� ����� ����
	@Test
	public void testOfCardsQuantity() {
		Card[] array = Durak.createSixCard();
		assertEquals(array.length, 6);
	}
}
