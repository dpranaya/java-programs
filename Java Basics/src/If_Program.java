import java.util.Scanner;
public class If_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Sc= new Scanner(System.in);
System.out.println("Enter a value");
int a=Sc.nextInt();
System.out.println("Enter b value");
int b=Sc.nextInt();
System.out.println("Enter c value");
int c=Sc.nextInt();

if(a>b && a>c)
	
{System.out.println("a is greater value are "+a);
	}
if(b>c && b>c)
{System.out.println("b is greater value are "+b);}

if(c>a && c>b)
{
	System.out.println("c is greater value are "+c);
	}
if(a==b && b==c)
{System.out.println("same"+a);}

	}

}
