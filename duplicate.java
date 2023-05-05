import java.util.Arrays;
class duplicate
{
  public static void main(String args[])
 {
  int a[]={1,1,2,3,3};
    
  
  
  
  for(int i=0,j=i+1;i<a.length && j<a.length;)
  {   
      if(a[i]==a[j])
      {
          a[j]=a[i];
          i++;
          
          
          
      }
     
  }
  for(int j=0;j<a.length;j++)
  {
     System.out.print(a[j]);
  }
}
}