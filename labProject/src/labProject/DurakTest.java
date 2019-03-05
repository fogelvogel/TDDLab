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
}
