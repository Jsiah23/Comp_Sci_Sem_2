import pkg.*;
import java.util.Scanner;
import java.util.Random;

public static int generateNum(int min, int max) {
		int range = (max - min) + 1;
		return (int)(Math.random() * range) + min;
	}
class starter {
	public static void main(String args[]) {
	int num1 = (int)(Math.random()* 9);
	int num2 = generateNum(1, 100);
	// int num3 = generateNum(2.5, 3.5);

	System.out.println(num1);
	System.out.println(num2);
	// System.out.println(num3);


		
	}
}
