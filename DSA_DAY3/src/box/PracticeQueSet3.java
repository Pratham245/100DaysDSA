package box;
import java.util.*;
public class PracticeQueSet3 {
// public  int MaximumNo(int a,int b , int c) {
//	 int max=a;
//	 if(b>max) {
//		 max=b;
//	 }
//	 if(c>max) {
//		 max=c;
//	 }
//	 return max;
// 
	 
//	 if(a>b && a>c) {
//		 max=a;
//		 System.out.println(a + " is the maximum number");
//	 }
//	 else if (b>a && b>c) {
//		 max=b;
//		 System.out.println(b+ " is the maximum number");
//	 }
//	 else if (c>a && c>b) {
//		 max=c;
//		 System.out.println(c+ " is the maximum number");
//	 }
//	 else if(a==b|| (b==c) || (c==a) ) {
//		 System.out.println("they are equal numbers");
//		 
//	 }
	 
	 
	 
// }
//	public static void evenOrOdd(int n) {
//		if(n<2) {
//			System.out.println("The number" +n+ " is nor even nor odd");
//		}
//		 if(n%2==0) {
//			System.out.println("The number " +n+ " is even Nunber ");
//		}
//		 else {
//			 System.out.println("The number " + n + " is odd number");
//		 }
//	}
//	public static void EligibletoVote(int age) {
//		
//		if(age>=18){
//			System.out.println("you are eligible to vote ");
//		}
//		else {
//			System.out.println("you are not eligible to vote");
//		}
//	}
//	 
//	public static void Circumference() {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter radius of circle");
//		double r=sc.nextDouble();
//		 
//		double ans= (2 * 3.14 *r);
//		      System.out.println("The circumference of circle is"+ans);
//	
//		
//	}
//	public static void Factorial() {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter number");
//		int  num =sc.nextInt();
//		int factorial=1;
//		for(int i=1;i<=num;i++) {
//			 factorial= factorial *i;
//		}
//		System.out.println(factorial);
//	}
	
	public static void  isPalindrome(int n) {
		int reverse=0;
		int originalnumber =n;
		//boolean ispalindrome=false;
		while(n>0) {
			int rem=n%10;
			reverse=reverse * 10 +rem;
			n/=10;
		}
		 if(reverse==originalnumber) {
			 System.out.println("the number is palindrome");
		 }
		 else {
			 System.out.println("Not palindrome");
		 }
	}
	 public static void pythogoreanTriplet(int num1,int num2,int num3) {
		  int lHS=(num1*num1) + (num2*num2);
		  int RHS =(num3*num3);
		  if(lHS==RHS) {
			  System.out.println("They are pythagorean triplets");
		  }
		  else {
			  System.out.println("They are not pythagorean triplets");
		  }
		  
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       Scanner sc=new Scanner(System.in);
//       System.out.println("Enter number A,B and C");
//       int a=sc.nextInt();
//       int b=sc.nextInt();
//       int c=sc.nextInt();
//       PracticeQueSet3 obj= new PracticeQueSet3();
//       obj.MaximumNo(a, b, c);
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number");
//		int number=sc.nextInt();
//		evenOrOdd(54);
		
//		 Scanner sc=new Scanner(System.in);
//         System.out.println("Enter your Name");
//         String name=sc.nextLine();
//		 Scanner sc1=new Scanner(System.in);
//         System.out.println("Enter His/Her age");
//         int num=sc1.nextInt();
//         EligibletoVote(num);
//		Circumference();
		//Factorial();
//		Scanner sc=new Scanner(System.in);
//        System.out.println("Enter number");
//        int num=sc.nextInt();
//        isPalindrome(num);
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value of Num1, Num2 ,Num3");
         int num1=sc.nextInt();
	      int num2=sc.nextInt();
	      int num3=sc.nextInt();
	      pythogoreanTriplet(num1,num2,num3);
	
	}
}
