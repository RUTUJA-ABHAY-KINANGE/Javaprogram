
import java.util.Scanner; 
public class SimpleCalc
 {  
   public static void main(String[] args)
 {  
 Scanner input=new Scanner(System.in);  
 System.out.println("Enter operand1: "); 
 double a=input.nextDouble();  
 System.out.println("Enter operand2: "); 
 double b=input.nextDouble();  
 System.out.println("Enter operator: "); 
 char op=input.next().charAt(0);   
 switch(op)
 {    
   case '+': double add=a+b;   
   System.out.println("add="+add);  
   break;  
   case '-': double sub=a-b; 
   System.out.println("sub="+sub); 
   break;  
   case '*':double mult=a*b;  
   System.out.println("mult="+mult); 
   break;  
   case '/':double div=a/b;  
   System.out.println("div="+div); 
   break; 
 } 
 } 
} 
 
