import java.util.Scanner;
class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Please enter your first number: ");
	int one = sc.nextInt();
	System.out.print("Please enter your second number: ");
	int two = sc.nextInt();
	System.out.print("Please enter your third number: ");
	int three = sc.nextInt();
	
	boolean largeint = (one > two && one > three);
	if (largeint)
	{
	System.out.println("Your first number is the largest of the three!");
	System.out.println("The number was " + one + ".");
	}
	boolean largeint2 = (two > one && two > three);
	if (largeint2)
	{
	System.out.println("Your second number is the largest of the three!");	
	System.out.println("The number was " + two + ".");
	}
	boolean largeint3 = (three > one && three > two);
	if (largeint3)
	{
	System.out.println("Your third number is the largest of the three!");
	System.out.println("The number was " + three + ".");
	}	
	
	boolean smallint = (one < two && one < three);
	if (smallint)
	{
	System.out.println("Your first number is the smallest of the three!");
	System.out.println("The number was " + one + ".");
	}
	boolean smallint2 = (two < one && two < three);
	if (smallint2)
	{
	System.out.println("Your second number is the smallest of the three!");	
	System.out.println("The number was " + two + ".");
	}
	boolean smallint3 = (three < one && three < two);
	if (smallint3)
	{
	System.out.println("Your third number is the smallest of the three!");
	System.out.println("The number was " + three + ".");
	}	
	}
}
