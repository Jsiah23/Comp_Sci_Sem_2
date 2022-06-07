package pkg;
import java.util.Scanner;
import java.util.Random;

	public class Actor extends Performer{
	String type;
	
	public Actor(){
	type = "theater";	
	}
	public Actor(String name, String type){
	super(name);
	this.type = type;
	}
	public void practice(){
	System.out.println(super.getName() + " has been practicing since midnight!");
	}
	public void perform(){
	System.out.println(super.getName() + " performs the lines with sincerity.");	
	}
	public void monologue(){
	System.out.println("Blah Blah Blah some famous speech, And the crowd sleeps.");
	}
	
	}
	

	



