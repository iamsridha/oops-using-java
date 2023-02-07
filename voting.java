import java.io.*;
import java.util.*;
public class voting
{
	public static void main (String[] args)
	{
    int a;		
	Scanner s=new Scanner(System.in);
    System.out.println("Enter the age:");
	a=s.nextInt();
	if(a==18)
	{
	System.out.println("equal voting age");
	}
	else if(a!=18)
	{
	System.out.println("not voting age");
	}
	else if(a>18)
	{
	System.out.println("greater than voting age");
	}
	else if(a<18)
	{
	System.out.println("less than voting age");
	}
	else if(a>=18)
	{
	System.out.println("greater than or equal voting age");
	}
	else if(a<=18)
	{
	System.out.println("less than or equalvoting age");
	}
	}
}