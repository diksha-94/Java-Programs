import java.io.*;
import java.util.*;
public class MinimumCost 
{ 
	public static void main(String args[])
	{
		String[] in={"7#9#1#3#2","4#5#9#8#7","8#7#6#3#1","1#2#5#7#8","9#1#1#1#2"};
		System.out.println(minimumCost(in, 5));
	}
    public static String minimumCost(String[] input1,int input2)
    {
        //Write code here
        String[] row=null;
        int[][] array=new int[input2][]; 
        int flag=0;
        int cost=0;
        String outputString="";
		int cols=-1;
        for(int i=0;i<input1.length;i++)
        {
			//System.out.println("Inside loop");
            row=input1[i].split("#");
            array[i]=new int[row.length];
			cols=row.length;
            for(int j=0;j<row.length;j++)
            {
				//System.out.println("Inside inside loop");
                array[i][j]=Integer.parseInt(row[j]);
				//System.out.print(array[i][j]+"\t");
            }
			//System.out.println();
        }
		/*for(int i=0;i<input2;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
		return "test";*/
		
        int i=0;
        int j=0;
        cost=array[i][j];
        
        while(flag==0)
        {
			System.out.println("i: "+i+"  j:"+j);
			if(i==input2-1 && j==cols-1)
            {
				System.out.println("Inside 4 flag==1");
                flag=1;
            }
            else if(i==input2-1)
            {
				System.out.println("Inside 1");
                int min=array[i][j+1];
                cost+=min;
				j+=1;
                outputString+="R";
            }
            else if(j==cols-1)
            {
				System.out.println("Inside 2");
                int index=findMin(array[i+1][j],array[i+1][j-1]);
				System.out.println("Index: "+index);
                if(index==1)
                {
                    cost+=array[i+1][j];
					i=i+1;
                    outputString+="B";
                }
                else if(index==2)
                {
                    cost+=array[i+1][j-1];
					i=i+1;
					j=j-1;
                    outputString+="D";
                }
                
            }
            else if(j==0)
            {
				System.out.println("Inside 3");
                int index=findMin(array[i+1][j],array[i][j+1],array[i+1][j+1]);
				System.out.println("Index: "+index);
                if(index==1)
                {
                    cost+=array[i+1][j];
					i=i+1;
                    outputString+="B";
                }
                else if(index==2)
                {
                    cost+=array[i][j+1];
					j+=1;
                    outputString+="R";
                }
                else if(index==3)
                {
                    cost+=array[i+1][j+1];
					i+=1;
					j+=1;
                    outputString+="D";
                }
                
            }
            
            else
            {
				System.out.println("Inside 5");
                int index=findMin(array[i+1][j],array[i][j+1],array[i+1][j+1]);
				System.out.println("Index: "+index);
                if(index==1)
                {
                    cost+=array[i+1][j];
					i+=1;
					
                    outputString+="B";
                }
                else if(index==2)
                {
                    cost+=array[i][j+1];
					j+=1;
                    outputString+="R";
                }
                else if(index==3)
                {
                    cost+=array[i+1][j+1];
                    outputString+="D";
					i+=1;
					j+=1;
                }
                else if(index==4)
                {
                    cost+=array[i+1][j-1];
                    outputString+="D";
					i+=1;
					j-=1;
                }
            }
            
        }
        return cost+","+outputString;
    }
    
    public static int findMin(int... args)
    {
        int len=args.length;
        int[] ar=new int[len];
        int min=1000;
        int index=-1;
        for(int i=0;i<len;i++)
        {
            ar[i]=args[i];
            if(ar[i]<min)
            {
                min=ar[i];
                index=i;
            }
        }
        return index+1;
    }
}