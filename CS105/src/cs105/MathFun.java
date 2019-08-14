package cs105;

import java.util.*;

public class MathFun {

	public static void main(String args[]) 
	{ 
		double a,b,c, sum; 
		double avg; 


		Scanner input = new Scanner(System.in); 

		System.out.print("Enter first number : "); 
		a = input.nextInt(); 

		System.out.print("Enter second number : "); 
		b = input.nextInt(); 
		
		System.out.print("Enter third number : "); 
		c  = input.nextInt();

		/*Calculate sum and average*/
		sum = a+b+c; 
		avg = (double)((a+b+c)/3); 

		System.out.print("Sum : " +sum +"\nAverage : " +avg); 
	} 
}