public class RacingProblem
{
	public static void main(String args[])
	{
		int[] H={4,1,2,1,4};
		int n=H.length;
		int count=0;
		for(int i=0;i<n;i++)
		{
			count=0;
			for(int j=i+1;j<n;j++)
			{
				if(H[i]>=H[j])
					count++;
				else if(H[i]<H[j])
				{
					if((j+1)<n)
					{
						if(H[j]>=H[j+1])
						{
							count++;
							break;
						}
						else
						{
							count++;
						}
					}
				}
			}
			
		}
	}
	
}