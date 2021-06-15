import java.util.Scanner;

public class Count_Total_No_Charaters_In_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			count++;
		}
		
		System.out.println("Count of no of characters in String "+count);
	}

}
