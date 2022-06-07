package pkg;
import java.util.Scanner;
import java.util.Random;

public class Wolf implements Pet{
int age;
String name;
boolean trained;

public Wolf(){
this.name = "Joe";
this.interact();    
}
public Wolf(int age){
this.age = age;    
this.interact();
}
public Wolf(boolean trained){
this.trained = trained;    
this.interact();    
}
public Wolf(String name){
this.name = name;
this.interact();
}
public Wolf(String name, boolean trained){
this.name = name;
this.trained = trained; 
this.interact();
}
public Wolf(String name, int age, boolean trained){
this.name = name;
this.age = age;
this.trained = trained; 
this.interact();
}
public void interact(){
System.out.println("Howl");    
}
public void trick(){
System.out.println(this.name + " howls into the night and paints a silhouette.");    
}
public void setIsTrained(boolean trained){
this.trained = trained;    
}
public boolean getIsTrained(){
return this.trained;    
}
public void setName(String name){
this.name = name;   
}
public String getName(){
return this.name;   
}
public void setAge(int age){
this.age = age;
}
public int getAge(){
return this.age;
}

}