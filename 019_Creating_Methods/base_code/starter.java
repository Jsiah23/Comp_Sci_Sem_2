import java.util.Scanner;
import java.util.Random;

class starter {
	public static String toStringCombined(String a, String b){
	String rep = a + " " + b;
	return rep;
	}
	public static String toString(String a){
	String rep2 = a;
	return rep2;
	}
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Write a sentence! ");
	String word1 = sc.nextLine();
	System.out.println("Write a sentence! ");
	String word2 = sc.nextLine();
	System.out.println();
	
	System.out.println("This is using the methods!");
	System.out.println(toString(word1));
	System.out.println(toStringCombined(word1,word2));
		
	}
}
