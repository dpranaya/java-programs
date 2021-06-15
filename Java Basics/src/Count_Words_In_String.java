import java.util.Scanner;

public class Count_Words_In_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		int count=1;
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println("No.of words in String is:"+count);

	}

}
