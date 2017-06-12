public class RacingProblem
{
	public static void main(String args[])
	{
		int[] H={2,3,1};
		int n=H.length;
		int[] X=new int[n];
		int[] P=new int[n];
		for(int i=0;i<n;i++)
		{
			P[i]=i+1;
		}
		
		int count=0;
		int t=0;
		for(int i=0;i<n;i++)
		{
			count=0;
			//forward
			for(int j=i+1;j<n;j++)
			{
				if(H[i]>=H[j])
				{
					count++;
					System.out.println(H[i]+" Entered 1");
				}
				else if(H[i]<H[j])
				{
					if((j+1)<n)
					{
						if(H[j]>=H[j+1])
						{
							count++;
							System.out.println(H[i]+" Entered 2");
							break;
						}
						else
						{
							System.out.println(H[i]+" Entered 3");
							count++;
						}
					}
					else
					{
						System.out.println(H[i]+" Entered new1");
						count++;
					}
				}
			}
			
			//backward
			for(int k=i-1;k>=0;k--)
			{
				//System.out.println(i+""+k);
				if(H[i]>=H[k])
				{
					count++;
					System.out.println(H[i]+" Entered 4");
				}
				else if(H[i]<H[k])
				{
					if((k-1)>0)
					{
						if(H[k]>=H[k-1])
						{
							count++;
							System.out.println(H[i]+" Entered 5");
							break;
						}
						else
						{
							System.out.println(H[i]+" Entered 6");
							count++;
						}
					}
					else
					{
						System.out.println(H[i]+" Entered new2");
						count++;
					}
				}
			}
			System.out.println(count);
			X[t]=count;
			t++;
		}
		int[] newArray=new int[n];
		for(int i=0;i<n;i++)
		{
			newArray[i]=X[i]*P[i];
		}
		int max=0;
		int index=0;
		for(int i=0;i<n;i++)
		{
			if(newArray[i]>max)
			{
				max=newArray[i];
				index=i+1;
			}
		}
		System.out.println("Winning index: "+index);
	}
	
}