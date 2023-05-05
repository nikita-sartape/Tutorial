import java.util.Arrays;
class digitcombi
{
  public static void main(String args[])
 {
  int no = 786;
  int cnt=0,temp=no;
  
  while(no>0)
  {  
     no=no/10;
     cnt++;
     
  }
  no=temp;
  
  int a[]=new int[cnt];
  int i=0;
  while(no>0)
  {  int digit=no%10;
     a[i]=digit;
     i++;
     no=no/10;
  }
  Arrays.sort(a);
     
  /*for(i=a.length-1;i>=0;i--)
  {
    System.out.print(a[i]);  
  }*/
 int ans=0;
 for(i=a.length-1;i>=0;i--)
  {
    ans=(ans*10)+a[i]; 
  }
 System.out.print(ans); 
 System.out.print(" \n");  
 
 int total=0;
 for(i=0;i<a.length;i++)
  {
    total=(total*10)+a[i]; 
  }
 System.out.print(total); 
  int totaldiff=ans-total;
   System.out.print(" \n");  
 
 
  System.out.print(totaldiff);  
 

 
}
}