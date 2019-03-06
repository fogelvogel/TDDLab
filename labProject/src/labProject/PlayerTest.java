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
}
