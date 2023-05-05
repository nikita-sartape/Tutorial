import java.util.*;
class Multiple
{
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
     int num;
     System.out.print("Enter the integer value ");
     num=sc.nextInt();
     
     if(num%5==0)
       System.out.print("Given number is multiple of 5");
      else
        System.out.print("Not multiple of 5 ");
  }
}
     