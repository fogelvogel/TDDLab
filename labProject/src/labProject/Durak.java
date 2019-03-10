package labProject;

public class Durak {
	public static String[] suits = new String[] {"diamonds", "hearts", "clubs", "spades"};
	public static String[] numbers = new String[] {"6", "7", "8", "9", "10", "jack", "queen", "king", "ace"};

	public static Card createRandomCard() {
		int randSuit= (int)(Math.random() * 3);
		int randNumber= (int)(Math.random() * 8);
		System.out.println(randSuit);
		System.out.println(randNumber);
		return new Card(suits[randSuit], numbers[randNumber]);
	}

	public static Card[] createSixCard() {
		
		return new Card[] {createRandomCard(), createRandomCard(), createRandomCard(), createRandomCard(), createRandomCard(), createRandomCard()};
	}

}
