package labProject;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CardTest {
	
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
}
