import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Dog Snoopy = new Dog();						// Default Constructor
		Dog Snoopy2 = new Dog(36);					// Age Constructor
		Dog Snoop3 = new Dog(true);					// Trained Constructor
		Dog Toto = new Dog("Toto");					// Name Constructor
		Dog Clifford = new Dog("Clifford", true);	// Name, Trained Constructor
		Dog Scooby = new Dog("Scooby", 50, false);	// Name, Age, Trained Constructor

		Cat Felix = new Cat("Felix", 100, true);	// Name, Age, Trained Constructor

		System.out.println();
		Clifford.trick();							// Trained trick
		Scooby.trick();								// Untrained trick
		Felix.trick();
		// Added
		System.out.println();
		Pet[] Charlie = new Lion[5];
		Pet[] Doggo = new Wolf[5];
		
		for(int i = 0; i < 5; i++){
		Charlie[i] = new Lion();	
		Doggo[i] = new Wolf();
		Charlie[i].trick();
		Doggo[i].trick();
		}
		
		
	}
}