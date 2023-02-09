import java.io.*;
import java.util.*;
public class convert
{
public static void main(String[] args)
{
int sum=0;
int sec=60;
Scanner s=new Scanner(System.in);
System.out.println("Enter the minutes");
int a=s.nextInt();
sum=a*sec;
System.out.println("min is convert into sec ="+sum);
}
}