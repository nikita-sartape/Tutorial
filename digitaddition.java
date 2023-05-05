class digitaddition
{
   public static void main(String args[])
   {
      int a[]={12,78,94,64,19,62};
      int max=0,ans=0;

      for(int i=0;i<a.length;i++)
      {
           int no= a[i];
           int sum=0;
           
           while(no>0)
           {  
              int digit=no%10;
               sum=sum +digit;
               no=no/10;
           }
           if(sum>max){
            max=sum;
            ans=a[i];
            
          }
     }
     System.out.println("result= " +ans);
 }
}