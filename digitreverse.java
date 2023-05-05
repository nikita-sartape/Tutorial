class digitreverse
{
  public static void main(String args[])
 {
  int no = 786;
  int rev= 0;
  int digit;
   
  while(no>0)
  {
     digit = no%10;
     rev= (rev*10) + digit;
     no = no/10;
  }
  System.out.println("reverse number="+rev);
 }
}
     