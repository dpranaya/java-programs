
public class Static_NonStatic_Program {

	static int i=100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=50;
		Static_NonStatic_Program s=new Static_NonStatic_Program();
		s.run();
		System.out.println(i);
		System.out.println(Static_NonStatic_Program.i);
		System.out.println(s.j);
	}
	
	public void run()
	{
		
		System.out.println(j);
	
		System.out.println("run");
		System.out.println(i);
	}
	int j=20;	
	

}
