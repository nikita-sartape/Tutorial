class digitadd
{
  public static void main(String args[])
 {
  int no = 786;
  int sum = 0;
  int digit;
   
  while(no>0)
  {
     digit = no%10;
     sum = sum + digit;
     no = no/10;
  }
  System.out.println("Addition="+sum);
 }
}
     