import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();  
	int one = rand.nextInt(1001);
	
	System.out.print("Pick a number between 1 - 1000: ");
	int guess = sc.nextInt();
	
	boolean answer = (guess == one);
	if (answer)
	{
	System.out.println("Your number was the random number!");	
	}
	else 
	{
	System.out.print("Your number wasn't the random number. The number was " + one + ".");
	}
	}
}
