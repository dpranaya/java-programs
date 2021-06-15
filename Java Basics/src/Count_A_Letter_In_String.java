import java.util.Scanner;
public class Count_A_Letter_In_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		s= s.toUpperCase();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='A')
			{
				count++;
			}
		}
		System.out.println("No.of 'a' in Sentence "+count);
	}

}
