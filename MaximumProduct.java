import java.util.*;
public class MaximumProduct {
	public static void main(String[] args){
		List<Integer> a = new ArrayList<Integer>();
		a.add(-1);
		a.add(2);
		a.add(-3);
		a.add(4);
		a.add(-5);
		/*a.add(-3);
		a.add(0);
		a.add(0);
		a.add(0);
		a.add(0);
		a.add(0);
		a.add(0);*/
		System.out.println(maxProduct(a));
	}
	public static int maxProduct(List<Integer> a) {
	    int max_so_far=Integer.MIN_VALUE;
	    int max_now=1;
	    
	    for(Integer i : a) {
			if(max_now==0){
				max_now=1;
			}
			max_now = max_now*i;
			System.out.println("Max_now: "+max_now);
	        
	        if(max_now<i && i>0 && -(max_now)<i){
				System.out.println("Inside 1");
	            max_now=i;
	        }
	        if(max_now>max_so_far){
				System.out.println("Inside 2");
	            max_so_far=max_now;
	        }
	    }
	    return max_so_far;
	}
}
