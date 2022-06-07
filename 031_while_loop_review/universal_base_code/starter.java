import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Random rand = new Random();
	
	int[] server; 
	server = new int[100];
	
	int i;
	for(i = 0; i < server.length; i++){
	server[i] = rand.nextInt(100) + 1;	
	System.out.println(server[i]);
	}
		
	}
}
