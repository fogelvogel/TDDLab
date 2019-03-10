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
		} else {
			local1 = p2;
			local2 = p1;
		}
		do {
			
			if (counter != 0) {
				onTable[counter] =  local2.giveCard();
				counter++;
			}
			onTable[counter] =  local1.giveCard();
			counter++;
			
		}while ((int)(Math.random() * 2) > 0);
		for (int i = 0; i < onTable.length; i++) {
			local2.aceptCard(onTable[i]);
		}
		firstPlayer = !firstPlayer;
		
		return 0;
	}

}
