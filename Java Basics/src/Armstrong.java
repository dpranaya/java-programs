import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int temp=n;
		int r=0,rev=0;
		while(n>0)
		{
			r=n%10;
			rev= rev+(r*r*r);
			n=n/10;
			//System.out.println(rev);
		}
		
		//System.out.println(rev);
		
		if(temp==rev)
		{
			System.out.println("Given number is Armstrong");
		}
		
		else System.out.println("Given number is not Armstrong");
		
	}

}
