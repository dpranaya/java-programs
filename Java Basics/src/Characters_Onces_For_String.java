import java.util.Scanner;

public class Characters_Onces_For_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		String r="";
		//int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(r.indexOf(ch)==-1)
			{
				r=r+ch;
			}
			
		}
		System.out.println("Letters of String "+r);
		
	}

}
