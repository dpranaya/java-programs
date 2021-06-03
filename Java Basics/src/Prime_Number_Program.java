import java.util.Scanner;

public class Prime_Number_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=s.nextInt();
		boolean flag= true;
		
		for(int i=2; i<=a/2;i++)
		{
			if(a%i==0)
			{
				flag= false;break;
			}
		}
		
		if(flag==true)
		{
			System.out.println("yes it is a prime number and number is "+a);
			
		}
		else
			System.out.println("it is not a prime number");
	}

}
