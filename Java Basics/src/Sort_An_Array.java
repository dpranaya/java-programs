import java.util.Scanner;

public class Sort_An_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number of elements");
int n= sc.nextInt();
System.out.println("Enter the elements in array");
int a[]=new int[n];

for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();

}

//for(int j=0;j<n;j++)
//{
//System.out.println("\t"+a[j]);
//}
for(int c=0;c<a.length;c++)
{
for(int i=0;i<a.length-1;i++)
{
if(a[i]>a[i+1])
{
int temp=a[i+1];
a[i+1]=a[i];
a[i]=temp;
}
}
}
for(int i=0;i<a.length;i++)
{
System.out.println("Sort of array is "+a[i]);
}
	}
}
