import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("What is your name? ");
	String name = sc.nextLine();
	System.out.println("What is your title? Ex: Musician ");
	String title = sc.nextLine();
	
	System.out.println("Would you like to be a Wizard, Warrior, or Rogue? ");
	String response = sc.nextLine();

	if (response.equals ("Wizard"))
	{
	System.out.println("You've chosen the Wizard! Excelsior! ");
	}
	else if (response.equals ("Warrior"))		{
	System.out.println("You've chosen the Warrior! For honor! ");
	}
	else if (response.equals ("Rogue"))		{
	System.out.println("You've chosen the Rogue! How cunning! ");
	}
	else	
	{
	System.out.println("You've decided not to chose a role. Rerun program. ");
	}
	System.out.println();
	System.out.println("You have 25 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, Charisma. Spend them wisely. ");
	System.out.println();
	System.out.print("Strength (1-10) : ");
	int one = sc.nextInt();
	int one1 = (25 - one);
	System.out.println("You have " + (one1) + " left to spend. ");
	System.out.println();
	System.out.print("Dexterity (1-10) : ");
	int two = sc.nextInt();
	int two1 = (one1 - two);
	System.out.println("You have " + (two1) + " left to spend. ");
	System.out.println();
	System.out.print("Intelligence (1-10) : ");
	int three = sc.nextInt();
	int three1 = (two1 - three);
	System.out.println("You have " + (three1) + " left to spend. ");
	System.out.println();
	System.out.print("Constitution (1-10) : ");
	int four = sc.nextInt();
	int four1 = (three1 - four);
	System.out.println("You have " + (four1) + " left to spend. ");
	System.out.println();
	System.out.print("Charisma (1-10) : ");
	int five = sc.nextInt();
	int five1 = (four1 - five);
	System.out.println();
	System.out.println();
	System.out.println("_____________________________________________________");
	System.out.println("You are " + name + ", the " + title + " of CVHS. " );
	System.out.println("You're a " + response + " with the follownig stats! ");
	// finish stats
	System.out.println("Strength - " + one);
	System.out.println("Dexterity - " + two);
	System.out.println("Intelligence - " + three);
	System.out.println("Constitution - " + four);
	System.out.println("Charisma - " + five);
	System.out.println();
	System.out.println("Good chance on your quest " + name + "!");
	}
}
