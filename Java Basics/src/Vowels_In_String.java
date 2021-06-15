import java.util.Scanner;

public class Vowels_In_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		s=s.toLowerCase();
		int count=0;
		int cons=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				count++;
				System.out.println(s.charAt(i));
				
			}

 cons++;
			//System.out.println(s.charAt(i));
			
		}
		
		System.out.println("Count of vowels are: "+count);
		System.out.println("Constant are: "+cons);
	}

}
