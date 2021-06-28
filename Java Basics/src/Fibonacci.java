import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0,b=1;
		
		System.out.println("Enter the Last number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println(a+" "+b);
		
		
		for(int i=0;i<=n;i++)
		{
			int sum =a+b;
			a=b;
			b=sum;
			
			System.out.print(sum+" ");
		}
	}

}
