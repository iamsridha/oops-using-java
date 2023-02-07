import java.io.*;
import java.util.*;
public class positivenumber
{
	public static void main (String[] args)
	{	
	Scanner s=new Scanner(System.in);
    int a;
	a=s.nextInt();
	if(a>0)
	{
	System.out.println("positive");
	}
	else if(a==0)
	{
		System.out.println("0 is netural");
	}
	else 
	{
	System.out.println("negative");
	}
	}
}