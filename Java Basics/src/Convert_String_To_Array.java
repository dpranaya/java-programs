import java.util.Scanner;

public class Convert_String_To_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a first String");
		String s1=sc.nextLine();
		s1=s1.toLowerCase();
		
		char[] ch1 =s1.toCharArray();
		
		for(int i=0;i<ch1.length;i++)
		{
			System.out.println(ch1[i]);}
		
		
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]<ch1[i+1])
			{
				char temp = ch1[i];
				ch1[i]=ch1[i+1];
				ch1[i+1]= temp;
				
			}
		}
		
		for(int j=0;j<ch1.length;j++)
		{
			System.out.println(ch1[j]);
		}
		
		
	}

}
