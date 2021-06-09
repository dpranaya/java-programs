
public class Overriding_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Myntra m = new 	Myntra();
		m.logo();
		m.items();
		
		FilpKart f=new FilpKart();
		f.logo();
		f.items();
		
	}

}

 class Display{
	public void logo()
	{
		System.out.println("Some Logo");
	}
	
	public void items()
	{
		System.out.println("As per price");
	}
	
}

class Myntra extends Display{
	public void logo()
	{
		
		super.items();
		System.out.println("Myntra Logo");
	}
	
	public void items()
	{
		super.logo();
		System.out.println("As per date");
	}
	
}

class FilpKart extends Display
{
	public void logo()
	{
		System.out.println("FilpKart Logo");
	}
	
	public void items()
	{
		System.out.println("based on popularity");
	}
}
