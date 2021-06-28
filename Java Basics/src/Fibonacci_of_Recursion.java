import java.util.Scanner;

public class Fibonacci_of_Recursion {

	static int a=0,b=1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter the Last number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(a+" "+b);
		
	printFibonacci(n);
	}
	
	 static void printFibonacci(int n)
	{
		while(n>0)
		{   n =a+b;
			a=b;
			b=n;
			System.out.print(n+" ");
			printFibonacci(n-1);
		}
		
	}

}

 
