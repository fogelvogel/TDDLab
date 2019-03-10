package labProject;

public class Durak {
	public static String[] suits = new String[] {"diamonds", "hearts", "clubs", "spades"};
	public static String[] numbers = new String[] {"6", "7", "8", "9", "10", "jack", "queen", "king", "ace"};
	public static boolean firstPlayer = true;
	public static Player p1 = new Player();
	public static Player p2 = new Player();

	public static Card createRandomCard() {
		int randSuit= (int)(Math.random() * 3);
		int randNumber= (int)(Math.random() * 8);
		return new Card(suits[randSuit], numbers[randNumber]);
	}

	public static Card[] createSixCard() {
		
		return new Card[] {createRandomCard(), createRandomCard(), createRandomCard(), createRandomCard(), createRandomCard(), createRandomCard()};
	}

	public static int makeMove() {
		Card[] onTable = new Card[36];
		int counter = 0;
		Player local1, local2;
		
		if (firstPlayer) {
			local1 = p1;
			local2 = p2;
			System.out.println("hodit igrok 1");
		} else {
			local1 = p2;
			local2 = p1;
			System.out.println("hodit igrok 2");
		}
		do {
			
			if (counter != 0) {
				onTable[counter] =  local2.giveCard();
				System.out.println("karta " + onTable[counter].getSuit() + " " + onTable[counter].getNumber() +  " kladetsya na stol (otbivaet)");
				counter++;
			}
			onTable[counter] =  local1.giveCard();
			System.out.println("karta " + onTable[counter].getSuit() + " " + onTable[counter].getNumber() +  " kladetsya na stol");
			counter++;
			
		}while ((int)(Math.random() * 2) > 0);
		if (firstPlayer) {
			System.out.println("igrok 2: ");
		} else {
			System.out.println("igrok 1: ");
		}
		for (int i = 0; i < counter; i++) {
			System.out.print("zabiraet kartu " + onTable[i].getSuit() + " " +onTable[i].getNumber() + "\n");
			local2.aceptCard(onTable[i]);
			if (i % 2 == 0) {
				local1.aceptCard(Durak.createRandomCard());
			}
		}
		firstPlayer = !firstPlayer;
		
		return 0;
	}

}
