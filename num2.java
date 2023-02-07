import java.io.*;
import java.util.*;
public class num2
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
	System.out.println("number are equal");
	}
	if(a!=b)
	{
	System.out.println("number are not equal");
	
				if(a<b)
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
				else
				{
				System.out.println("greater than or equal number age");
				}}
	}
}