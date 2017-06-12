import java.util.*;
public class MaxNonNegativeSubarray {
	
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3364);
		list.add(-8);
		list.add(-2);
		list.add(-2);
		list.add(-7);
		list.add(-2);
		list.add(-3);
		list.add(-8);
		list.add(-8);
		list.add(-8);
		list.add(-3);
		list.add(-8);
		list.add(100000);
		System.out.println(maxset(list));
	}
	
	public static ArrayList<Integer> maxset(ArrayList<Integer> a) {
	    long max_so_far = Long.MIN_VALUE;
	    long max_ending_here = 0;
	    long max_in_list = Long.MIN_VALUE;
	    ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	    ArrayList<Integer> temp = new ArrayList<Integer>();
	   System.out.println(max_in_list);
	    for(Integer i : a){
			if(i<0){
	            if(max_in_list == max_so_far || max_in_list == Integer.MIN_VALUE){
					list.add(temp);
					max_in_list = max_so_far;
				
				}
	            else if(max_so_far>max_in_list){
					
					list = new ArrayList<ArrayList<Integer>>();
					list.add(temp);
					max_in_list = max_so_far;
				
					
	            }
	            temp = new ArrayList<Integer>();;
	            max_ending_here = 0;
	            max_so_far = Integer.MIN_VALUE;
	            continue;
	        }
	        max_ending_here += i;
	        if(max_ending_here>max_so_far){
	            max_so_far = max_ending_here;
	        }
			temp.add(i);
	    }
		System.out.println("Temp: "+temp);
		System.out.println("max_so_far: "+max_so_far);
		System.out.println("max_in_list: "+max_in_list);
		
		if(a.get(a.size()-1)>0){
	    if(max_in_list == max_so_far || max_in_list == Integer.MIN_VALUE){
			        list.add(temp);
		}
	    else if(max_so_far>max_in_list){
	                list = new ArrayList<ArrayList<Integer>>();
			        list.add(temp);
	            }
		}
		int max = Integer.MIN_VALUE;
	    temp = new ArrayList<Integer>();
		for(ArrayList<Integer> l : list){
	       if(l.size()>max){
	           max = l.size();
	           temp = l;
	       }
	   }
	   return temp;
	}
}
