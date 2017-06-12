import java.util.*;
public class CountAppearance{
	public static void main(String[] args){
		System.out.println(appearanceCount(6,102,"MexIco","MexIcobMexIcobFILbMexIcobMexIcobjMexIcobvMexIcobMexIcobMexIcobgMexIcobdMexIcobZVMexIcobMexIcobaMexIcob"));
	}
	public static int appearanceCount(int input1,int input2,String input3,String input4)
    {
		char[] str = new char[input4.length()];
		char[] temp = new char[input4.length()];
		for(int i=0;i<input4.length();i++){
			str[i] = input4.charAt(i);
			temp[i] = input4.charAt(i);
		}
		System.out.println(str);
		System.out.println(temp);
		combination(str, temp, str.length, 0, input1);
		String test = "";
		int count = 0;
		System.out.println(resultList.size());
		for(List<Character> list : resultList)
		{
			test = "";
			for(Character ch : list){
				test+=ch;
			}
			System.out.println(test);
			if(testAnagram(test, input3, input1))
			{
				count++;
			}
		}
		return count;
    }
	public static Boolean testAnagram(String test, String input, int size){
		Set<Character> set = new HashSet<Character>();
		for(int i=0;i<size;i++){
			set.add(test.charAt(i));
		}
		for(int i=0;i<size;i++){
			set.remove(input.charAt(i));
		}
		if(set.isEmpty()){
			return true;
		}
		else{
			return false;
		}
	}
	public static void combination(char[] str, char[] temp, int n, int k, int size){
		if(k==n-1)
		{
			str[k]='0';
			addCombination(str,temp,n,size);
			str[k]='1';
			addCombination(str,temp,n,size);
			return;
		}
		str[k]='0';
		combination(str, temp, n, k+1,size);
		str[k]='1';
		combination(str, temp, n, k+1,size);
	}
	public static List<List<Character>> resultList = new ArrayList<List<Character>>();
	public static void addCombination(char[] str, char[] temp, int n, int size){
		//System.out.println("Add combination");
		Boolean zero = false;
		Boolean one = false;
		Boolean flag = false;
		int sum = 0;
		for(int i=0;i<n;i++){
			if(str[i]=='0' && one == true){
				zero =true;
			}
			if(str[i]=='1' && one == true && zero == true){
				sum++;
				flag = false;
				break;
			}
			if(str[i]=='1'){
				sum++;
				one  = true;
				flag = true;
			}
		}
		
		if(flag && sum == size){
			List<Character> tempList = new ArrayList<Character>();
			for(int i=0;i<n;i++){
				if(str[i] == '1'){
					tempList.add(temp[i]);
				}
			}
			System.out.println(tempList);
			resultList.add(tempList);
		}
		
		
	}
}