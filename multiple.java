import java.io.*;
import java.util.*;
public class Multiple
{
public static void main(String[] args)
{
int i,sum=2,m1=1;
    Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	i=s.nextInt();
for(i=1;i<=30;i++)
{
m1=i*sum;
}
System.out.println(m1);
}
}