import java.io.*;
import java.util.*;
public class square
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int a,c;
a=s.nextInt();
double b=Math.sqrt(a);
c=(int)b;
if(c==b)
	{
	System.out.println("perfect square");
	}
	else 
	{
	System.out.println("not a perfect square");
	}
}
}
