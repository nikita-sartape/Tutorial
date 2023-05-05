import java.util.*;
class Attendance
{
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
     int classes_held, classes_attend;
     System.out.print("Enter classes held ");
     classes_held=sc.nextInt();
     System.out.print("Enter classes attend");
     classes_attend=sc.nextInt();

     int percentage = (classes_attend/classes_held) * 100;
      
      if(percentage>=75)
         System.out.print("Student allow to give the exam... ");
      else
          System.out.print("Student not allow to give the exam... ");
   }
}
          
       