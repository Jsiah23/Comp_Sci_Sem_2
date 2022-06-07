import pkg.*;
import java.util.Scanner;
import java.util.Random;

class Dwarf		{
String name;
int age;

public Dwarf(){
name = "Grumpy";
age = 0;
}

public String getName(){
return name;
}

public int getAge(){
return age;	
}
public void SetName(String a){
name = a; 
}
public void SetAge(int  b){
age = b;
}
public String getinfo(){
return "Dwarf: " + this.getName() + " is " + this.getAge() + " years old!";	
}

}
class starter {
	public static void main(String args[]) {
	Random rand = new Random();
	Dwarf[] x = new Dwarf[100];	
	int c;
	
	String[] names = new String[]{"Grumpy", "Dopey", "Doc", "Happy", "Bashful", "Sneezy", "Sleepy"};
	for (c = 0;c < x.length; c++) {
	x[c] = new Dwarf();
	x[c].SetName(names[rand.nextInt(names.length)]);
	}
	
	for (c = 0;c < x.length; c++){
	x[c].SetAge(rand.nextInt(100) + 1);	
	System.out.println((c + 1) + x[c].getinfo());
	}
	

		
	}
}
