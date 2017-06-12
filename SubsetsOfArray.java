import java .util.*;
public class SubsetsOfArray
{
	public static void main(String args[])
	{
		int[] array={1,2,3,4,5};
		//int k=3;
		HashSet<Integer> subset=new HashSet<Integer>();
		HashSet<HashSet<Integer>> subsets=new HashSet<HashSet<Integer>>();
		boolean flag=false;
		for(int i=0;i<array.length;i++)
		{
			System.out.println("For i="+i);
			if(i==0){}
			else
			{
				subset.clear();
				flag=false;
				System.out.println("Removing from i: "+array[i-1]);
			}
			subset.add(array[i]);
			System.out.println("Adding from i: "+array[i]);
			for(int j=i+1;j<array.length;j++)
			{
				System.out.println("For j="+j);
				if(flag==true)
				{
					subset.remove(array[j-1]);
				}
				subset.add(array[j]);
				for(int k=j+1;k<array.length;k++)
				{
					System.out.println("For k="+k);
						flag=true;
						subset.add(array[k]);
						for(Integer it : subset)
						{
							System.out.print(it);
						}
						System.out.println();
						if(subset.size()==3){
							System.out.println(subset);
							subsets.add(subset);
							System.out.println("Adding to subsets");
						}
						subset.remove(array[k]);
				}
			}
		}
		System.out.println(subsets);
		for(Set<Integer> sub : subsets){
			
            for(Integer itr : sub)
			{
				System.out.print(itr);
			}
			System.out.println();
        }

	}
}