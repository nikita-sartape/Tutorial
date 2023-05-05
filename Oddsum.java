import java.util.*;
class Oddsum
{
    public static void main(String args[])
    {
     
	int N,i,sum=0;
	System.out.println("Enter The N:");
	Scanner sc=new Scanner(System.in);
     	N=sc.nextInt();
	System.out.println(" The even Numbers sum is:");
      i=1;
	while(i<=N)
	{     
            if(i%2==1)
            {
             sum = sum + i;
             
            } 
         i++;
      }
      System.out.print(sum);
    }
}