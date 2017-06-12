public class TestClass10 {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
		*/
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String line[] = (br.readLine()).split(" ");
        long n=1000565433;
        long k=2008768876;
        long m=5987986;
        long result=0;
        for(long i=1;i<=n;i++)
        {
        	for(long j=1;j<=i;j++)
        	{
        		result+=Math.pow(j,k);
        	}
        }
        result=result%m;
        System.out.println(result);
        
        
    }
}
