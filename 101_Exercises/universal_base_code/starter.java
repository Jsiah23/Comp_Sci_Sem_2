import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Ascii boom = new Ascii("Dog","Benny", 2);
	Ascii boom1 = new Ascii("Humnan", "WooWoo");
	Ascii boom2 = new Ascii("Other", "Sutcac", 2);
	Ascii boom3 = new Ascii("Pyramid", "Complete");
	
	boom.printArt();
	boom1.printArt();
	boom2.setAscii("|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|");
	boom2.printArt();
	boom3.printArt();
	}
}
