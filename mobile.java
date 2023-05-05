//mobile number validation.....

import java.util.*;

class mobile extends Exception
{
   public static void main(String args[])
   {
      int length=10;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Mobile No.:: ");
      String mobileNo=sc.next();
      
      
       try
       {
            if(mobileNo.length()!=length)
                throw new mobile();
            else
                 System.out.println("Correct mobileno.");
        }
        catch(mobile e3)
        {
            System.out.println("Incorrect mobile number");
         }
    }
}

       
    
      