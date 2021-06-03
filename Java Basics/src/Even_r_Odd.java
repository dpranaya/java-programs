import java.util.Scanner;

public class Even_r_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=s.nextInt();
		if(a%2==0)
			System.out.println(a+" is Even number");
		else System.out.println(a+" is a Odd Number");
	}

}
