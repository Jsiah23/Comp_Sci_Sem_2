import java.util.Scanner;
import java.util.Random;

// class Dog{
// String name;
// int age;
// String breed; 

// public void setName(String nameput){
// name = nameput;	
// return;
// }
// }
// class fun{
// int balloons;
// public fun(int x){
// balloons = x;
// }
// }
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
	Random rand = new Random();
	//System.out.println("1 \n12 \n123 \n1234");
	
	
	// System.out.print("Please input one whole number: ");
	// int firstnum = sc.nextInt();
	// System.out.print("Please input a second whole number: ");
	// int secondnum = sc.nextInt();
	
	// if(firstnum > secondnum){
	// System.out.println(firstnum);	
	// }
	// if(firstnum < secondnum){
	// System.out.println(secondnum);
	// }
	// if(firstnum == secondnum){
	// System.out.println("Numbers are equal.");
	// }
	
	// int[] array = new int[10];
	// for(int i = 0; i < array.length ;i++)
	// System.out.println(array[i] = rand.nextInt(100));
	
	// String name = "Juan";
	// int i;
	// for(i = 0; i > 1; i++);
	// System.out.println(name);
	// if(i != 1){
	// System.out.println("Error")	
	// }
	
	// String name1 = "Juan";
	// String name2 = "Juanita";
	// String name3 = "Juanito";
	// System.out.println("Juan" + "name" + name2);
	
	String sentence1 = "Hello World!";
	String sentence2 = "!dloroW olleH";
	
	System.out.println("This is using the methods!");
	System.out.println(toString(sentence1));
	System.out.println();
	System.out.println(toStringCombined(sentence1,sentence2));
		
	
	
	
	
	
	}	
}
