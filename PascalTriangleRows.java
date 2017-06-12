import java.util.*;
public class PascalTriangleRows {
	
	public static void main(String[] args)
	{
		System.out.println(generate(0));
	}
	public static ArrayList<ArrayList<Integer>> generate(int a) {
	    ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		if(a == 0)
		{
			return list;
		}
	    ArrayList<Integer> temp = new ArrayList<Integer>();
	    temp.add(1);
	    list.add(temp);
	    int n = 1;
	    ArrayList<Integer> l = null;
	    int sum = 0;
	    while(a>1){
	        temp = new ArrayList<Integer>();
	        //l = new ArrayList<Integer>();
	        l = list.get(n-1);
	        for(int i=0;i<=n;i++)
	        {
				sum = 0;
				if(i<l.size())
					sum+=l.get(i);
				if((i-1)>=0)
	                sum+=l.get(i-1);
	           temp.add(sum);
		    }
		    list.add(temp);
		    a--;
		    n++;
	    }
	    return list;
	}
}
