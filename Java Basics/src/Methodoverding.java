
public class Methodoverding {
	
	public static int add(int a,int b)
	{
		int c= a+b;
		return c;
	}
	
	public static double add(double a,double b)
	{
		double c= a+b;
		return c;
	}
	
	public static String add(String a,String b)
	{
		String c= a+b;
		return c;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(add(10,20));
     System.out.println(add(10.98,20.00));
     System.out.println(add("method","overloading"));
	}

}
