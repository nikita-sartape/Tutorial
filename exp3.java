//user define exception
import java.util.*;
 
class exp3 extends Exception
{
    public static void main(String args[])
    {
      
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age= ");
        int a=sc.nextInt();
        try
        {
          if(a<=0)
             throw new exp3();
           else
              System.out.println("valid age");
         }
        catch(exp3 e1)
        {
          System.out.println("Invalid age");
        }
  }
}