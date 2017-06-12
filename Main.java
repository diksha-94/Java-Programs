import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        final int n = 3;
		int[][] cases=new int[6][n];
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

		for(int i=0;i<6;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(cases[i][j]);
			}
			System.out.println();
		}
        System.out.println(total);
    }       
}