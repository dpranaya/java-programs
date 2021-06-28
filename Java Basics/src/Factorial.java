import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number for Factorial");
		int n=sc.nextInt();
		int fact=1;
		
		if(n>0)
		{
		for(int i=0;i<=n;i++)
		{
			fact=n*fact;//fact=fact*i;
			n--;
			
		}
	System.out.println("Factorial value is "+fact);
		}
		else 	System.out.println("Number should be greater then 0");
	}

}
