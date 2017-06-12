public class MinimumPossiblePerimeter
{
	public static void main(String[] args){
		int[][] array = {{3,4},{3,3},{6,1},{1,1},{5,5},{5,5},{3,1}};
		System.out.println(minimumPerimeter(6,5,7,3,array));
	}
	public static int count = 0;
	public static int minimumPerimeter(int l, int w, int n, int k, int[][] array)
	{
		int[][] matrix = new int[w][l];
		for(int i=0;i<w;i++)
		{
			for(int j=0;j<l;j++)
			{
				matrix[i][j] = 0;
			}
		}
		for(int i=0;i<n;i++)
		{
			//System.out.println((array[i][0]-1)+"-------"+(array[i][1]-1));
			matrix[array[i][1]-1][array[i][0]-1]+=1;
		}
		for(int i=0;i<w;i++)
		{
			for(int j=0;j<l;j++)
			{
				formRectangle(i,j,matrix,k,l,w);
				break;
			}
		}
		
		return 0;
	}
	
	public static void formRectangle(int i, int j, int[][] matrix, int k, int l, int w)
	{
		if(count == k){
			System.out.println("Inside count equals");
			count=0;
			i=0; 
			j=0;
			return;
		}
		System.out.println(i+"------"+j);
		
		if(matrix[i][j] == 1)
		{
			count++;
		}
		if(j+1<l){
			formRectangle(i, j+1, matrix, k, l, w);
		}
		if(i+1<w){
			formRectangle(i+1, j, matrix, k, l, w);
		}
		if(j-1>=0){
			formRectangle(i, j-1, matrix, k, l, w);
		}
		if(i-1>=0){
			formRectangle(i-1, j, matrix, k, l, w);
		}
		return;
	}
}