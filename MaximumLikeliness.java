import java.util.*;
public class MaximumLikeliness
{
	public static Set<Integer> setForColumn =new HashSet<Integer>();
	public static Set<Integer> setForRow =new HashSet<Integer>();
	public static void main(String[] args)
	{
		int[][] array = {
			{0,5,0,3,0},
			{4,6,0,0,0},
			{7,0,5,6,0},
			{0,0,0,10,5},
			{0,0,0,9,3}
		};
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[0].length;j++)
			{
				setForRow = new HashSet<Integer>();
				setForColumn = new HashSet<Integer>();
				if(array[i][j]!=0)
				{
					str="";
					num=0;
					setForColumn.add(j);
					setForRow.add(i);
					str+=i+","+j+","+array[i][j]+":";
					num+=array[i][j];
					
					goRecursive(array,i+1,array.length,array[0].length);
				}
			}
		}
		System.out.println(result);
		System.out.println(num);
		
	}
	public static int num=0;
	public static int max = Integer.MIN_VALUE;
	public static String str="";
	public static ArrayList<String> result = new ArrayList<String>();
	public static void goRecursive(int[][] array, int i, int rows,int cols)
	{
		System.out.println("SetForColumn: "+setForColumn);
		System.out.println("SetForRow: "+setForRow);
		if(setForRow.size()==array.length)
		{
			System.out.println("Inside size() completed");
			if(num>max) {
				max=num;
			}
			setForRow = new HashSet<Integer>();
			setForColumn = new HashSet<Integer>();
			result.add(str);
			str="";
			num=0;
			return;
		}
		for(int j=0;j<cols;j++) {
			//System.out.println(setForRow.contains(i)+"-----"+setForColumn.contains(j)+"-----"+array[i][j]);
			if(!setForRow.contains(i) && !setForColumn.contains(j) && array[i][j]!=0){
				//System.out.println("Inside this");
				setForColumn.add(j);
				setForRow.add(i);
		
				str+=(i)+","+j+","+array[i][j]+":";
				num+=array[i][j];
			}
		}
		if((i+1)<rows){
			goRecursive(array, i+1,rows,cols);
		}
		if((i-1)>=0) {
			goRecursive(array,i-1,rows,cols);
		}
		/*for(int i=0;i<array.length;i++)
		{
			
			for(int j=0;j<array[0].length;j++)
			{
				if(!setForRow.contains(i) && !setForColumn.contains(j) && array[i][j]!=0)
				{
					setForColumn.add(j);
					setForRow.add(i);
					str+=i+","+j+","+array[i][j]+":";
					num+=array[i][j];
					//goRecursive(array);
					
				}
			}
		}*/
	}
}