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
	public void testOfSuitOfCard() {
		Card instance = Durak.createRandomCard();
		String suit = instance.getSuit();
		assertNotNull(suit);
	}
	
	//  масть карты должна быть буби, черви, крести или пики
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
//  масть карты не должна быть всегда одинаковой 
	@Test
	public void testOfDifferentSuitOfCard() {
		boolean isDifferent = false;
		Card prev, curr = null;
		
		for (int i = 0; i < 10; i++) {
			prev = curr;
			curr = Durak.createRandomCard();
			if (prev != null) {
				if (prev.getSuit() != curr.getSuit()) {
					isDifferent = true;
					break;
				}
			}
		}
		assertTrue(isDifferent);
	}
	@Test
	public void testOfNumberOfCard() {
		Card instance = Durak.createRandomCard();
		String number = instance.getNumber();
		assertNotNull(number);
	}
	
//  номер должен быть от 6 до 10, валет, дама, король или туз
	@Test
	public void testOfCorrectNumberOfCard() {
		Card instance = Durak.createRandomCard();
		String number = instance.getNumber();
		boolean wrongNumber = true;
		if (number == "jack" || number == "queen" || number == "king" || number == "ace") {
			wrongNumber = false;
		} else {
			for (int i = 6; i < 11; i++) {
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
	
	// тест что карт шесть штук
	@Test
	public void testOfCardsQuantity() {
		Card[] array = Durak.createSixCard();
		assertEquals(array.length, 6);
	}
	
	// тест что карты инициализированы
		@Test
		public void testOfCardsInitialisation() {
			Card[] array = Durak.createSixCard();
			boolean isNull = false;
			for (int i = 0; i < 6; i++) {
				if(array[i] == null) {
					isNull = true;
				}
			}
			assertFalse(isNull);
		}	
		//  возможность сделать ход в игре
		@Test
		public void testMakingMove() {
			int result = Durak.makeMove();
			assertEquals(1, result);
		}
}

