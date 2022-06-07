import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	
	int randum = rand.nextInt(1000);

	while (true)			{
	System.out.print("Guess a number between 0 and 1,000: ");
	int guess = sc.nextInt();
	
	if (guess < randum)			{			
	System.out.println("You're a little too low! ");
	System.out.println();
	}
	if (guess > randum)			{
	System.out.println("You're a little too high! ");
	System.out.println();
	}
	if(guess == randum)			{
	System.out.println("You guessed it!");
	break;			}
	}
	}
}
