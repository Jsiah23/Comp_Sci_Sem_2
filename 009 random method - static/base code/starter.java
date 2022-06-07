import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
Random rand = new Random();
int one = rand.nextInt(10);
int two = rand.nextInt(99) + 1;
double three = rand.nextDouble() + 2.5;
double four = rand.nextDouble() + 14 + rand.nextInt(575);

System.out.println("A number between 0 and 9: " + one);
System.out.println("A number between 1 and 100: " + two);
System.out.println("A number between 2.5 and 3.5: " + three);
System.out.println("A double between 14 and 589: " + four);
	}
}
