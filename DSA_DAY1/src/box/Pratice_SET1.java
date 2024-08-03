package box;
import java.util.*;
public class Pratice_SET1 {
	
	public static void LeapYear(int year) {
		
		if ( year % 4 ==0 ||  year %400==0) {
			System.out.println("it is a leap year");
		}
		else {
			System.out.println("not a leap year");
		}
	}
	public static void Addition(int a,int b) {
		int sum =a+b;
		System.out.println("sum of" +a + " and " +b + " is "+sum);
	}
     
	public static void Multiplication(int number) {
		
		for(int i=1;i<10;i++) {
			System.out.println(number + " x " +i + "=" +(number * i));
			
		}
	}
	public static void Hcflcm( int num1,int num2){
		int hcf = 1;
		
		for(int i=1;i<num1 || i<=num2;i++)
		{
			if(num1%i==0 && num2 %i==0)
			{
			hcf=i;	
			}
		}
			int lcm=(num1*num2)/hcf;
			
		System.out.println("hcf of two numbers is "+hcf);
		System.out.println("lcm of two numbers is "+lcm);
		}
	
		
		
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //leap year or not
//		Scanner Sc = new Scanner(System.in);
//		System.out.println("Enter a year");
//		int year=Sc.nextInt();
//		LeapYear(year);
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number a & number b");
//		int a =sc.nextInt();
//		int b=sc.nextInt();
//		Addition(a,b);
		
//		Scanner s1 = new Scanner(System.in);
//		System.out.println("Enter a number ");
//		int number =s1.nextInt();
//		Multiplication(number);
		
//		
		int sum = 0;
		Scanner s3 = new Scanner(System.in);
		String input;
		System.out.print("enter numbers (enter x to stop) ");
		while(true) {
			input=s3.nextLine();
			if(input.equalsIgnoreCase("x")) {
				break;
			}
			
		if (input.matches("-?\\d+")) {
            int number1 = Integer.parseInt(input);
            sum += number1;
		}
		else {
			System.out.println("number is invalid");
		}
		System.out.println(sum);
	}
		
	}
}


