import java.util.Scanner;

class starter {
	public static boolean checkPrime(int a ){
	int count = 2;
	while (a % count != 0){
	count = count + 1;	
	{
	if (a % count == 0)
	break;
	return true;
	}
    }
	return false;
	}
	public static int printPrimes(int a){
	int count = 2;	
	while (a % count == 0){
	System.out.println(a);
	count = count + 1;	
	{
	if (a % count != 0)
	a = a - 1;
	}
	break;
    }
	return a;
	}	
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Input a number and we'll print out every prime until that number: ");
	int input = sc.nextInt();
	
	checkPrime(input);
	System.out.println(printPrimes(input));	
		
	}
}
