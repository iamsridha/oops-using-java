import java.util.*;
class pattern
{
public static void main(String args[])
{
int i,j;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the no of row ");
int n=sc.nextInt();

for(i=1;i<=n;i++)
{
if(i==1||i==n)
{
for(j=1;j<=n;j++)
{
System.out.print("@ ");
}
System.out.println(" ");

}

else
{
for(j=1;j<=n-i;j++)
{
System.out.print("  ");

}
System.out.print("#");
System.out.println(" ");
}
}
}
}
