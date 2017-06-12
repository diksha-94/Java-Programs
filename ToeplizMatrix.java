public class ToeplizMatrix
{
	public static void main(String[] args)
	{
		int matrix[][] = {
			{6,7,8,9,10,9},
			{4,6,7,8,9,10},
			{1,4,6,7,8,8},
			{0,1,4,6,7,6}
		};
		System.out.println(matrix_func(matrix));
	}
	public static int matrix_func(int[][] matrix)
	{
		
		
		Boolean flag = true;
		int num = 0;
		int rows = matrix.length;
		int cols = matrix[0].length;
		int m = -1;
		int n = -1;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				
				if(i==0 || j==0)
				{
					System.out.println("If: "+i+"-----"+j);
					num = matrix[i][j];
					m=i;
					n=j;
					m++;
					n++;
					while(m<rows && n<cols)
					{
						//System.out.println("While: "+m+"-----"+n);
						System.out.println(matrix[m][n]+"--------"+num);
						if(num == matrix[m][n])
						{
							flag=true;
						}
						else{
							flag= false;
							return -1;
						}
						m++;
						n++;
					}
				}
				
			}
			
			
		}
		if(flag==true)
			{
				return 1;
			}
			else{
				return -1;
			}
	}
}