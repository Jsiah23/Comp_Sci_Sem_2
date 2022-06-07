import java.util.Scanner;
import java.util.Random;

class Character{
int num = 5;	
String type = new String("Your role is Rogue \nYour strength trait is 5 \nYour dexterity trait is " + num +
" \nYour intelligence trait is 5 \nYour constitution trait is 5 \nYour charisma trait is 5");
}
class starter {
	public static void main(String args[]) {
	Character myC = new Character();	
	System.out.println(myC.type);


		
	}
}
