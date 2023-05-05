//wap to accept a name from user and diplay it char by char with  delay of 500 sec 


import java.util.*;
class disply1
{
   public static void main(String args[]) throws Exception
   {
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter name= ");
         String s1=sc.next();
         for(int i=0;i<s1.length();i++)
         {
             char ch=s1.charAt(i);
              System.out.print(ch);
               Thread.sleep(500);
         }
   }
}