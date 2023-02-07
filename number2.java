import java.io.*;
import java.util.*;
class numbers2
{
	public static void main (String[] args)
	{
    int a,b;		
	Scanner s=new Scanner(System.in);
    System.out.println("Enter the a number:");
	a=s.nextInt();
	System.out.println("Enter the b number:");
	b=s.nextInt();
	if(a==b)
	{
	System.out.println("equal are number ");
	}
	else if(a!=b)
	{
	System.out.println("number are not equal");
	}
	else if(a<b)
	{
	System.out.println("less than number");
	}
	else if(a<=b)
	{
	System.out.println("less than or equal number");
	}
	else if(a>b)
	{
	System.out.println("greater than number ");
	}
	else if(a>=b)
	{
	System.out.println("greater than or equal number age");
	}
	}
}