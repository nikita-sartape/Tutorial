//write a program to display fibonnaci series as per given input values
// 1 1 2 3 5 8........
 

class fibo1
{
  public static void main(String args[])
 {
   int n=9;
  int a=1,b=1;
  int c=a+b;
  System.out.print(a+" "+b);
  
  for(int i=2;i<n;i++)
  {
    System.out.print(" "+c);
     a=b;
     b=c;
     c=a+b;
 }
}
}