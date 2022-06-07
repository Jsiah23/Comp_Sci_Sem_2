import pkg.*;
import java.util.Scanner;
import java.util.Random;

class myCharacter{
String role;

public myCharacter(){
role = "No Role";	
System.out.println("Your role is: " + role);
}	
public myCharacter(String a){
role = a;
if (role.equals ("Wizard"))				{
	System.out.println("You've chosen the Wizard! Excelsior! ");
	role = "Wizard";
	}
	else if (role.equals ("Warrior"))		{
	System.out.println("You've chosen the Warrior! For honor! ");
	role = "Warrior";
	}
	else if (role.equals ("Rogue"))		{
	System.out.println("You've chosen the Rogue! How cunning! ");
	role = "Rogue";
	}
	else		{
	System.out.println("You've decided not to chose a role. Rerun program. ");
	role = "No role";
	}
	System.out.println("Your role is: " + role);
}
}

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);	
	
	myCharacter deez1 = new myCharacter();
	int num = 0;	
	
	String type = new String("Your strength trait is 0 \nYour dexterity trait is 0 \nYour intelligence trait is 0 \nYour constitution trait is 0 \nYour charisma trait is 0");
	System.out.println(type);
	
	System.out.println("_________________________________________");
	System.out.println("What class would you like to be? ");
	String a = sc.nextLine();
	myCharacter deez2 = new myCharacter(a); 
	System.out.println(type);
		
	}
}
