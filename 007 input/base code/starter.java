import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in); 
	
	System.out.println("What is your first name?");
	String name = sc.nextLine();
	System.out.println("What is your age?");
	int age = sc.nextInt();
	System.out.println("What month were you born? (1-12)");
	int number1 = sc.nextInt();
	System.out.println("What day were you born? (1-31)");
	int number2 = sc.nextInt();
	System.out.println("What year were you born?");
	int number3 = sc.nextInt();
	System.out.println("If i hava dollar and two quarters, how much money do I have? (0.0-#)");
	double number4 = sc.nextDouble();
	
	System.out.println("Your name is " + name + " and you were born on " + number1 + "/" + number2 + "/" + number3 + ".");
	System.out.println("You are " + age + " years old!!!");
	System.out.println("You have $" + number4 + " in your wallet.");
	
	
	}
}
