public class NextSmallerNumber
{
	public static void main(String[] args){
		int[] arr = {9,10,11,12};
		int num = 8;
		int prevArr = -1;
		int nextSmaller = -1;
		for(int i=0;i<arr.length;i++){
			if((arr[i]<num) && (arr[i]>prevArr)){
				nextSmaller = arr[i];
				prevArr = arr[i];
			}
			
		}
		System.out.println(nextSmaller);
	}
}