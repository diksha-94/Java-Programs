import java.io.*;
import java.util.*;
public class LargestUsefulLand1
{ 
	public static void main(String[] args){
		int[] input1 = {7,3};
		//String[] input2 = {"0#0#1#0#0","1#0#0#1#0","0#1#0#1#0","0#0#1#1#1"};
		String[] input2 = {"0#0#0#0#1#0#0","0#0#0#0#1#0#0","0#0#0#0#0#0#1"};
		
		System.out.println("Result: "+encoded_msg(input1, input2));
	}
	public static List<String> list = new ArrayList<String>();
	public static int count = 0;
	public static List<Integer> result = new ArrayList<Integer>();
    public static int encoded_msg(int[] input1,String[] input2)
    {
        int[][] array = new int[input1[1]][input1[0]];
		int len = input2.length;
		for(int i = 0;i<len;i++)
		{
			String[] strArray = input2[i].split("#");
			for(int j = 0;j<input1[0];j++)
			{
				array[i][j] = Integer.parseInt(strArray[j]);
			}
		}
		
		
		for(int i = 0;i<input1[1];i++)
		{
			for(int j = 0;j<input1[0];j++)
			{
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
		
		for(int i=0;i<input1[1];i++)
		{
			for(int j=0;j<input1[0];j++)
			{
				
				count = 0;
				list = new ArrayList<String>();
				func(array,i,j, input1[1], input1[0]);
				result.add(count);
				
				
			}
		}
		int max = 0;
		for(Integer i : result){
			System.out.println("i: "+i);
			if(i>max)
			{
				max=i;
			}
		}
		return max;
    }
	public static void func(int[][] array, int i, int j, int rows, int cols){
		//System.out.println(rows+" >>>>>>> "+cols);
		
		if(array[i][j] == 0 && !list.contains(i+""+j))
		{
			System.out.println(i+"----"+j);
			count++;
			list.add(i+""+j);
			
		}
		else if(array[i][j] == 1 || list.contains(i+""+j))
		{
			return;
		}
		if((i-1)>=0)
		{
			func(array, i-1, j,rows, cols);
		}
		if((j-1)>=0)
		{
			func(array, i, j-1,rows, cols);
		}
		if((i+1)<rows)
		{
			System.out.println("Value of i: "+(i+1));
			func(array, (i+1), j,rows, cols);
		}
		if((j+1)<cols)
		{
			System.out.println("Value of j: "+(j+1));
			func(array, i, (j+1),rows, cols);
		}
		
		
	}
}