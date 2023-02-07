//three sorted arraya

import java.io.*;
import java.util.*;
public class sorting
{
   public static void main(String[] args)
   {
   ArrayList<integer>common=new ArrayList<integer>();
   int arr1 = {2,4,8};
   int arr2 = {2,3,4,8,10,16};
   int arr3 = {4,8,14,40};
   int X=0,y=0,z=0;
    while(x<arr1.length&&y<arr2.length&&z<arr3.length)
	{
	if(arr1[x]==arr2[y]&&arr2[y]==arr3[z])
	{
	common.add(arr1[x]);
	x++;
	y++;
	z++;
	}
	else if (arr1[x]<arr2[y])
	{
	x++;
	}
	else if(arr2[y]<arr3[z])
	{
	Y++;
	}
	else
	{
	z++;
	System.out.println(common);
	}
   }
	}
}