import java.util.*;
class Naturalinrev
{
    public static void main(String args[])
    {
     
	int lim,i;
	System.out.println("Enter The Limit:");
	Scanner sc=new Scanner(System.in);
     	lim=sc.nextInt();
	System.out.println(" The Natural Numbers Is In Reverse Order:");
      i=lim;
	while(i>=1)
	{
		System.out.print(i + " ");
            i--;
      }
    }
}