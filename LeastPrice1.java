import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;
public class LeastPrice1
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
		String[] line = null;
		int[][] inputArray = new int[n][3];
		for(int i=0;i<n;i++)
		{
			line=(br.readLine()).split(" ");
			for(int j=0;j<3;j++)
			{
				inputArray[i][j]=Integer.parseInt(line[j]);
			}
		}
		//till now created input array inputArray
		/*for(int i=0;i<n;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(inputArray[i][j]+"\t");
			}
			System.out.println();
		}*/
		Double posInf=Double.POSITIVE_INFINITY;
		Double negInf=Double.POSITIVE_INFINITY*-1;
		int min=posInf.intValue();
		int max=negInf.intValue();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<2;j++)
			{
				if(inputArray[i][j]>max)
				{
					max=inputArray[i][j];
				}
				if(inputArray[i][j]<min)
				{
					min=inputArray[i][j];
				}
			}
		}
		//max is the maximum time and min is the min time
		int[][] outputArray=new int[max-min][3];
		//System.out.println(max-min);
		
		for(int i=0;i<outputArray.length;i++)
		{
			for(int j=0;j<1;j++)
			{
				outputArray[i][j]=min;
				outputArray[i][j+1]=min+1;
				min++;
			}
		}
		
		/*for(int i=0;i<outputArray.length;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(outputArray[i][j]+"\t");
				
			}
			System.out.println();
		}*/
		for(int i=0;i<outputArray.length;i++)
		{
			List<Integer> list = new ArrayList<Integer>();
			for(int j=0;j<inputArray.length;j++)
			{
				if(inputArray[j][0]<=outputArray[i][0])
				{
					list.add(inputArray[j][2]);
				}
				if(inputArray[j][1]<outputArray[i][1])
				{
					list.remove((Object)inputArray[j][2]);
				}
			}
			//System.out.print("For startTime="+(i+1)+" :");
			posInf=Double.POSITIVE_INFINITY;
			min=posInf.intValue();
			int temp=posInf.intValue();
			for(int elem : list)
			{
				if(elem<min)
				{
					min=elem;
				}
				//System.out.print("\t"+elem);
			}
			if(min==temp)
			{
				min=0;
			}
			outputArray[i][2]=min;
		}
		
		/*for(int i=0;i<outputArray.length;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(outputArray[i][j]+"\t");
				
			}
			System.out.println();
		}*/
		List<List<Integer>> outputList = new ArrayList<List<Integer>>();
		int[][] finalOut = new int[n][3];
		//int start=outputArray[0][0];
		//int end=outputArray[0][1]-1;
		/*for(int i=0;i<n;i++)
		{
			for(int j=0;j<1;j++)
			{
				finalOut[i][j]=inputArray[i][j];
				if((i+1)<inputArray.length)
					finalOut[i][j+1]=inputArray[i+1][j]-1;
				else
					finalOut[i][j+1]=max;
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(finalOut[i][j]+"\t");
			}
			System.out.println();
		}*/
		/*for(int i=0;i<outputArray.length;i++)
		{
			if(i<=outputArray.length-2){
			if(outputArray[i][2]==outputArray[i+1][2])
			{
				end++;
				//i++;
			}
			else
			{
				List<Integer> dummy = new ArrayList<Integer>();
				dummy.add(start);
				dummy.add(end);
				dummy.add(outputArray[i][2]);
				outputList.add(dummy);
				start=outputArray[i+1][0];
				end=outputArray[i+1][1]-1;
			}
			}
			
		}
		
		for(List<Integer> ls : outputList)
		{
			for(int elem : ls)
			{
				System.out.print(elem+"\t");
			}
			System.out.println();
		}*/
		
		int start=outputArray[0][0];
		int end=0;
		int flag=0;
		for(int i=0;i<outputArray.length;i++)
		{
			if(i!=outputArray.length-1)
			{
				if(outputArray[i][2] == outputArray[i+1][2])
				{
					end=outputArray[i+1][1];
					flag=1;
				}
				else{
					List<Integer> dummy = new ArrayList<Integer>();
					if(flag==0)
					{
						end=outputArray[i][1];
					}
					else{
						end-=1;
					}
					if(start==end)
					{
						end++;
					}
					dummy.add(start);
					dummy.add(end);
					dummy.add(outputArray[i][2]);
					outputList.add(dummy);
					start=outputArray[i+1][0];
					end=outputArray[i+1][1];
				}
			}
			else{
				List<Integer> dummy = new ArrayList<Integer>();
				if(start==end)
					{
						end++;
					}
					dummy.add(start);
					dummy.add(end);
					dummy.add(outputArray[i][2]);
					outputList.add(dummy);
			}
		}
		/*for(int i=0;i<outputList.size();i++)
		{
			for(int j=0;j<(outputList.get(i)).size();j++)
			{
				System.out.print(outputList[i][j]);
				if(j!=outputList[i].size()-1)
				{
					System.out.print("*");
				}
			}
		}*/
		Integer[][] array = new Integer[outputList.size()][];

		int i = 0;
		for (List<Integer> nestedList : outputList) {
			array[i++] = nestedList.toArray(new Integer[nestedList.size()]);
		}
		for(int k=0;k<array.length;k++)
		{
			for(int j=0;j<array[k].length;j++)
			{
				System.out.print(array[k][j]);
				if(j!=array[k].length-1)
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		/*int k=0;
		int m=0;
		for(int i=0;i<outputList.size();i++)
		{
			array[k] = outputList.toArray();
			k++;
		}*/
		/*for(List<Integer> ls : outputList)
		{
			for(int elem : ls)
			{
				System.out.print(elem+"\t");
			}
			System.out.println();
		}*/
		
	}
}
        