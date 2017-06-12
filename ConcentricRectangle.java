import java.util.*;
public class ConcentricRectangle {
	public static void main(String[] args) {
		int n=4;
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> dummy = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			dummy = new ArrayList<Integer>();
			for(int j=0;j<n;j++)
			{
				dummy.add(numGenerator(i,j,n,n));
			}
			for(int k=n-2;k>=0;k--)
			{
				dummy.add(dummy.get(k));
			}
			list.add(i, dummy);
			//list.add((n*2-1-i-1),dummy);
		}
		for(int i=n-2;i>=0;i--)
		{
			System.out.println(i+"----"+(n*2-1-i-1));
			list.add((n*2-1-i-1),list.get(i));
		}
		System.out.println(list);
	}
	public static int numGenerator(int i, int j, int n,int fix)
	{
		if(i==0 || j==0 || j==2*fix-2)
		{
			return n;
		}
		else
		{
			return numGenerator(i-1,j-1,n-1,fix);
		}
		//return n;
	}
}
