package pkg;
import java.util.Scanner;
import java.util.Random;

class Musician extends Performer{
	String instrument;
	
	public Musician(){
	instrument = "Cello";	
	}
	public Musician(String instrument){
	this.instrument  = instrument;	
	}
	
	public String getInstrument(){
	return instrument;
	}
	public void playInstrument(){
	System.out.println("Plays instrument");	
	}
	
}


