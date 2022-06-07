import pkg.*;
import java.util.Scanner;
import java.util.Random;

class dog{
String name;
int age;
String breed;

public dog(){
name = "Clifford";
age = 3;
breed = "big red dog";
}
public dog(String choose1){
name = choose1;
age = 1;
breed = "dog dog";
}
public dog(String choose1, String choose2){
name = choose1;
breed = choose2;
age = 1;
}
public dog(String choose1, int choose3){
name = choose1; 
breed = "dog dog";
age = choose3;
}
public void setName(String nameput){
name = nameput;
}
public void setAge(int ageput){
age = ageput;
}
public void setBreed(String breedput){
breed = breedput;	
}
public String getName(){
return name;	
}
public int getAge(){
return age; 	
}
public String getBreed(){
return breed;	
}
public boolean isSleeping(){
Random rand = new Random(); 
int fooly = rand.nextInt(2);
if (fooly == 0){
return true;	
}
return false;
}
public void bark(){
System.out.println(name + " bark bark");	
}
}
class starter {
public static void main(String args[]) {
dog x = new dog("Slinky", 8);
dog y = new dog("Rookie", "Poofy");

boolean check1 = x.isSleeping();
if (check1){
System.out.println("It is catching Zzzz");
}	
else {
x.bark();	
}
boolean check2 = y.isSleeping();
if (!check1 && check2 || !check2 && !check1){
y.bark();	
}
}
}
