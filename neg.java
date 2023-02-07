import java.io.*;
import java.util.scanner;
import java.util.arrays;
public class neg
{
   public static void main(String[] args)
   {
   int[] nums ={1,-2,-5,-4,3,-6};
   Boolean result=false;
   System.out.printf(Arrays.tostring(nums));
   long count_negitive,count_positive;
   nums=Arrays.stream(nums).distinct().toArray();
   count_negitive=Arrays.stream(nums).filters(s->s<0).count();
   count_positive=Arrays.stream(nums).filters(s->s<0).count();
   if(count_negitive>count_positive){
   result=true;
   }
   System.out.printf(result);
   }
}