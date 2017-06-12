/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCodeGlassCount {
   public static void main(String args[] ) throws Exception {

	//Write code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String str="";
        int[] entry_hr=new int[n];
        int[] entry_min=new int[n];
        int[] exit_hr=new int[n];
        int[] exit_min=new int[n];
        for(int k=0;k<n;k++)
        {
            str=br.readLine();
            String[] entryExit=str.split("#");
            String entry_time=(entryExit[0].split(" "))[1];
            String exit_time=(entryExit[1].split(" "))[1];
			System.out.println("Exit time: "+exit_time);
			if((entry_time.split(":"))[0].startsWith("0"))
            {
				System.out.println(((entry_time.split(":"))[0]).charAt(1));
                entry_hr[k]=Integer.parseInt(String.valueOf(((entry_time.split(":"))[0]).charAt(1)));
            }
			else{
				entry_hr[k]=Integer.parseInt((((entry_time.split(":"))[0])));
			}
            if((exit_time.split(":"))[0].startsWith("0"))
            {
				System.out.println(((exit_time.split(":"))[0]).charAt(1));
                exit_hr[k]=Integer.parseInt(String.valueOf(((exit_time.split(":"))[0]).charAt(1)));
            }
			else{
				exit_hr[k]=Integer.parseInt((((exit_time.split(":"))[0])));
			}
            if((entry_time.split(":"))[1].startsWith("0"))
            {
				System.out.println(((entry_time.split(":"))[1]).charAt(1));
                entry_min[k]=Integer.parseInt(String.valueOf(((entry_time.split(":"))[1]).charAt(1)));
            }
			else{
				entry_min[k]=Integer.parseInt((((entry_time.split(":"))[1])));
			}
            if((exit_time.split(":"))[1].startsWith("0"))
            {
				System.out.println(((exit_time.split(":"))[1]).charAt(1));
                exit_min[k]=Integer.parseInt(String.valueOf(((exit_time.split(":"))[1]).charAt(1)));
            }
			else{
				exit_min[k]=Integer.parseInt((((exit_time.split(":"))[1])));
			}
			System.out.println(entry_hr[k]+"    "+exit_hr[k]+"     "+entry_min[k]+"      "+exit_min[k]);
        }
        for(int k=0;k<n;k++)
        {
			System.out.println(entry_hr[k]+"      "+exit_hr[k]);
            if(entry_hr[k]>exit_hr[k])
            {
                System.out.println("-1");
                return;
            }
            else if(entry_hr[k]==exit_hr[k])
            {
                 if(entry_min[k]>exit_min[k])
                {
                    System.out.println("-1");
                    return;
                }
            }
        }
        Set<Integer> index=new HashSet<Integer>();
		index.add(0);
		int count=1;
		int freeGlasses=0;
		for(int i=0;i<entry_hr.length;i++)
		{
			for(int j=i+1;j<entry_hr.length;j++)
			{
				if(entry_hr[i]==entry_hr[j])
				{
					if((entry_min[i]==entry_min[j]) && (!index.contains(j)))
					{
						if(freeGlasses>0)
						{
							freeGlasses--;
						}
						else{
							count++;
						}
						//count++;
						index.add(j);
						
					}
					else
					{
						freeGlasses++;
					}
				}
			}
		}
		System.out.println(count);
   }
}
