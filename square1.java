import java.io.*;
import java.util.*;
public class square1
{
    public static void main(String[] args) 
    {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter number:");        
	int n=s.nextInt();
	int i;
	int sum=0;
	for(i=0;i<=n;i++)
	{
	int j=i*i;
	sum=j+sum;
	}
	System.out.println(sum);
	}
}	