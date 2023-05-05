import java.util.*;
class Sumcnt
{
    public static void main(String args[])
    {
     
	int first,last,i,sum=0,cnt=0;
	System.out.println("Enter first:");
	Scanner sc=new Scanner(System.in);
     	first=sc.nextInt();
      System.out.println("Enter last:");
	Scanner sc2=new Scanner(System.in);
     	last=sc2.nextInt();
	
      i=first;
	 while(i<=last)
       {  
          if(i%2==1)
          {
               System.out.println("The odd numbers= "+i);
               sum=sum+i;
               cnt++;
              
          }
          i++;
      
       }
      System.out.println("The sum = "+sum);
      System.out.println("The count= "+cnt);
 }
}