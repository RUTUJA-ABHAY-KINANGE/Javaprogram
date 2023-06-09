/*Program: Write a java program that prints all real solutions to the quadratic
equation ax2+bx+c=0. Read in a, b, c and use the quadratic formula.*/



import java.util.Scanner;
public class Quadratic_Scanner {  
public static void main(String[] Strings)   sss
  {  
        Scanner input = new Scanner(System.in);  
 	System.out.print("Enter the value of a: ");  
 	double a = input.nextDouble();  
	System.out.print("Enter the value of b: "); 
 	double b = input.nextDouble(); 
	System.out.print("Enter the value of c: "); 
	double c = input.nextDouble();  
 	double d= b * b - 4.0 * a * c; 
	 if (d> 0.0)  
 	{ 
            double r1 = (-b + Math.sqrt(d)) / (2 * a);  
 	    double r2 = (-b - Math.sqrt(d)) / (2 * a);  
 	    System.out.println("The roots are Real and Disctict.  \nRoot1=" + r1 + " \nRoot2= " + r2);  
  	}
        else if (d == 0.0)
       {
            double r1 = -b / (2.0 * a);
            System.out.println("The roots are Real and Equal.\n Root1= " + r1+"\n Root2="+r1);
       }
	else
      {
            System.out.println("Roots are not real (Immaginary)");
      }
 }
}
