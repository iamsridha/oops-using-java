import java.io.*;
import java.util.*;
class largestnumber
{
public static void main(String[] args)
{
int num1,num2,largest;
Scanner s=new Scanner(System.in);
num1=s.nextInt();
System.out.println("enter the first number");
num2=s.nextInt();
System.out.println("enter the second number");
if(num1>num2)
	{
	largest=num1;
	}
	else 
	{
	largest=num2;
	}
	System.out.println("largest=" +largest);
	}
}