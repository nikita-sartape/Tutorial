import java.util.*;
class Boxtest2
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter How many boxes= ");
      int n=sc.nextInt();
      int max=0,index=0;
      Box b[]=new Box[n];
      for(int i=0;i<n;i++)
      {
         b[i]=new Box();
         b[i].get();
         int volume = b[i].area();
         //System.out.println("volume is = " +volume);
         if(max < volume)
         {
             max = volume;
             index=i;
         }
      }
      System.out.println(b[index].height);
       System.out.println(b[index].width);
        System.out.println(b[index].depth);
      
   }
}
