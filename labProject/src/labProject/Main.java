package labProject;

import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
	System.out.println("Dobro pojalovat v Durak 1.0");
	 InputStreamReader in = null;
	 in = new InputStreamReader(System.in);
     System.out.println("Vvedite q dlya vihoda");
     
     	Durak.p1.setCards(Durak.createSixCard());
		Durak.p2.setCards(Durak.createSixCard());
    
     char inp;
	do {
		inp = (char) in.read();
		inp = (char) in.read();
		
		Durak.makeMove();
		
		
	} while (inp != 'q');
	}

}
