import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Performer[] Stanley = new Performer[4];
	
	Stanley[0] = new Performer("Performer");
	Stanley[1] = new Musician("Musician", "Keys");
	Stanley[2] = new Apprentice("Apprentice", 23, "drums", "USC", 8);
	Stanley[3] = new Actor();		
	
	Stanley[0].perform();
	System.out.println("--------------------");
	Stanley[0].practice();
	System.out.println("--------------------");
	Stanley[1].perform();
	System.out.println("--------------------");
	((Musician)Stanley[1]).practice();
	System.out.println("--------------------");
	((Apprentice)Stanley[2]).practiceAtUniveristy();
	System.out.println("--------------------");
	((Musician)Stanley[2]).playInstrument();
	
	((Actor)Stanley[3]).monologue();
	System.out.println("--------------------");
	((Performer)Stanley[3]).perform();
	
	System.out.println("----------------------------------------");
	Stanley[0].toString();
	Stanley[1].toString();
	Stanley[2].toString();
	Stanley[3].toString();
	System.out.println("Are Performer 0 and Performer 1 the same: ");
	System.out.println(Stanley[0].equals(Stanley[1]));	
		
	}
}
