import java.io.*;
import java.util.*;
public class age
{
	public static void main (String[] args)
	{	
	Scanner s=new Scanner(System.in);
    int a;
	a=s.nextInt();
	if(a<=18)
	{
	System.out.println("no voting age");
	}
	else 
	{
	System.out.println("voting age");
	}
	}
}