public class HourGlass
{
	public static void main(String args[])
	{
		int[][] a={{1,1,1,0,0,0},
					 {0,1,0,0,0,0},
					 {1,1,1,0,0,0},
					 {0,0,2,4,4,0},
					 {0,0,0,2,0,0},
					 {0,0,1,2,4,0}};
		int sum[]=new int[16];
		int countm=0, countn=0;
		int inc=0;
		int add=0;
		for(int i=0;i<(a.rows)-2;i++)
		{
			for(int j=0;j<(a.cols)-2;j++)
			{
				countm=0;
				add=0;
				for(int m=i;m<=i+2;m++)
				{
					countm++;
					countn=0;
					for(int n=j;n<=j+2;n++)
					{
						countn++;
						if((countm==2 && countn==1) || (countm==2 && countn==3))
						{}
						else
						{
							add+=a[m][n];
						}
							//System.out.print(a[m][n]+"\t");
					}
					//System.out.println();
				}
				sum[inc]=add;
				inc++;
				//System.out.println();
				//System.out.println();
			}
		}
		int max=-63;
		for(int i=0;i<16;i++)
		{
			//System.out.println(sum[i]);
			if(sum[i]>max)
			{
				max=sum[i];
			}
		}
		System.out.println("Max: "+max);
	}
}