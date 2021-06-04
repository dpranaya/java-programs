
public class Simple_Interest {

	double amount,principle_balance,Annual_interest_rate,time_years;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simple_Interest s1,s2,s3;
		s1=new Simple_Interest();
		s2=new Simple_Interest(10,20);
		s3=new Simple_Interest(20,30,4.5);
		s1.put();s2.put();s3.put();
		
	}
	
	public Simple_Interest()
	{
		principle_balance=100;
		Annual_interest_rate=30;
		time_years=30;
	}
	
	public Simple_Interest(double prin,double rate)
	{
		principle_balance=prin;
		Annual_interest_rate=rate;
		time_years=30;
	}
	
	public Simple_Interest(double prin,double time,double rate)
	{
		principle_balance=prin;
		Annual_interest_rate=rate;
		time_years=time;
	}
	
	
	
	public void put()
	{
		amount= (principle_balance*Annual_interest_rate*time_years)/100;
		System.out.println("Total amount of Simple Interest is "+amount);
	}
	

}
