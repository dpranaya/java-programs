import java.util.Arrays;
import java.util.Scanner;

public class Two_String_Anagram {

	public static void main(String[] args) {
		
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter a first String");
				String s1=sc.nextLine();
				s1=s1.toLowerCase();
				System.out.println("Enter a second String");
				String s2=sc.nextLine();
				s2=s2.toLowerCase();
			
				if(s1.length() != s2.length())
				{
					System.out.println("Not Anagram");
				}
				else
				{
					char[] ch1 =s1.toCharArray();
					char[] ch2=s2.toCharArray();
					
					Arrays.sort(ch1);
					Arrays.sort(ch2);
				/*	for(int i=0;i<ch1.length;i++)
					{
						if(ch1[i]>ch1[i+1])
						{
							char temp = ch1[i];
							ch1[i]=ch1[i+1];
							ch1[i+1]= temp;
							
						}
					}
					
					for(int i=0;i<ch2.length;i++)
					{
						if(ch2[i]>ch2[i+1])
						{
							char temp = ch2[i];
							ch2[i]=ch2[i+1];
							ch2[i+1]= temp;
							
						}
					}*/
					if(Arrays.equals(ch1,ch2)== true)
					{
						System.out.println("Anagram");
					}
					else
					{
						System.out.println("Not Anagram");
					}
				}
					
	}

}
