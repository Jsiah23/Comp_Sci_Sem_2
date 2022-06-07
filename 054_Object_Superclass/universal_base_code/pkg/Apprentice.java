package pkg;
import java.util.Scanner;
import java.util.Random;

	public class Apprentice extends Musician{
	String school;
	int yearsofExperience;
	
	public Apprentice(){
	school = "CVHS";	
	yearsofExperience = 0;
	}
	public Apprentice(String school, int yearsofExperience){
	this.school = school;
	this.yearsofExperience = yearsofExperience;
	}
	public Apprentice(String instrument, String school, int yearsofExperience){
	super(instrument);
	this.school = school;
	this.yearsofExperience = yearsofExperience;
	}
	public Apprentice(String name, int age, String instrument, String school, int yearsofExperience){
	super(name, age, instrument);
	this.school = school;
	this.yearsofExperience = yearsofExperience;
	}
	public void playInstrument(){
	System.out.println("Plays instrument mediocerly like Drake");	
	}
	public void practice(){
	System.out.println(super.getName() + " is practicing.");
	System.out.println(super.getName() + " has played for 7 years.");
	}
	public void perform(){
	System.out.println(super.getName() + " is performing.");	
	System.out.println("The performance needs some work still.");
	}
	public void practiceAtUniveristy(){
	System.out.println(super.getName() + " is practicing.");
	System.out.println(super.getName() + " is practicing triangle at " + school);
	}
	public String toString(){
		return("Name: " + getName() + " Instrument: " + getInstrument() + " University: " + school);
	}
	
	}
	

	



