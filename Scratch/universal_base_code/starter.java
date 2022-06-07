import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static int getMode (int a[]) {
	int c = a[0];	
	for(int x: a){
	if (x > c){
	c = x;
	}
	}
	
	return c;
	}
	public static void main(String args[]) {
	int [] array = new int[4];
	array [0] = 1;
	array [1] = 2;
	array [2] = 100;
	array [3] = 4;
	System.out.println(getMode(array));
 	}
}
