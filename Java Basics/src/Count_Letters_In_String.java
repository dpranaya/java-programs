import java.util.Scanner;

public class Count_Letters_In_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			count++;
		}
		System.out.println("No.Of Letters in String is:"+count);
	}

}
