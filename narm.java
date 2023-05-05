class narm
{
  public static void main(String args[])
 {
  
  int N = 15;
  int no=1;
  
  while(N>0)
  {
      String s1= no+"";
      int len=s1.length();
      int sum= 0;
      int temp=no;
    while(no>0)
    {
     int digit=no%10;
     sum += Math.pow(digit,len);
     no=no/10;
    }
    if(sum==temp)
    {
     System.out.println("Armstrong="+temp);
     N--;
    }
    no=temp;
    no++;
    }
  }
}