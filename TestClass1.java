
class TestClass1 {
    public static void main(String args[] ) throws Exception {
       
        
        int a = 1;
        int b = 1;
        int c = 1;
        int n = 3;
        long A[]=new long[n+1];
        long B[]=new long[n+1];
        A[1] = a*c;
		for(int i=2 ; i<=n ; i++)
		{
			A[i] = A[i-1]*a*b*c + A[i-1]*a*b + A[i-1]*a*c;
    		A[i] = A[i]%1000000007;
		}
		B[1] = b*c;
		for(int i=2 ; i<=n ; i++)
		{
    		B[i] = B[i-1]*b*c*a + B[i-1]*b*a + B[i-1]*b*c;
    		B[i] = B[i]%1000000007;
		}   
		long min=A[1]+B[2];
		long sum=0;
		int i,j;
		for(i=1,j=1;(i<=n && j<=n && i!=j);i++,j++)
		{
			System.out.println(i+"    "+j);
			
				sum=0;
				
					sum=A[i]+B[j];
					if(sum<min)
					{
						min=sum;
					}
				
				
			
		}
		
		System.out.println(min);
    }
}