package pkg;
import java.util.Scanner;
import java.util.Random;

public class Lion implements Pet{
int age;
String name;
boolean trained;

public Lion(){
this.name = "Bob";
this.interact();    
}
public Lion(int age){
this.age = age;    
this.interact();
}
public Lion(boolean trained){
this.trained = trained;    
this.interact();    
}
public Lion(String name){
this.name = name;
this.interact();
}
public Lion(String name, boolean trained){
this.name = name;
this.trained = trained; 
this.interact();
}
public Lion(String name, int age, boolean trained){
this.name = name;
this.age = age;
this.trained = trained; 
this.interact();
}
public void interact(){
System.out.println("Roar");    
}
public void trick(){
System.out.println(this.name + " stands on feet and roars!!");    
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