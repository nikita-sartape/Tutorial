import java.util.*;
class Naturalsum
{
    public static void main(String args[])
    {
     
	int N,i,sum=0;
	System.out.println("Enter The N:");
	Scanner sc=new Scanner(System.in);
     	N=sc.nextInt();
	System.out.println(" The Natural Numbers sum is:");
      i=1;
	while(i<=N)
	{     
            sum = sum + i;
            i++;
      }
      System.out.print(sum);
    }
}