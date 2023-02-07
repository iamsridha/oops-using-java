import java.io.*;
import java.util.*;
class height
{
public static void main(String[] args)
{
int m;
Scanner s=new Scanner(System.in);
System.out.println("Enter the height:");
m=s.nextInt();
if(m>180)
	{
	System.out.println("the person is very tall");
	}
	else if (m>150 && m<=175)
	{
	System.out.println("the person is avg height");
	}
	else 
	{
	System.out.println("the person is dwarf");
	}
	}
}