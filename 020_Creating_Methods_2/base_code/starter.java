import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int a, int b){
	int count = 0;
	int total = 1;
	while (count < b){
	total = a * total; 
	count = count + 1;
	}	
	return total;
	}
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your base number? ");
	int base = sc.nextInt();
	System.out.println("What is you exponent number? ");
	int exponent = sc.nextInt();
	
	System.out.print("Your answer is: ");
	System.out.println(pow(base,exponent));

	}
}
