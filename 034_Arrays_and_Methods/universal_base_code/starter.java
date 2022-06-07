import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static int[] toStringArray(int[] array){
	return array;
}
	public static int 
	public static int[] getArrayAverage(int[] array){
	int i;
	int min = 1000;
	i = 0;
	//array = new int[100];
	while(i < array.length){
	if(array[i] < min)
	{
	min = array[i];
	}
	i ++;
	}
	System.out.println("The minimum of 100 random numbers is: " + min);
	
	int max = 1;
	i = 0;
	while(i < array.length){
	if(array[i] > max)	
	{
	max = array[i];	
	}
	i ++;
	}
	System.out.println("The maximum of 100 random numbers is: " + max);
	
	int avg = 0;
	int total = 0;
	i = 0;
	while(i < array.length){
	total = total + array[i];
	{
	avg = total / array.length;	
	}
	i ++;
	}
	System.out.println("The average of 100 random numbers is: " + avg);	
	return array;
	}
	public static void main(String args[]) {
	Random rand = new Random();
	int[] array = new int[100];
	int i;
	for(i = 0; i < array.length; i ++){
	array[i] = rand.nextInt(99) + 1;
	System.out.println(array[i]);
	}
	toStringArray(array);
	getArrayAverage(array);
	


		
	}
}
