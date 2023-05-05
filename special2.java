//wap to find given no.is special or not as per given requirement.

// 2025=20+25=45=45.45=2025

import java.util.*;
class special2
{
  public static void main(String args[])
 {
   int no=2025;
   String s1=no+"";
   int len= s1.length();
   if(len%2==1)
   {
      System.out.println("Invalid number");
   }
  
   else
   {
     String p1= s1.substring(0,len/2);
     String p2= s1.substring(len/2,len);
     int a= Integer.parseInt(p1);
     int b= Integer.parseInt(p2);
     int c= a+b;
     c= c*c;
     if(no==c)
       System.out.println("special number");
     else
       System.out.println("Not");
    }
}
}
      
   
       