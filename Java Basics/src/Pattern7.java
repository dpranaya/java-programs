
public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	for(int i=4;i>=1;i--)
		for(int i=1;i<=4;i++)
		{
			//for(int j=4;j>=1;j--)
			for(int j=1;j<=4;j++)
			{
			//	if(i>=j)
				if(i<=j)
				{
					System.out.print("*");	
				}
				else System.out.print(" ");
			}
			System.out.println(" ");	
		}
	}

}
