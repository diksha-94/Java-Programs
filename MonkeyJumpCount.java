public class MonkeyJumpCount
{
	public static void main(String[] args){
	int[] array = {8,10};
		System.out.println(GetJumpCount(10,1,array));
	}
	public static int GetJumpCount(int input1,int input2,int[] input3)
    {
		int x=input1;
		int y=input2;
		int height = 0;
		int jumps = 0;
		Boolean flag = true;
		for(int i=0;i<input3.length;i++)
		{
			height = 0;
			flag = true;
			//while(height!=input3[i] && height<input3[i]){
				while(flag){
				height += x;
				if(height >= input3[i]){
					flag = false;
				}
				else{
					height -= y;
				}
				jumps++;
			}
			
			//System.out.println(jumps);
		}
		return jumps;
	}

}