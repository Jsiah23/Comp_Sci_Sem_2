import pkg.*;
import java.util.Scanner;
import java.util.Random;

class Scale{
	String[] DataBase = new String[]{"C", "C#", "D","D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
	int i;

	public String Major(String type){		//Ex: type C
	String FirstDegree = type;
	
	for(i = 0; i<12 ;i++){
	if(DataBase[i].equals(FirstDegree)){			//%2 = 0
		return ;	
	}
	}
	return "not valid";
	
	
	}
}
class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in); 
	
	System.out.print("Scale type: ");
	String type = sc.nextLine();
	//use method Major to print every note in the scale
	Scale trial = new Scale();
	System.out.println(trial.Major(type));
	// Use initial note to now produce scale
	
	
	
	
		
	}
}
