import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Would you like to be a Wizard, Warrior, or Rogue? ");
	String response = sc.nextLine();
	
	//boolean choice = (response.equals ("Wizard"));
	//if (choice)
	{
	if (response.equals ("Wizard"))				{
	System.out.println("You've chosen the Wizard! Excelsior! ");
	}
	else if (response.equals ("Warrior"))		{
	System.out.println("You've chosen the Warrior! For honor! ");
	}
	else if (response.equals ("Rogue"))			{
	System.out.println("You've chosen the Rogue! How cunning! ");
	}
	else		{
	System.out.println("You've decided not to chose a role. Rerun program. ");
	}
	}
}
}