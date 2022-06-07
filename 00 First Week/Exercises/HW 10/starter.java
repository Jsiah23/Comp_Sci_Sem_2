import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Random rand = new Random();
	int[] array;
	
	System.out.println("These are the 20 numbers");
	array = new int[20];
	int i;
	for(i = 0; i < array.length; i ++){
	array[i] = rand.nextInt(10) + 1;	
	System.out.print(array[i] + " ");
	}
	System.out.println();
	System.out.println("-------------------------------------------------");
	int target = rand.nextInt(10) + 1; 
	System.out.println("The random number to look for is " + target);
	i = 0;
	int sum = 0;
	while(i < array.length){
	if(array[i] == target)
	{
	sum = sum + 1;	
	System.out.println("Duplicate found at index " + i);	
	}
	i ++;
	}
	
	System.out.println("Total number of duplicates for " + target + " is " + sum);
	System.out.println("--------------------------------------------------");
	
	}
}
