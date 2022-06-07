import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Performer Star1 = new Performer();
	Performer Star2 = new Performer("Wanye West", 44);
	Musician Behind1 = new Musician();
	Musician Behind2 = new Musician("Keys");
	Musician Behind3 = new Musician("Dwayne Johnson", "cocunts");
	Musician Behind4 = new Musician("Elvis Presley", 100, "guitar");
	Actor Scene1 = new Actor("Kevin Hart","Contemporary");
	
	System.out.println("Performer 1's name is " + Star1.getName());
	Star1.practice();
	System.out.println();
	System.out.println("Performer 2's name is " + Star2.getName());
	Star2.perform();
	System.out.println();
	System.out.println("Musician 1's name is " + Behind1.getName());
	Behind1.perform();
	Behind1.playInstrument();
	System.out.println();
	Behind2.practice();
	System.out.println("Musician 2's instrument is the " + Behind2.getInstrument());
	System.out.println();
	System.out.println("--------------------New Musicians--------------------");
	System.out.println("Musician 3's name is " + Behind3.getName());
	Behind3.practice();
	System.out.println("Musician 3's instrument is the " + Behind3.getInstrument());
	System.out.println();
	System.out.println();
	System.out.println("Musician 4's name is " + Behind4.getName());
	Behind4.perform();
	Behind4.playInstrument();
	System.out.println("--------------------Actor--------------------");
	Scene1.practice();
	Scene1.perform();
	Scene1.monologue();


		
	}
}
