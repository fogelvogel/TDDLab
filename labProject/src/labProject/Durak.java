package labProject;

public class Durak {

	public static Card createRandomCard() {
		
		return new Card();
	}

	public static Card[] createSixCard() {
		
		return new Card[] {createRandomCard(), createRandomCard(), createRandomCard(), createRandomCard(), createRandomCard(), createRandomCard()};
	}

}
