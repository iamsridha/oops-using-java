import java.io.*;
import java.util.*;
public class transpose
{
   public static void main(String[] args)
   {
   int original[][]={{1,3,4},{2,4,3},{3,4,5}};
   int trans[][]=new int[3][3];
   for(int i=0;i<3;i++)
   {
   for(int j=0;j<3;j++){
   trans[i][j]=original[j][i];
   }
   }
   System.out.println("matrix");
   }
   System.out.println();
   for(int i=0;i<3;i++)
   {
   for(int j=0;j<3;j++){
   System.out.println(original[j][i]+"  ");
   }
   System.out.println();
   }
   
   System.out.println(transpose[i][j]+"  ");
   for(int i=0;i<3;i++)
   {
   for(int j=0;j<3;j++){
   }
   System.out.println(trans[i][j]+" ");
   }
   System.out.println();
}