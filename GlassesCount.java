import java.util.*;
public class GlassesCount
{
	public static void main(String args[])
	{
		int[] entry_hr={12,12,12,12,12,12};
		int[] exit_hr={12,12,12,12,12,12};
		int[] entry_min={1,2,3,1,3,4};
		int[] exit_min={2,3,4,5,6,7};
		Set<Integer> index=new HashSet<Integer>();
		index.add(0);
		int count=1;
		for(int i=0;i<entry_hr.length;i++)
		{
			for(int j=i+1;j<entry_hr.length;j++)
			{
				if(entry_hr[i]==entry_hr[j])
				{
					if((entry_min[i]==entry_min[j]) && (!index.contains(j)))
					{
						count++;
						System.out.println("Inside if for: "+i+"     "+j);
						System.out.println("Adding index "+j);
						index.add(j);
						
					}
					else
					{}
				}
			}
		}
		System.out.println("Count: "+count);
	}
}