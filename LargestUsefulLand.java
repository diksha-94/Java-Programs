import java.io.*;
import java.util.*;
public class LargestUsefulLand 
{ 
	public static void main(String[] args){
		int[] input1 = {1,1};
		int[] input2 = {1};
			
		
		System.out.println("Result: "+encoded_msg(input1, input2));
	}
    public static int encoded_msg(int[] input1, int[][] array)
    {
        
		
		for(int i = 0;i<input1[1];i++)
		{
			for(int j = 0;j<input1[0];j++)
			{
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
		int a = 0, b=0,count=0,one=0;
		List<Integer> result = new ArrayList<Integer>();
		for(int i=0;i<input1[1];i++)
		{
			for(int j=0;j<input1[0];j++)
			{
				if(array[i][j] == 0 && count == 0){
					count++;
					a=i;
					b=j;
				}
				else if((j+1)<input1[0]){
					if(array[i][j] == 0 && ((i==a  || j==b) || array[i][j+1]==0))
					{
						a=i;
						b=j;
						count++;
					}
				}
				else{
					if(array[i][j] == 0 && (i==a  || j==b))
					{
						a=i;
						b=j;
						count++;
					}
				}
				if(array[i][j]==1){
					one++;
					if(one == input1[0]){
						result.add(count);
						count = 0;
						a=0;
						b=0;
					}
				}
			}
			//one=0;
		}
		result.add(count);
		int max=0;
		for(Integer i : result)
		{
			System.out.println("i: "+i);
			if(i>max){
				max=i;
			}
		}
		return max;
    }
}