
public static List<List<Integer>> combinationList = new ArrayList<List<Integer>>();
    public static List<Integer> distanceList = new ArrayList<Integer>();
    public static int demonetizationDrive(int input1,int[] input2)
    {
        //input2 is an array of locations
	    //Write code here
	    int len = input2.length;
	    if(input1 > len || input1 > 30)
	    {
	        return -1;
	    }
	    int[] temp = new int[len];
	    for(int i=0;i<len;i++)
	    {
	        temp[i] = input2[i];
	    }
	    combination(input2, 0, input2.length, temp, input1);
	    //System.out.println("Combination list size: "+combinationList.size());
	    processCombination(temp);
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