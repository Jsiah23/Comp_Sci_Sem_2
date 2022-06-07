import java.util.Scanner; 
import java.util.Random;
class starter {
	public static int multiply(int a, int b){
	int done = a * b;	
	return done;
	}
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);	
	System.out.println("Type in a number: ");	
	int first = sc.nextInt();
	System.out.println("Type in another number: ");
	int second = sc.nextInt();
	System.out.println();
	System.out.println(multiply(first, second));
		
	// Scanner sc = new Scanner(System.in);
	// System.out.print("Input your favorite fruit: ");
	// String fruit = sc.nextLine();
	
	// if (fruit.equals ("mango"))
	// {
	// System.out.println("Good choice! ");
	// }
	// else if (fruit.equals ("Mango"))
	// {
	// System.out.println("Good choice! ");
	// }
	// else 
	// {
	// System.out.println("Bad choice. Eat you sum Mango. ");	
	// }
	
	// Scanner sc = new Scanner(System.in);
	// System.out.println("First Number: ");
	// int num1 = sc.nextInt(); 
	// System.out.println("Second number (decimal): "); 
	// double num2 = sc.nextDouble();
	// double answer; 
	// answer = Math.pow(num2, num1);
	// System.out.print(num2 + " to the " + num1 + " power, is ");
	// System.out.println(answer);
	
	// Random rand = new Random();
	// int num = rand.nextInt(300); 
	// System.out.println(num);
	
	// Random rand = new Random();
	// int num1 = rand.nextInt(20) + 31;
	// System.out.println(num1);
	
	// Random rand = new Random(); 
	// double num2 = rand.nextDouble() + 11.2;
	// System.out.println(num2);
	
	// Scanner sc = new Scanner(System.in);
	
	// System.out.println("Pick a number 1 - 4. ");
	// int one = sc.nextInt();
	// int two = 2;
	// int three = 3; 
	// if (one > two && one > three)
	// {
	// System.out.println("Theodre Rooeelt Under Egg. ");	
	// }
	// else if (one < two && one < three)
	// {
	// System.out.println("Father Acorn Larry Egg. ");
	// }
	}
	}
