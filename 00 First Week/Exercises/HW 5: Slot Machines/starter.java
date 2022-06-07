import java.util.Scanner; 
import java.util.Random;
class starter {
	public static void main(String args[]) {
	Random rand = new Random();
	Scanner sc = new Scanner(System.in);
	int amount = 0;
	int total = 100;
	
	System.out.println("Slot Machine Rules: \n1. Each player starts with $100. \n2. Input a wager less than your total amount of money. ");
	System.out.println("3. The slot machine will roll 3 numbers from 1 to 10. \na. If two numbers match, you double your money. ");
	System.out.println("b. If three numbers match, you triple your money. \nc. If none match, you lose your money. ");
	System.out.println("--------------------------------------------------");
	System.out.println();

	
	System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : ");
	String response = sc.nextLine();
	
	if (response.equals ("Yes") || response.equals ("yes") || response.equals ("Y") || response.equals ("y"))
	{
	System.out.print("You have $" + total +". ");
	}
	else if (response.equals("No") || response.equals("no") || response.equals("N") || response.equals("n"))
	{
	System.out.println("Sad to see you go! You still have $" + total + "left. Come again soon! Thanks!");
	}
	else
	{
	while (response.equals ("Yes") == false || response.equals ("yes") == false || response.equals ("Y") == false || response.equals ("y") == false)
	{
	if(response.equals("Yes") || response.equals("yes") || response.equals("Y") || response.equals("y"))
	{	
	System.out.print("You have $" + total +". ");	
	//System.out.print("You have $100. How much would you like to wager? ");
	//amount = sc.nextInt();
	break;
	}
	
	//if (response.equals("No") || response.equals("no") || response.equals("N") || response.equals("n"))
	//{
	//System.out.println("Sad to see you go! You still have $" + total + "left. Come again soon! Thanks!");
	//break;
	//}
	
	System.out.println("That wasn't quite the correct answer. Try again.");
	System.out.println();
	}
	}
	
	while (total > 0)
	{
	int one = rand.nextInt(11);
	int two = rand.nextInt(11);
	int three = rand.nextInt(11);
	
	System.out.print("How much would you like to wager? ");
	amount = sc.nextInt();
	total = 100 - amount;
	
	System.out.println("Great! Let's play!!! \nYour rolls are: \n| " + one + " | " + two + " | " + three + " |");
	
	if (one == two && one == three)
	{
	total = total + amount*3;
	System.out.println("You Won! You're wager has now been doubled! \nYou now have $" + total + ".");	
	}
	else if (one == two || one == three || two == three)
	{
	total = total + amount*2; 
	System.out.println("You won! You're wager has now been doubled! \nYou now have " + total + ".");
	}
	else 
	{
	System.out.println("Didn't win this time, better luck next time! \nYou now have $" + total + ".");
	}
	System.out.println();
	System.out.println("________________________________________________");
	System.out.println();
	if (total <= 0)
	{
		System.out.println("You've run out of money! Thanks for coming! Come back soon!");
		break;
	}
	
	}
	


	}
}