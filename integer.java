import java.io.*;
import java.util.*;
class integer
{
public static void main(String[] args)
{
int a;
Scanner s=new Scanner(System.in);
System.out.println("Enter the integer:");
a=s.nextInt();
if(a%2==0 && a>=2 && a<=5)
	{
	System.out.println("weird");
	}
	else if (a>6 && a<=20)
	{
	System.out.println("weird");
	}
	else if(a<=20)
	{
	System.out.println("not weird");
	}
	}
}