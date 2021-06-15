import java.util.Scanner;

public class Palindrone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch= s.charAt(i);
			rev=rev+ch;
		}
		
		if(rev.equalsIgnoreCase(s))
		{
			System.out.println("Yes it is Palindrone");
		}
		else
			System.out.println("No it is not a Palindrone");
	}

}
