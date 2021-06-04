import java.util.Scanner;
public class Constructor {

	int length,breadth;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter length value: ");
		int a= sc.nextInt();
		System.out.println("Enter breadth value: ");
		int b= sc.nextInt();
		Constructor c = new Constructor(a,b);
		c.display();
	}
	
	public Constructor(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	public void display()
	{
		int area = length * breadth;
		System.out.println("area is "+area);
	}

}
