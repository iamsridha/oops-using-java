import java.io.*;
import java.util.*;
class fibunoccisum {
public static void main (String[] args){
Scanner s=new Scanner(System.in);
System.out.println("enter the range:");
int n=s.nextInt();
int sum=0;
int a=0;int b=1;
for(int i=1;i<=n;i++)
{
int c=a+b;
a=b;
b=c;
System.out.println(c);
if (c%2==0)
sum=sum+c;
}
}}