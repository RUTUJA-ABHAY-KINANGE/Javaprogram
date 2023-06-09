/*Aim: Introduce concepts of method overloading, constructor overloading, overriding. 
Program: Write a java program for Method overloading and Constructor overloading. */

//Method overloading: 

import java.io.*; 
public class MethodOverloading  
{   
public static void main(String args[])   
{    
 System.out.println("add() with 2 parameters");    
 System.out.println(add(4, 6));      
 System.out.println("add() with 3 parameters");    
 System.out.println(add(4, 6, 7)); 
 }  
static int add(int a, int b)   
{    
 return a + b;   
}   
static int add(int a, int b, int c)  
{    
 return a + b + c;   
} 
} 


//Constructor overloading: 

public class Student 
{   
//instance variables of the class   int id;   
String name;   
Student()  
{    
System.out.println("this a default constructor");   
}   
Student(int i, String n)  
{    
id = i;    
name = n;   
}  
public static void main(String[] args)   
{   
//object creation    
Student s1 = new Student();    
System.out.println("\nDefault Constructor values:");    
System.out.println("Student Id : "+s1.id + "\nStudent Name : "+s1.name);    
System.out.println("\nParameterized Constructor values: \n");    
Student s2 = new Student(10, "Kalpana");    
System.out.println("Student Id : "+s2.id + "\nStudent Name : "+s2.name);   
} 
} 
 
 