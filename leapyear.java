import java.io.*;
import java.util.*;
public class leapyear
{
public static void main(String[] args)
{
    int leapyear;		
	Scanner s=new Scanner(System.in);
    System.out.println("Enter the leapyear");
	int year =s.nextInt();
	if(year%400==0)
	{
	System.out.println(year+"is a leapyear");
	}
	else if(year%100==0)
	{
	System.out.println(year+"is not a leapyear");
	}
	else if(year%4==0)
	{
	System.out.println(year+"is a leapyear");
	}
	else 
	{
	System.out.println(year+"is not a leapyear");
	}
}
}	