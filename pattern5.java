class pattern5
{
  public static void main(String args[])
 {
   int n=5;
	for(int i=1;i<=n;i++)
	{     int cnt=1;
		for(int j=n;j>=1;j--)
		{  
			if(i>=j){
				System.out.print(cnt + " ");
                        cnt++;
			}
			else 
			  System.out.print(" ");
		}
		System.out.print("\n");
	}
 }
}
