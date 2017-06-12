import java.util.*;
public class Demonetisation{
	public static List<List<Integer>> combinationList = new ArrayList<List<Integer>>();
    public static List<Integer> distanceList = new ArrayList<Integer>();
	public static void main(String[] args)
	{
		int input1 = 5;
		int[] input2 = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(demonetizationDrive(input1, input2));
	}
    public static int demonetizationDrive(int input1,int[] input2)
    {
        //input2 is an array of locations
	    //Write code here
	    int len = input2.length;
	    if(input1 > len || input1 > 30 || input1 < 1)
	    {
	        return -1;
	    }
	    int[] temp = new int[len];
	    for(int i=0;i<len;i++)
	    {
	        if(input2[i]<1 || input2[i]>10000)
	        {
	            return -1;
	        }
	        temp[i] = input2[i];
	    }
		for(int i=0;i<len-1;i++)
		{
			if(input2[i]>input2[i+1])
				return -1;
		}
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<len;i++)
		{
			if(set.contains(input2[i]))
				return -1;
			else
				set.add(input2[i]);
		}
	    combination(input2, 0, input2.length, temp, input1);
	    System.out.println("Combination list size: "+combinationList.size());
		for(List<Integer> list : combinationList)
		{
			for(Integer item : list)
			{
				System.out.print(item+"\t");
			}
			System.out.println();
		}
	    processCombination(temp);
		System.out.print("Distance List:\t"+distanceList.size()+"\n");
		for(Integer distance : distanceList)
		{
			System.out.print(distance+"\t");
		}
	    Double posInf = Double.POSITIVE_INFINITY;
	    int min = posInf.intValue();
	    for(Integer item : distanceList)
	    {
	        if(item < min)
	        {
	            min = item;
	        }
	    }
	    return min;
    }
    
    public static void combination(int[] a, int k, int n, int[] temp, int size)
    {
        if(k==n-1)
        {
            a[k] = 0;
            addCombination(a, n, temp, size);
            a[k] = 1;
            addCombination(a,n, temp, size);
            return;
        }
        a[k]=0;
        combination(a, k+1, n, temp, size);
        a[k]=1;
        combination(a, k+1, n, temp, size);
    }
    public static void addCombination(int[] a, int n, int[] temp, int size)
    {
        int sum = 0;
        List<Integer> dummyList = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            if(a[i] == 1){
                sum++;
                dummyList.add(temp[i]);
            }
           
        }
        if(sum == size)
        {
            combinationList.add(dummyList);
        }
    }
    public static void processCombination(int[] temp)
    {
        int sum = 0;
        for(List<Integer> list : combinationList)
        {
            sum=0;
            for(int i=0;i<temp.length;i++)
            {
                int num = findNearestElement(list, temp[i]);
                sum+=num;
            }
            distanceList.add(sum);
        }
    }
    public static int findNearestElement(List<Integer> list, int element)
    {
        Double posInf = Double.POSITIVE_INFINITY;
        int min = posInf.intValue();
        for(Integer item : list)
        {
            int val = absoluteValue(item-element);
            if(val < min)
            {
                min = val; 
            }
        }
        return min;
    }
    public static int absoluteValue(int num)
    {
        if(num<0)
            return -(num);
        else
            return num;
    }
}