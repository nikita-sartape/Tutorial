
import java.util.*;
class Box
{
   int height;
   int width;
   int depth;
  
   void get()
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter all values: ");
       height=sc.nextInt();
       width=sc.nextInt();
       depth=sc.nextInt();
    }
    
    int area()
    {
        int volume= height*width*depth;
         return volume;
    }
}
       