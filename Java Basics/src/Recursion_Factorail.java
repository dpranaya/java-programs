import java.util.Scanner;

public class Recursion_Factorail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fact=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number for Factorial");
		int n=sc.nextInt();
		
		fact=printFactorail(n);
		System.out.println("factorial is "+fact);
	}
	
	public static int printFactorail(int n)
	{
		
		
		if(n==0)
		return 1;
		else 
			return (n*printFactorail(n-1));
			
	
	}

}
