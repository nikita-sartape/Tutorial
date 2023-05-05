class leadzero
{
   public static void main(String args[])
   {
      int a[]={12,0,6,0,8,14,0,17};
      int j=0;
      
     
      
     
      for(int i=0;i<a.length;i++)
      {
           int no= a[i];
           
           if(no!=0){
            a[j]=no;
            j++;          
          }
         
        
     }
     while(j<a.length){
      a[j]=0;
      j++;
     }
    for(j=0;j<a.length;j++)
     System.out.println(a[j]);
 }
}