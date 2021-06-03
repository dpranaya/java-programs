import java.util.*;
public class If_Else_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter a value");
int a=s.nextInt();
System.out.println("Enter b value");
int b=s.nextInt();
System.out.println("Enter c value");
int c=s.nextInt();

if(a>b && a>c)
	
{System.out.println("a is greater value are "+a);
	}
else if(b>c)
{System.out.println("b is greater value are "+b);}
	
	else if(a==b && b==c)
	{System.out.println("value are same"+a);}
	System.out.println("c is greater value are "+c);

}}
