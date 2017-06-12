/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility  classes
/*
import java.util.*;
*/

class TestClassSorting {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input
		*/
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = (br.readLine()).split(" ");
        int N = Integer.parseInt(line[0]);
        int T=Integer.parseInt(line[1]);
		/*
        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
		*/
		int[] devotion = new int[N];
		String[] fans = new String[N];
        for (int i = 0; i < N; i++) {
            String[] names=(br.readLine()).split(" ");
            devotion[i]=Integer.parseInt(names[1]);
            fans[i]=names[0];
        }
        int temp=0;
        String temp_str="";
        for(int i=0;i<N;i++)
        {
        	for(int j=i+1;j<N;j++)
        	{
        		if(devotion[i]>devotion[j])
        		{
        			temp=devotion[i];
        			devotion[i]=devotion[j];
        			devotion[j]=temp;
        			
        			temp_str=fans[i];
        			fans[i]=fans[j];
        			fans[j]=temp_str;
        		}
        	}
        }
		for(int i=0;i<N;i++)
		{
			System.out.println(fans[i]);
		}
        int count=0;
        int len;
        int flag=0;
        int flag_len=0;
        for(int i=N-1;i>=0;i--)
        {
        	if(count<T)
        	{
        		if(devotion[i]==devotion[i-1] && count==T-1)
        		{
        			if(fans[i].length()<=fans[i-1].length())
        			{
        				flag_len=0;
        				len=fans[i].length();
        			}
        			else{
        				flag_len=1;
        				len=fans[i-1].length();
        			}
        			for(int j=0;j<len;j++)
        			{
        				if(fans[i].charAt(j)==fans[i-1].charAt(j))
        				{
        					flag=0;
        					continue;
        				}
        				else if(fans[i].charAt(j)>fans[i-1].charAt(j))
        				{
        					flag=1;
        				}
        				else if(fans[i-1].charAt(j)>fans[i].charAt(j))
        				{
        					flag=2;
        				}
        			}
					System.out.println("Flag: "+flag+"   Flag_len: "+flag_len);
        			if(flag==0 && flag_len==0)
        			{
        				System.out.println(fans[i]);
        			}
        			else if(flag==0 && flag_len==1)
        			{
        				System.out.println(fans[i-1]);
        			}
        			else if(flag==1)
        			{
        				System.out.println(fans[i-1]);
        			}
        			else if(flag==2)
        			{
        				System.out.println(fans[i]);
        			}
        		}
        		else{
        			System.out.println(fans[i]);
        		}
        		count++;
        	}
        }
    }
}
