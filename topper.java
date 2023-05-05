import java.util.*;
class topper
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter How many students are there= ");
      int n=sc.nextInt();
      int max=0,index=0;
      student b[]=new student[n];
      for(int i=0;i<n;i++)
      {
         b[i]=new student();
         b[i].get();
         int percentage = b[i].calculate();
         //System.out.println("volume is = " +volume);
         if(percentage>max)
         {
             max = percentage;
             index=i;
         }
      }
     System.out.println(b[index].rollno);
     System.out.println(b[index].name);
      System.out.println(b[index].oops);
       System.out.println(b[index].dbms);
        System.out.println(b[index].cns);
      
   }
}