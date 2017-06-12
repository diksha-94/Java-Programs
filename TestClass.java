/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
*/
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
//import for Scanner and other utility  classes
import java.util.*;
*/

class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input
		*/
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        int length=0;
        int k=0;
        int[] array;
        int[] temp;
        int j=0;
		for(int l=0;l<N;l++)
		{
			String[] var = (br.readLine()).split(" ");
			length=Integer.parseInt(var[0]);
			k=Integer.parseInt(var[1]);
			if(k>length)
			{
				k=k-length;
			}
			String[] arrays=(br.readLine()).split(" ");
			array=new int[length];
			temp=new int[length];
			for(int m=0;m<length;m++)
			{
				array[m]=Integer.parseInt(arrays[m]);
				temp[m]=-1;
			}
			for(int i=0;i<length;i++)
			{
				j=i;
				if((i+k)<=length-1)
				{}
				else if((i+k)>length-1)
				{
					for(int p=length-1;p>=0;p--)
					{
						if(temp[p]==-1)
						{
							j=p-k;
						}
					}
				}
				System.out.println(j);
				temp[j+k]=array[i];
			}
			for(int i=0;i<length;i++)
			{
				System.out.print(temp[i]+" ");
			}
		}
		
    }
}
