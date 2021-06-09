
import java.util.Scanner;
public class Sum_Of_Odd_and_Even_of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the array size");
int n= sc.nextInt();
int a[]=new int[n];
int sum_of_even=0,sum_of_odd=0,count_of_even=0,count_of_odd=0;
System.out.println("Enter the numbers in array");
for(int x=0;x<n;x++)
{
	 a[x]=sc.nextInt();
}

for (int x=0; x<n; x++)   
{  
System.out.println(a[x]);  
}

for(int i=0;i<a.length;i++)
{
if(a[i]%2==0)
{
	sum_of_even = sum_of_even+a[i];
	count_of_even++;

}
else 
{
	sum_of_odd = sum_of_odd+a[i];
	count_of_odd++;
}


}
System.out.println("sum_of_even "+sum_of_even);
System.out.println("count_of_even "+count_of_even);

System.out.println("sum_of_odd "+sum_of_odd);
System.out.println("count_of_odd "+count_of_odd);

	}

}
