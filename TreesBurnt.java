import java.util.*;
public class TreesBurnt
{
	public static void main(String[] args)
	{
		int[][] array = {
			{1,1,1,1},
			{1,1,1,1},
			{1,1,1,1},
			{1,1,1,1}
		};
		int i=0,j=3;
		int rows = array.length;
		int cols = array[0].length;
		burntTrees(array, i, j, rows, cols);
		for(int m=0;m<rows;m++)
		{
			for(int n=0;n<cols;n++)
			{
				System.out.print(array[m][n]);
			}
			System.out.println();
		}
	}
	public static Set<String> set = new HashSet<String>();
	public static int[][] burntTrees(int[][] array, int i, int j, int rows, int cols)
	{
		if(set.contains(i+","+j))
			return array;
		set.add(i+","+j);
		array[i][j] = 0;
		if((i+1)<cols && array[i+1][j]==1)
			burntTrees(array, i+1, j, rows, cols);
		if((j+1)<rows && array[i][j+1]==1)
			burntTrees(array, i, j+1, rows, cols);
		if((i-1)>=0  && array[i-1][j]==1)
			burntTrees(array, i-1, j, rows, cols);
		if((j-1)>=0  && array[i][j-1]==1)
			burntTrees(array, i, j-1, rows, cols);
		return array;
	}
}