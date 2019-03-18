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
		boolean kartaBita = false;
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
			if (counter > 8) {
				System.out.println("otbito!");
				kartaBita = true;
				for (int i = 0; i < counter; i++) {
				
					if (i % 2 == 0) {
						local1.aceptCard(Durak.createRandomCard());
					} else {
						local2.aceptCard(Durak.createRandomCard());
					}
				}
				firstPlayer = !firstPlayer;
			}
		onTable[counter] =  local1.giveCard();
		System.out.println("karta " + onTable[counter].getSuit() + " " + onTable[counter].getNumber() +  " kladetsya na stol");
		counter++;
		
		Card[] local2Cards = local2.getCards();
		int length = local2Cards.length;
		for (int i = 0; i < length; i++) {
			if (Durak.compare(onTable[counter - 1], local2Cards[i]) == 1) {
				onTable[counter] =  local2.giveCard();
				System.out.println("karta " + onTable[counter].getSuit() + " " + onTable[counter].getNumber() +  " kladetsya na stol");
				counter++;
				break;
			}
		}
		
	}while (!kartaBita);
	
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

	public static String getTrump() {
		return "hearts";
	}

	// возвращает 1 если первая карта бьет вторую
	public static int compare(Card card, Card card2) {
		if (card.getSuit() == Durak.getTrump()) {
			if (card2.getSuit() != Durak.getTrump()) {
				return 1;
			}
			
		} else {
			if (card2.getSuit() == Durak.getTrump()) {
				System.out.println("kozirnaya!");
				return 0;
			}
		}
		int card1Number = 0;
		int card2Number = 0;
		for (int i = 0; i < 8; i++) {
			if (Durak.numbers[i] == card.getNumber()) {
				card1Number = i;
			}
			if (Durak.numbers[i] == card2.getNumber()) {
				card2Number = i;
			}
		}
		if (card1Number > card2Number) {
			return 1;
		} else {
			return 0;
		}
	}

}
