import java.util.*;
public class N3Times {
	public static void main(String[] args){
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(1);
		a.add(2);
		System.out.println(repeatedNumber(a));
	}
	// DO NOT MODIFY THE LIST
	public static int repeatedNumber(final List<Integer> a) {
	    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	    int len = a.size();
	    int n = len/3;
	    int num=0;
	    for(int i=0;i<len;i++)
	    {
			
	        System.out.println("Inside loop: "+map);
	        num=a.get(i);
	        if(map.containsKey(num)){
	            map.put(num, map.get(num) + 1);
	        }
	        else
	           map.put(num,1);
	    }
	    for(Map.Entry<Integer, Integer> entry:map.entrySet()){ 
	        System.out.println(entry.getKey()+"----"+entry.getValue());
	        if(entry.getValue()>n){
	            return entry.getKey();
	        }
	    }   
        return -1;
	}
}
