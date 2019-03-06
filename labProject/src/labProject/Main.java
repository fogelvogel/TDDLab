package labProject;

import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
	System.out.println("Dobro pojalovat v Durak 1.0");
	 InputStreamReader in = null;
	 in = new InputStreamReader(System.in);
     System.out.println("Vvedite q dlya vihoda");
     
     Player p1 = new Player();
     p1.setCards(Durak.createSixCard());
     Player p2 = new Player();
     p2.setCards(Durak.createSixCard());
     
     boolean playerOne = true;
     
     char inp;
	do {
		inp = (char) in.read();
		inp = (char) in.read();
		
		if (playerOne) {
			System.out.print("Igrok 1 ");
			p1.giveCard();
		} else {
			System.out.print("Igrok 2 ");
			p2.giveCard();
		}
		
		System.out.println("kladet kartu na stol");
		
		
		if (!playerOne) {
			System.out.print("Igrok 1 ");
			p1.aceptCard();
		} else {
			p2.aceptCard();
		}
		
		System.out.println("zabiraet kartu");
		
		playerOne = !playerOne;
	} while (inp != 'q');
	}

}
