import java.util.*;
public class TwoDCombination
{
	
	static int[][] array = {
			{-1,5,-1,3,-1},
			{4,6,-1,-1,-1},
			{7,-1,5,6,-1},
			{-1,-1,-1,10,5},
			{-1,-1,-1,9,3}
		};
	static int[][] temp = {
			{-1,5,-1,3,-1},
			{4,6,-1,-1,-1},
			{7,-1,5,6,-1},
			{-1,-1,-1,10,5},
			{-1,-1,-1,9,3}
		};
	//static Double num=Math.pow(2,tempArray.length);
	//static int n=num.intValue();
	//static char[][] resultArray=new char[n][];
	static ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	static int index=0;
	public static void main(String args[])
	{
		combination(array, 0,0, array.length,array[0].length,temp);
		printAllComb();
	}
	public static void printAllComb()
	{
		System.out.println("ResultList: "+result);
		
	}
	public static void combination(int[][] a, int i,int j, int rows, int cols,int[][] temp)
	{
		if(i==rows-1 && j==cols-1)
		{
			if(a[i][j] != -1)
				a[i][j]=0;
			addComb(a,temp,rows,cols);
			if(a[i][j] != -1)
				a[i][j]=1;
			addComb(a,temp,rows,cols);
			return;
		}
		if(a[i][j] != -1)
			a[i][j]=0;
		if((i+1)<rows)
			combination(a,i+1,j,rows,cols,temp);
		if((j+1)<cols)
			combination(a,i,j+1,rows,cols,temp);
		if((i-1)>=0)
			combination(a,i-1,j,rows,cols,temp);
		if((j-1)>=0)
			combination(a,i,j-1,rows,cols,temp);
		
		if(a[i][j] != -1)
			a[i][j]=1;
		if((i+1)<rows)
			combination(a,i+1,j,rows,cols,temp);
		if((j+1)<cols)
			combination(a,i,j+1,rows,cols,temp);
		if((i-1)>=0)
			combination(a,i-1,j,rows,cols,temp);
		if((j-1)>=0)
			combination(a,i,j-1,rows,cols,temp);
		
	}
	public static void addComb(int[][] a, int[][] temp, int rows, int cols)
	{
		ArrayList<Integer> dummy = new ArrayList<Integer>();
		Set<Integer> indexes = new HashSet<Integer>();
		
		int sum=0;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				if(a[i][j]==1)
				{
					indexes.add(j);
				}
			}
		}
		if(indexes.size()==rows)
		{
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<cols;j++)
				{
					if(a[i][j]==1)
					{
						dummy.add(temp[i][j]);
					}
				}
			}
		}
		result.add(dummy);
		
	}
}