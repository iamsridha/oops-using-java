import java.io.*;
import java.util.*;
class sumthevalue
{
public static void main(String[] args)
{
    int n,q;		
	Scanner s=new Scanner(System.in);
    System.out.println("Enter the n number=");
	n=s.nextInt();
	System.out.println("Enter the q number=");
	q=s.nextInt();
	int a=(n+(n-1)+(n-2)+(n-3)+(n-4)+(n-5));
	int b=(n*(n-1)*(n-2)*(n-3)*(n-4)*(n-5));
	if(q==1)
	{
	System.out.println(a);
	}
	else
	{
	System.out.println(b);
	}
}
}	