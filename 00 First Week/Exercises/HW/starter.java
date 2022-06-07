import java.util.Scanner; 
class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Please input a whole number: ");
	int num1 = sc.nextInt();
	System.out.println("Please input a second whole number: ");
	int num2 = sc.nextInt();
	
	if (num1 % 2 == 1)			{	
	System.out.println("Your first number is odd. ");
	}
	else 	{
	System.out.println("Your first number is even. ");
	}
	if (num2 % 2 == 1)			{	
	System.out.println("Your second number is odd. ");
	}
	else 	{
	System.out.println("Your second number is even. ");
	}
	
	if ((num1 % 3) == 0)		{
	System.out.println("Your first number is divisible by 3.");
	}
	if ((num1 % 4) == 0)		{
	System.out.println("Your first number is divisible by 4.");
	}
	if ((num1 % 5) == 0)		{
	System.out.println("Your first number is divisible by 5.");
	}
	if ((num1 % 3) != 0 && (num1 % 4) != 0 && (num1 % 5) != 0)			{
	System.out.println("Your first number is not divisible by 3, 4, or 5.");
	}
	
	if ((num2 % 3) == 0)			{
	System.out.println("Your second number is divisible by 3.");
	}
	if ((num2 % 4) == 0)			{
	System.out.println("Your second number is divisible by 4.");
	}
	if ((num2 % 5) == 0)			{
	System.out.println("Your second number is divisible by 5.");
	}
	if ((num2 % 3) != 0 && (num2 % 4) != 0 && (num2 % 5) != 0)			{
	System.out.println("Your second number is not divisible by 3, 4, or 5.");
	}
	}
}