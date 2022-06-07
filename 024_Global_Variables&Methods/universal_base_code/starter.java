import pkg.*;
import java.util.Scanner;
import java.util.Random;

class myCharacter{
String role;
int strength;
int dexterity;
int intelligence;
int consitution;
int charisma; 

public void myToString(){
System.out.println("Your strength trait is " + strength);
System.out.println("Your dexterity trait is " + dexterity);
System.out.println("Your intelligence trait is " + intelligence);
System.out.println("Your consitution trait is " + consitution);
System.out.println("Your charisma trait is " + charisma);
return;	
}
public myCharacter(){
role = "No Role";
strength = 0;
dexterity = 0;
intelligence = 0;
consitution = 0;
charisma = 0;	
System.out.println("Your role is: " + role);
}	
public myCharacter(String a){
role = a;
strength = 0;
dexterity = 0;
intelligence = 0;
consitution = 0;
charisma = 0;
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
	
	myCharacter first = new myCharacter();
	first.myToString();
	
	System.out.println("_________________________________________");
	System.out.println("What class would you like to be? ");
	String a = sc.nextLine();
	myCharacter first2 = new myCharacter(a); 
	first.myToString();
		
	}
}
