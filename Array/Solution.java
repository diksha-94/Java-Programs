import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
public static List<List<Character>> list = new ArrayList<List<Character>>();
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int len=s.length();
        char[] array = new char[len];
        for(int i=0;i<len;i++)
            {
            array[i]=s.charAt(i);
        }
        char[] temp=new char[len];
        for(int i=0;i<len;i++)
            {
            temp[i]=array[i];
        }
        combination(array,0,len,temp);
        String result="";
        int count=0;
		System.out.println(list);
        for(List<Character> l:list)
            {
            result="";
            for(Character ch:l)
                {
                result+=ch;
            }
            if(result.length()==1 && result.startsWith("0"))
                {
					System.out.println(result);
                count++;
            }
            else if(result.startsWith("0"))
                {
                continue;
            }
            else
                {
                int num=Integer.parseInt(result);
                if(num%6==0)
                    {count++;
				System.out.println(result);}
            }
        }
        System.out.println(count);
    }
    public static void combination(char a[], int k, int n, char temp[])
	{
		if(k==n-1)
		{
			a[k]=0;
			addComb(a,n,temp);
			a[k]=1;
			addComb(a,n,temp);
			return;
		}
		a[k]=0;
		combination(a,k+1,n,temp);
		a[k]=1;
		combination(a,k+1,n,temp);
		
	}
    public static void addComb(char a[], int n,char temp[])
	{
		int j=0;
		int sum=0;
		int flag0=0;
		int flag1=0;
		int newFlag=0;
		for(int i=0;i<n;i++)
		{
			
			if(a[i]==0 && (flag1==0) && newFlag==0)
			{
				flag0=1;
			}
			if(a[i]==0 && (flag1==1) && newFlag==1)
			{
				flag0=0;
				newFlag=0;
			}
			if(a[i]==1 && flag0==1)
			{
				sum++;
				flag1=1;
				newFlag=1;
				
			}
			
			else if(a[i]==1 && (flag0==0 && flag1==1) && newFlag==0)
			{
				sum=-1;
				break;
			}
			else if(a[i]==1)
			{
				sum++;
				flag1=1;
				newFlag=1;
			}
			
		}
		if(sum>0)
		{
		//resultArray[index]=new char[sum];
        List<Character> dummy=new ArrayList<Character>();
		for(int i=0;i<n;i++)
		{
			
			if(a[i]==1)
			{
                
                dummy.add(temp[i]);
				
			}
		}
        list.add(dummy);
		}
		
		
		//System.out.println();
	}
}
