import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number to check prime r not");
		int n=sc.nextInt();
		int flag=0;
		
		if(n==0 || n==1)
		{
			System.out.println("It is not prime number");
			
		}
		else
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println("It is not prime number");
				flag=1;break;
			}
			
		}
		
		if(flag==0)
		{
			System.out.println("It is a prime number");
		}
	}

}
