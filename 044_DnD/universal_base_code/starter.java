import pkg.*;
import java.util.Scanner;
import java.util.Random;

class BloodHunter{
Random rand = new Random();
String name;
int health;
int attack;

public BloodHunter(){
name = "BH";	
health = rand.nextInt(15) + 1; 
attack = rand.nextInt(15) + 1;
}
public BloodHunter(String name){
this.name = name;
health = rand.nextInt(15) + 1; 
attack = rand.nextInt(15) + 1;
}
public void setHealth(int health){
this.health = health;
}
public int getHealth(){
return health;
}
public String getName(){
return name;	
}
public void attack(){
attack = rand.nextInt(15) + 1;
health = health - attack;
System.out.println(this.getHealth());	
}
public void printArt(){
System.out.println(" _   _   _   _+       |");
System.out.println("/_`-'_`-'_`-'_|  \\+/  |");
System.out.println("\\_`G'_`T'_`B'_| _<=>_ |");
System.out.println("  `-' `-' `-' 0/ \\ / o=o");
System.out.println("              \\/\\ ^ /`0");
System.out.println("              | /_^_\\");
System.out.println("              | || ||");
System.out.println("            __|_d|_|b__");

}
}
class starter {
	public static void main(String args[]) {
	BloodHunter BH = new BloodHunter();
	System.out.println(BH.getName());
	BH.printArt();
	
	BloodHunter DH = new BloodHunter("EvilTwin");
	System.out.println(DH.getName());
	DH.printArt();
	
	
	
	
	}
}
