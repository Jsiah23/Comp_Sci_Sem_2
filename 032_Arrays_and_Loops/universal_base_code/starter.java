import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Random rand = new Random();
	int[] server;
	server = new int[1000];

	int i;
	for(i = 0; i < server.length; i++){
	server[i] = rand.nextInt(100);
	}
	
	for(i = 0; i < server.length; i++){
	System.out.println(server[i]);	
	}
	}
}
