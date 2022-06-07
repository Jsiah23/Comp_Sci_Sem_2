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

public int setStrength(int b){
int strength = b;	
System.out.println("Your strength trait is " + strength);
return strength;
}
public int setDexterity(int c){
int dexterity = c;	
System.out.println("Your dexterity trait is " + dexterity);
return dexterity;
}
public int setIntelligence(int d){
int intelligence = d;	
System.out.println("Your intelligence trait is " + intelligence);
return intelligence;
}
public int setConstitution(int e){
int intelligence = e;
System.out.println("Your consitution trait is " + consitution);
return intelligence;
}
public int setCharisma(int f){
int charisma = f;	
System.out.println("Your charisma trait is " + charisma);
return charisma;
}
public boolean setAll(String a, int b, int c, int d, int e, int f){
setRole();
setStrength(b);
System.out.println(setdexterity);
System.out.println(setintelligence);
System.out.println(setconsitution);
System.out.println(setcharisma);	
//System.out.println("Your role is: " + role);
}	

public String setRole(String a){
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
	String out = new String("Your role is: " + role);
	return out;
}
}
class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);	
	
	// myCharacter first = new myCharacter();
	// first.myToString();
	
	// System.out.println("_________________________________________");
	// System.out.println("What class would you like to be? ");
	// String a = sc.nextLine();
	// myCharacter first2 = new myCharacter(a); 
	// first.myToString();

	}
}
