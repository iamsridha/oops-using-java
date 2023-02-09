import java.io.*;
import java.util.*;
public class convert1
{
public static void main(String[] args)
{
int sum=0;
int sec=3600;
Scanner s=new Scanner(System.in);
System.out.println("Enter the hours");
int a=s.nextInt();
sum=a*sec;
System.out.println("hours is convert into sec ="+sum);
}
}