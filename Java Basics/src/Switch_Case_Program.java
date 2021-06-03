import java.util.Scanner;

public class Switch_Case_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=s.nextInt();
		System.out.println("Enter b value");
		int b=s.nextInt();
		System.out.println("Enter calulation process to do");
		String ch=s.next();
		
		switch(ch)
		{
		case "add" :System.out.println(a+b);break;
		case "sub":System.out.println(a-b);break;
		case "multi": System.out.println(a*b);break;
		case "div": System.out.println(a/b);break;
		default : System.out.println("Invalid");
		}

	}

}
