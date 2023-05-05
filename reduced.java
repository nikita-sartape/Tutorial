class reduced
{
  public static void main(String args[])
  {
      int no=183;
      int sum=0;
      int rem;
  
      while(no!=0)
      {
         rem=no%10;
         sum=sum+rem;
         no=no/10;
      }
      if(sum>0 && sum<=9)
      {
         System.out.println("Reduced single digit number= " +sum);
      }
        
      else
      {
         no = sum;
         sum=0;
         System.out.println("Not a single digit number");
      }
  }
}
       
     