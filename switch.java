import java.io.*;
import java.util.*;
public class switch
{
public static void main(String[] args)
{
    int a;
    Scanner s=new Scanner(System.in);
	a=s.nextInt();
	switch(a)
	{
	case 1:System.out.println("case 1 excuted");
	break;
	case 2:System.out.println("case 2 excuted");
	break;
	case 3:System.out.println("case 3 excuted");
	break;
	case 4:System.out.println("case 4 excuted");
	break;
	default:System.out.println("wrong choice");
    }
}
}