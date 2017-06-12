import java.util.*;
public class CountAppearance2{
	public static void main(String[] args){
		System.out.println(appearanceCount(6,102,"MexIco","MexIcobMexIcobFILbMexIcobMexIcobjMexIcobvMexIcobMexIcobMexIcobgMexIcobdMexIcobZVMexIcobMexIcobaMexIcob"));
		//System.out.println(appearanceCount(4,11,"caaa","caaacaccaaa"));
		//System.out.println(appearanceCount(4,11,"cAda","AbrAcadAbRa"));
	}
	
	public static int appearanceCount(int input1,int input2,String input3,String input4)
    {
		String subStr = "";
		int count = 0;
		for(int i=0;i<=(input4.length()-input1);i++)
		{
			subStr = "";
				//System.out.println(i + "" +(input1+i));
				subStr = input4.substring(i, input1+i);
			//System.out.println(subStr);
			if(testAnagram(subStr, input3, input1)){
				count++;
			}
		}
		return count;
    }
	public static Boolean testAnagram(String test, String input, int size){
		List<Character> list1 = new ArrayList<Character>();
		List<Character> list2 = new ArrayList<Character>();
		for(int i=0;i<size;i++){
			list1.add(test.charAt(i));
			list2.add(input.charAt(i));
		}
		Collections.sort(list1);
		Collections.sort(list2); 
		System.out.println(list1+"--------"+list2);		
		return list1.equals(list2);
		
	}
}