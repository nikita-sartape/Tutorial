//try.....catch block
import java.util.*;
 
class exp1
{
    public static void main(String args[])
    {
        int a[]={10,20,30};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter index= ");
        int i=sc.nextInt();
        try
        {
          System.out.println(a[i]);
         }
        catch(Exception e)
        {
          System.out.println("Invalid index");
        }
  }
}