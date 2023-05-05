class npalindrome
{
  public static void main(String args[])
 {
  int no = 121;
  int rev= 0;
  int digit;
  int temp=no;
   
  while(no>0)
  {
     digit = no%10;
     rev= (rev*10) + digit;
     no = no/10;
  }
  if(temp==rev)
  System.out.println("palindrome number="+rev);
  else 
  System.out.println(" given number is not palindrome number");
 }
}
     