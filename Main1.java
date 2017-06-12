public class Main1
{
	public static void main(String args[])
	{
		int i,j,k,l,m;

		for(i=0;i<4;i++)
		{
			for(j=i+1;j<=4;j++)
			{
				System.out.println(j);
			}
			for(k=1;k<=i;k++)
			{
				System.out.println(k);
			}
			System.out.println();
			for(k=i;k>=1;k--)
			{
				System.out.println(k);
			}
			for(j=4;j>=i+1;j--)
			{
				System.out.println(j);
			}
		}
	}
}

