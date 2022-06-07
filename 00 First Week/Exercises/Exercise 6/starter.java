import java.util.Scanner;
import java.util.Random;

class starter {
	public static int multiply(int a, int b){
	int x = a;
	int y = b;
	int disp = x * y;
	//int remainder = action;
	//System.out.println(action);
	if (disp % 3 == 0)
	{
	System.out.println(disp);	
	}
	else
	{
	System.out.println("No answer");
	}
	return disp;
	}
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Type in a number: ");
	int firstnum = sc.nextInt();
	System.out.print("Type in a number: ");
	int secondnum = sc.nextInt();
	System.out.println("Method multiply in action..!");
	multiply(firstnum,secondnum);
		
	}
}
