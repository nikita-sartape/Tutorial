//wap to print even no. between 1 to 100 and odd no. between 100 to 200 using two threads.

class evenodd
{
   public static void main(String args[])
   {
      display d1 = new display();
      display d2 = new display();
      d1.id=1;
      d2.id=2;
      d1.start();
      d2.start();
   }
}
