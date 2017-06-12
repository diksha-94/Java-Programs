import java.util.*;
public class DualNumber {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
		*/
        Scanner scan=new Scanner(System.in);
        int N = scan.nextInt();
        int[] array;
        for (int i = 0; i < N; i++) {
            int len=scan.nextInt();
            array=new int[len];
            //String ar=br.readLine();
            for(int j=0;j<len;j++)
            {
            	array[j]=scan.nextInt();
            }
            int result=largestDual(array);
            System.out.println(result);
        }
    }
    public static int largestDual(int array[])
    {
    	ArrayList<Integer> result=primeNumbers(array);
		int max=-1;
		int num=0;
		System.out.println("Result size : "+result.size());
		for(int i=0;i<result.size();i++)
		{
			for(int j=i;j<result.size();j++)
			{
				num=result.get(i)*result.get(j);
				if(num>max)
					max=num;
			}
		}
    	return max;
    }
    public static ArrayList<Integer> primeNumbers(int array[])
    {
    	ArrayList<Integer> prime=new ArrayList<Integer>();
    	int k=0;
    	int flag=0;
    	for(int i=0;i<array.length;i++)
    	{
			flag=0;
    		for(int j=2;j<=array[i]/2;j++)
    		{
				if(array[i]%j==0)
    			{
					flag=1;
    				break;
    			}
   			}
   			if(flag==0 && array[i]!=1 && array[i]!=0)
   			{
				prime.add(array[i]);
   			}
    	}
    	return prime;
    }
}
