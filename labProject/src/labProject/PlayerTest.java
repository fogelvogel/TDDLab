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
}
