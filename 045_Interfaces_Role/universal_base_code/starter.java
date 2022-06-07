import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Role[] array = new Role[3];	
	array[0] = new Wizard("Gandolf");
	System.out.println("This is " + array[0].getName());
	array[0].printArt();
	array[1] = new Warrior("Gimili");
	System.out.println("This is " + array[1].getName());
	array[1].printArt();
	array[2] = new BloodHunter("WOO");
	System.out.println("This is "+ array[2].getName());
	array[2].printArt();
		
	}
}
