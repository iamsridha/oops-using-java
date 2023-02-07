import java.io.*;
import java.util.*;
public class mark
{
public static void main(String[] args)
{
    int r,String,c,p,ca;		
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Student name");
	String name=s.nextLine();
    System.out.println("Enter the roll number");
	r=s.nextInt();
    System.out.println("Enter the physics mark");
	p=s.nextInt();
    System.out.println("Enter the chemistry mark");
	c=s.nextInt();
    System.out.println("Enter the computer application mark");
	ca=s.nextInt();
	int Total=p+c+ca;
	double avg=Total/3;
	System.out.println("Total mark=" +Total);
	System.out.println("avgerage=" +avg);
}
}	