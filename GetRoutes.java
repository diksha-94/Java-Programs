import java.util.*;
public class GetRoutes
{
	public static void main(String[] args)
	{
		int l=8;
		int n=8;
		int[][] input3={{8},{3},{1,8,10},{2,7,20},{3,6,30},{1,5,40},{1,4,50},{4,3,60},{2,8,70},{4,6,80}};
		
		System.out.println(getRoutes(l,n,input3));
	}
	
    
	public static List<Integer> list = new ArrayList<Integer>();
    public static Set<Integer> set = new HashSet<Integer>();
    public static int getRoutes(int input1,int input2,int[][] input3)
    {
	    //Write code here
	    Double  posInf = Double.POSITIVE_INFINITY;
	    int min = posInf.intValue();
	    int cols = input3[1][0];
	    int index = 0;
	    int cost = 0;
	    while(list.size()<(input1*2-2)){
			//System.out.println(set.size());
			min = posInf.intValue();
	    
			/*for(int i=2;i<input3[0][0]+2;i++)
		    {
		        System.out.print(input3[i][2]+"\t");
		    }*/
			System.out.println();
		    for(int i=2;i<input3[0][0]+2;i++)
		    {
		        if(input3[i][2]<min)
		        {
		            min = input3[i][2];
		            index = i;
		        }
		    }
			if(min == posInf.intValue())
		    {
		        break;
		    }
			System.out.println("Min: "+min);
			Double inf = Double.POSITIVE_INFINITY;
			int val = inf.intValue();
			input3[index][2]=val;
		    int countFromList1 = countInList(input3[index][0]);
			System.out.println("List1: "+countFromList1);
		    //int countFromList2=0;
		    if(countFromList1 < 2)
		    {
		        int countFromList2 = countInList(input3[index][1]);
				System.out.println("List2: "+countFromList2);
				if(countFromList2 < 2)
				{
					
					cost+=min;
					System.out.println("Cost: "+cost);
					set.add(input3[index][0]);
					set.add(input3[index][1]);
					list.add(input3[index][0]);
					list.add(input3[index][1]);
				}
		    }
			System.out.println(list);
			System.out.println(set);
			
		
	    }
	    if(set.size()==input1 && list.size()==(input1*2-2))
	    {
	        return cost;
	    }
	    else
	    {
	        return 0;
	    }
	    
    }
    public static int countInList(int item)
    {
        int count = 0;
        for(Integer elem : list)
        {
            if(elem == item)
            {
                count++;
            }
        }
        return count;
    }

}