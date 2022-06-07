import java.util.Scanner;

class starter {
	public static int fact(int counter){
	System.out.println("Please input a number. ");
	int num = sc.nextInt();
	
	int counter = num;
	int bob = counter - 1;
	while (true)
	{
	System.out.println(counter);
	counter = counter * bob;
	
	if (bob == 1)
	{
	return counter;	
	}
	bob = bob - 1;
	}
	}
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	
	int counter = sc.nextInt();
	
	int answer = fact(counter);
	System.out.println(answer);
	// System.out.println("Please input a number. ");
	// int num = sc.nextInt();
	
	// int counter = num;
	// int bob = counter - 1;
	// while (true)
	// {
	// System.out.println(counter);
	// counter = counter * bob;
	
	// if (bob == 1)
	// {
	// break;	
	// }
	// bob = bob - 1;
	// }
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please input a number. ");
	int num = sc.nextInt();
	
	int counter = num;
	int bob = counter - 1;
	while (true)
	{
	System.out.println(counter);
	counter = counter * bob;
	
	if (bob == 1)
	{
	break;	
	}
	bob = bob - 1;
	}
	
	
	
	
	}
}
