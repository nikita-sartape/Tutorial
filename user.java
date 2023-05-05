//username.....

import java.util.*;

class user extends Exception
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter username:: ");
      String username=sc.next();
      
       try
       {
            if(!username.equalsIgnoreCase("admin"))
                throw new user();
            else
                 System.out.println("Correct username");
        }
        catch(user e2)
        {
            System.out.println("Incorrect username");
         }
    }
}

       
    
      