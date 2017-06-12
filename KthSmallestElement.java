import java.util.*;
public class KthSmallestElement {
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		a.add(8);
		a.add(16);
		a.add(80);
		a.add(55);
		a.add(32);
		a.add(8);
		a.add(38);
		a.add(40);
		a.add(65);
		int k = 3;
	    Integer max = Integer.MAX_VALUE;
		int indexValue = -1;
	    List<Integer> index = new ArrayList<Integer>();
	    while(k>0)
	    {
	        max = Integer.MAX_VALUE;
	        for(int i=0;i<a.size();i++)
	        {
				
	            if(max>a.get(i) && !index.contains(i))
	            {
	                System.out.println("Inside: "+a.get(i)+"----"+max);
	                max = a.get(i);
	                indexValue = i;
	            }
	        }
			index.add(indexValue);
	        k--;
	    }
	    System.out.println(max);
	}
}
