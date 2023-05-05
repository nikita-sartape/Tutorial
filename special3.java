import java.util.*;
class special3
{
  public static void main(String args[])
 {
   System.out.println("special numbers between 1 to 10000 are: ");
   for(int i=1;i<=10000;i++)
   {  
     
     String s1=i+"";
     int len= s1.length();
     if(len%2==0)
     {
       String p1= s1.substring(0,len/2);
       String p2= s1.substring(len/2,len);
       int a= Integer.parseInt(p1);
       int b= Integer.parseInt(p2);
       int c= a+b;
        c= c*c;
        if(i==c)
          System.out.println("special number= "+i);
       
       
      }
  
     
     }
   }
 }
