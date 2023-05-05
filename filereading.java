import java.io.*;
import java.util.*;

class filereading
{
   public static void main(String args[])throws Exception
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter File name:: ");
     String f1= sc.nextLine();
     FileInputStream fin= new FileInputStream(f1);
     int ch= fin.read();
     while(ch!=-1)
     {
       System.out.print((char)ch);
       ch=fin.read();
      }
      fin.close();
   }
}  
     