package box;
import java.util.*;
public class PracticeSet2 {
	public static void Evenodd(int number) {
		if(number<2) {
	    	  System.out.println("nor odd nor even"); //Write a program to print whether a number is even or odd, also take input from the user.
	      }
	      if(number%2==0) {
	    	  System.out.println("The number " + number + " is even number");
	      }
	      else {
	         System.out.println("it is a odd number");
	      }
	}
	
	public static void Name(String str) {   //Take name as input and print a greeting message for that particular name.
		
		Scanner s1=new Scanner(System.in);
	      System.out.println("enter your name");
	      String name =s1.nextLine();
	      System.out.println("Hello " +name + " good morning have a nice day. ");
	}
       
	public static void Simpleintrest(int principal,int time,int rate) {  //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
		
		Scanner s2=new Scanner(System.in);
      System.out.println("enter principle");
      int p=s2.nextInt();
      System.out.println("enter time");
      int t=s2.nextInt();
      System.out.println("enter rate");
      int r=s2.nextInt();
         
          int si=(p*r*t)/100;
          System.out.println("Simple intrest is:"+si);
	}
	
	public static void Calculation(int a,int b) {  //Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");	
		double num1=sc.nextDouble();
	    
		System.out.println("enter a operator(select +,-,*,%):" );
		char operator=sc.next().charAt(0);
		
		
		Scanner sv=new Scanner(System.in);
		System.out.println("enter second number");	
		double num2=sc.nextDouble();
		double result=0;
		boolean continuerunning=false;
		while(continuerunning) {
		if(operator=='+') 
		{
			result=num1+num2;
		}
			if(operator=='-') 
			{
		      result=num1-num2;
			}
				if(operator=='*')
				{
					result =num1*num2;
				}
					if(operator=='%')
					{
						result=num1+num2;
					}
					if(operator=='x' || operator =='X') {
						System.out.println("exiting the program");
						continuerunning=false;
						break;
					} 
					else {
						System.out.println("invalid operator");
					}
					
					System.out.println(result);
				}
	}
public static void LargestNumber(int number1,int number2) {  //Take 2 numbers as input and print the largest number.
	
     if(number1>number2) {
		
    	 System.out.println(number1+" is greater Number");
     }
     else if (number2 > number1)
     {
    	 System.out.println(number2+ " is greater Number");
     }
	
}
	public static void CurrencyConverter(int Dollar) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of Dollars");
		int a=sc.nextInt();
		double result=0;
		double onedollar=83.72;
		for(int i=1;i<=a;i++) {
			result=onedollar*i;
		}
		System.out.println(result+ " rupees");
	}
	public static void Fibonacci(int n) {
		int num1=0;
		int num2=1;
		System.out.println(+num1+ " " +num2+ " ");
		int nextterm=0;
		
		for(int i=0;i<n;i++) {
			 nextterm =num1 + num2;
			num1=num2; 
			num2=nextterm;//0,1,1,2,3,5,8,13
		
		System.out.print(nextterm+ " ," );
		}
	}
	public static String palindrome(String s) {
		char[]arr=s.toCharArray();
		
		int start=0;
		int end= s.length() -1;
		int nextterm=0;
		while(start<end){
			 nextterm=start+end;
			 start=end;
			 end=nextterm; 
			 
			 start++;
			 end--;
			 
		}
		System.out.println("reversed string is"+nextterm);
	
	return new String(s);
}
	
	public static void greet(String naam) {
		System.out.println(naam);
	}
}
