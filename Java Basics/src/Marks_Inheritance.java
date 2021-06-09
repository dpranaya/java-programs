import java.util.Scanner;
public class Marks_Inheritance {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Maths Marks");
		double m=sc.nextDouble();
		System.out.println("Enter Physics marks");
		double p=sc.nextDouble();
		System.out.println("Enter Chemistry marks");
		double c=sc.nextDouble();

		Results r = new Results();
		r.insert_Data(m, p, c);
		r.display_Total();
		r.pass_R_Fail();

			}
	}

class Details
{

	double maths,physics,chemistry;
	
public void insert_Data(double m,double p,double c)
{
maths=m;
physics=p;
chemistry=c;
}

public void display_Total()
{
double total = maths+physics+chemistry;
System.out.println("Ur Total "+total);
}
	
}



 class Results extends Details
{
	public void pass_R_Fail() {
	if(maths>34 && physics>34 && chemistry>34)
	{
	System.out.println("Pass");	
	}
	else System.out.println("Fail");	
		}
	
	}
