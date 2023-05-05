class nspecial
{
  public static void main(String args[])
 {
  
  int N = 15;
  int no=1;
  
  while(N>0)
  {
      int sum= 0;
      int mul=1,temp=no;
    while(no>0)
    {
     int digit=no%10;
     sum = sum + digit;
     mul = mul * digit;
     no=no/10;
    }
    if(sum==mul)
    {
     System.out.println("special="+temp);
     N--;
    }
    no=temp;
    no++;
    }
  }
}
     
     
       
     
  