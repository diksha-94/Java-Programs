import java.util.*;
public class MenWomen
{
	public static void main(String args[])
	{
		if(totalCases()==0)
		{
			System.out.println("-1");
		}
		else{
			System.out.println(totalCases());
		}
	}
	public static int totalCases()
	{
		int n=10;
		int fact=factorial(n);
		System.out.println(fact);
		String input="M1#W6#W10,M2#W1#W5,M3#W1#W3#W5#W9,M4#W3#W4,M5#W2#W6,M6#W1#W2#W6,M7#W1#W7#W8,M8#W8#W10,M9#W3#W9,M10#W10";
		String inputs[]=input.split(",");
		String array[]=null;
		//arrays is an array that contains the possibilities
		//cases is an array that contains all the cases
		int[][] arrays=new int[inputs.length][];
		List<Integer> result=new ArrayList<Integer>();
		List<Integer> resultIndex=new ArrayList<Integer>();
		
		for(int i=0;i<inputs.length;i++)
		{
			array=inputs[i].split("#");
			if(array.length==1)
			{
				return -1;
			}
			arrays[i]=new int[array.length-1];
			for(int j=1;j<array.length;j++)
			{
				arrays[i][j-1]=Integer.parseInt(array[j].substring(1));
			}
		}
		
		int count=0;
		//final int n = 3;
		int[][] cases=new int[fact][n];
        int[] current = new int[n];
        for (int i = 1; i <= n; i++) {
            current[i - 1] = i;
        }
		int index=-1;
        int total = 0;
        for (;;) {
			index++;
            total++;

            boolean[] used = new boolean[n + 1];
            Arrays.fill(used, true);

            for (int i = 0; i < n; i++) {
                //System.out.print(current[i] + " ");
				cases[index][i]=current[i];
            }

            //System.out.println();

            used[current[n - 1]] = false;

            int pos = -1;
            for (int i = n - 2; i >= 0; i--) {              
                used[current[i]] = false;

                if (current[i] < current[i + 1]) {
                    pos = i;
                    break;
                }
            }

            if (pos == -1) {
                break;
            }               

            for (int i = current[pos] + 1; i <= n; i++) {
                if (!used[i]) {
                    current[pos] = i;
                    used[i] = true;
                    break;
                }
            }

            for (int i = 1; i <= n; i++) {
                if (!used[i]) {
                    current[++pos] = i;
                }
            }
        }

		/*for(int i=0;i<fact;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(cases[i][j]);
			}
			System.out.println();
		}*/
        System.out.println(total);
		int k=0;
		Boolean var=false;
		for(int i=0;i<fact;i++)
		{
			for(int j=0;j<n;j++)
			{
				var=true;
				for(k=0;k<arrays[j].length;k++)
				{
					if(cases[i][j]!=arrays[j][k])
					{
						//System.out.println("Entered != for "+arrays[j][k]+"      "+i+"      "+j+"       "+k);
						//var=true;
					}
					else
					{
						//System.out.println("Entered == for "+arrays[j][k]+"      "+i+"      "+j+"       "+k);
						
						var=false;
						//break;
					}
				}
				if(var==true)
				{
					//System.out.println("Entered total-- for: "+cases[i][j]);
					total--;
					break;
				}
			}
		}
		
		return total;
	}
	
	
	
	public static int factorial(int n)
	{
		int fact=1;
		for(int i=n;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
}