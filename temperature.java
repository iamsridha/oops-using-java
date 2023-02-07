import java.io.*;
import java.util.*;
class temperature
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int temp;
temp=s.nextInt();
if(temp<=0)
{
System.out.println("Freezing weather");
}
else if(temp>=0 && temp<10)
{
System.out.println("Very Cold weather");
}
else if(temp>=10 && temp<20)
{
System.out.println("Cold weather");
}
else if(temp>=20 && temp<30)
{
System.out.println("normal in temperature");
}
else if(temp>=30 && temp<40)
{
System.out.println("its hot");
}
else if(temp>=40)
{
System.out.println("its very hot");
}
}
}