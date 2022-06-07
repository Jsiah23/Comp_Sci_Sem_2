import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Wizard[] Gandolf = new Wizard[100];
	Warrior[] Gimili = new Warrior[100];
	int c1;
	int c2;
	
	for(c1 = 0; c1 < Gandolf.length; c1++){
		Gandolf[c1] = new Wizard(); 
	}
	for(c2 = 0; c2 < Gimili.length; c2++){
		Gimili[c2] = new Warrior();
	}	
	
	c1 = 0;
	c2 = 0;
	while (c1 < Gandolf.length || c2 < Gimili.length) {
		Gandolf[c1].attack(Gimili[c2]);
		if(Gimili[c2].isDead()){
			c2++;
		}
		if(c2 == Gimili.length){
			c1 = Gandolf.length - c1;
			System.out.println("Wizards won with " + c1 + "left in their army.");
			break;
		}
		Gimili[c2].attack(Gandolf[c1]);
		if(Gandolf[c1].isDead()){
			c1++;
		}
		
		if(c1 == Gandolf.length){
			c2 = Gimili.length - c2;
			System.out.println("Warriors won with " + c2 + "left in their army.");
			break;
		}
	}
			
	} 
}

