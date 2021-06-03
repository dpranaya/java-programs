import java.util.Scanner;

public class Values_Are_3_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=s.nextInt();
		if(a>99 & a<=999)
			System.out.println("value are 3 digit");
		else System.out.println("value is not 3 digit");
	}

}
