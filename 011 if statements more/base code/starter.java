import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Please input your first number: ");
	int one = sc.nextInt();
	System.out.println("Please input your second number: ");
	int two = sc.nextInt();
	
	boolean same = (one == two);
	if (same)
	{
	System.out.println("Your numbers are the same! ");	
	}
	boolean different = (one != two);
	if (different)
	{
	System.out.println("Your numbers are different! ");	
	}
	}
}
