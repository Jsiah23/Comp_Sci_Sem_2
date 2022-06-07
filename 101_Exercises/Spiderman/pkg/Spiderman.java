package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name!
	int age;			// How many times should it be printed
	String villain;		// Who's the arch nemesis of this Spiderman

	public Spiderman() {			// Default constructor!
		actor = "Tobey Macguire";
		age = 46;
		villain = "Green Goblin";
	}
	public Spiderman(String actor) {
		this.actor = actor;
		age = 46;
		villain = "Green Goblin";
	}
	public Spiderman(int age) {
		actor = "Tobey Maguire";
		this.age = age;
		villain = "Green Goblin";
	}
	public Spiderman(String actor ,int age) {
		this.actor = actor; 
		this.age = age; 
		villain = "Green Goblin";
	}
	public Spiderman(String actor, int age, String villain) {
		this.actor = actor; 
		this.age = age; 
		this.villain = villain;
	}
	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.



	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	public String getActor() {
		return actor; 
	}
	public int getAge() { 
		return age; 
	}
	public void getActorAge() {
		return actor; 
		return age;
	} 
	public void getActorAgeVillain() {
		return actor;
		return age;
		return villain;

	}


	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}

	

}
