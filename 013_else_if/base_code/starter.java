import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();  
	int one = rand.nextInt(1001);
	
	System.out.print("Pick a number between 1 - 1000: ");
	int guess = sc.nextInt();
	
	if (guess == one)
	{
	System.out.println("Your number was the random number! The number was " + one + ".");	
	}
	else if (guess > one)
	{
	System.out.println("Your number was larger than the number. The number was " + one + ".");	
	}
	else if (guess < one)
	{
	System.out.println("Your number was smaller than the number. The number was " + one + ".");
	}
	}
}
