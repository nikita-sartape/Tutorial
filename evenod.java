class evenod
{
   public static void main(String args[])
   {
         disply d1=new disply();
          disply d2=new disply();
         Thread t1= new Thread(d1);
         Thread t2= new Thread(d2);
          d1.id=1;
          d2.id=2;
          t1.start();
          t2.start();
  }
}