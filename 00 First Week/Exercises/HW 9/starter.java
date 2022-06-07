import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Random rand = new Random();
	 
	int[] start;
	start = new int[20];
	
	System.out.print("These are the 20 numbers: ");
	int i;
	for(i = 0; i < start.length; i ++){
	start[i] = rand.nextInt(50) + 1;
	System.out.print(start[i] + " ");
	}
	System.out.println();

	for(i = 0; i > start.length; i ++ ){
	start[i] = rand.nextInt(50) + 1;
	System.out.print(start[i] + " ");
	}
	System.out.print("Success");
	}
}
