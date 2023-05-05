//wap to read a source file name from user and destination file name from user and transfer content(file transfer program copy and paste) with the time factor.
// wapa to read all the numbers from source file(each number on separate line) and write there addition into another file







import java.io.*;
import java.util.*;

public class file_N
{
   public static void main(String args[])throws IOException
   {
     
     String fname,dname;
     int sum=0;
     BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter input file:: ");
     fname=in.readLine();
     System.out.println("Enter output file:: ");
     dname=in.readLine();
     
     DataInputStream input= new DataInputStream(new FileInputStream(fname));
     DataOutputStream output= new DataOutputStream(new FileOutputStream(dname));

     
     while(true)
     {
       String n1=input.readLine();
       if(n1==null)
           break;
       sum+=Integer.parseInt(n1);
      }
      output.writeBytes(Integer.toString(sum));
      System.out.println("Addition Done");
      input.close();

      output.close();
   }
}  
     