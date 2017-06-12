import java.util.*;
public class Lexicographic
{
	public static void main(String[] args) {
		System.out.println(longestIncreasingSubsequence("aghagh"));
	}
	public static String longestIncreasingSubsequence(String input1)
    {
	    //Write code here
		Character[] array = new Character[input1.length()];
		Character[] dummyArray = new Character[input1.length()];
		for(int i=0;i<input1.length();i++){
			array[i] = input1.charAt(i);
			dummyArray[i] = input1.charAt(i);
		}
		String result = "";
		String dummy = "";
		int count=0;
		combination(array, dummyArray, input1.length(), 0);
		for(List<Character> list : resultList) {
			dummy = "";
			for(Character ch : list) {
				dummy+=ch;
			}
			if(dummy.length()==1){
				if(count<1){
					count=1;
					result=dummy;
				}
			}
			else{
				int flag = 0;
				int len = dummy.length();
				for(int i=1;i<len;i++) {
					if((dummy.charAt(i))>=(dummy.charAt(i-1))) {
						flag=1;
					}
					else {
						flag=0;
						break;
					}
				}
				if(flag == 1){
					if(count < len) {
						result = dummy;
						count = len;
					}
				}
			}
			//System.out.println();
		}
		return result;
    }
	public static void combination(Character[] array, Character[] dummyArray, int n, int k)
	{
		if(k==n-1)
		{
			array[k]=0;
			addComb(array, dummyArray, n);
			array[k]=1;
			addComb(array, dummyArray, n);
			return;
		}
		array[k]=0;
		combination(array, dummyArray,n, k+1);
		array[k]=1;
		combination(array, dummyArray,n, k+1);
	
	}
	public static List<List<Character>> resultList = new ArrayList<List<Character>>();
	public static void addComb(Character[] array, Character[] dummyArray, int n)
	{
		List<Character> dummyList = new ArrayList<Character>();
		for(int i=0;i<n;i++)
		{
			if(array[i]==1)
			{
				dummyList.add(dummyArray[i]);
			}
		}
		resultList.add(dummyList);
	}

}