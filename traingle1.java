class traingle1
{
  public static void main(String args[])
 {
   int n =5;
   int cnt=1;
  for(int i=1;i<=n;i++)
 {
     for(int j=1;j<=n-i;j++)
     { 
        System.out.print(" ");
     }
      for(int c=1;c<=i;c++)
     {  
        System.out.print(cnt++);
     }
     System.out.print("\n");
     
     
  }
 }
}
     