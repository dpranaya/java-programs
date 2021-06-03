
public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int star=1,space=4;
//TODO Auto-generated method stub
		for(int i=1;i<=4;i++)
		{
		for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
			}
		for(int k=1;k<=star;k++)
		{
			System.out.print("*");
		}
		star=star+2;
		space=space-1;
		System.out.println(" ");
		}
		
	}

}
