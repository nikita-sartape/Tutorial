//write a program to display nth element of fiboncii series

//RECURSION:-repeat same operation, reduces complexity, A function call itself is called recursion. 

class fiborec
{
   public static void main(String args[])
   {
      int total=9;
      
      //for (int pos=1;pos<=total;pos++)
      {
       int val = fibo(8);
       System.out.print(val + " ");
      }
  }
  public static int fibo(int pos)
  {
      if(pos==1 || pos==2)
      {
           return 1;
      }
      else 
      {
          return fibo(pos-1) + fibo(pos-2);
       }
 }
}