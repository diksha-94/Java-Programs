import java.util.Scanner;;
public class MultiDArray
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int len=scan.nextInt();
		int query=scan.nextInt();
		String str=scan.nextLine();
		int queries[][]=new int[query][3];
		
		for(int i=0;i<query;i++)
		{
			for(int j=0;j<3;j++)
			{
				queries[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<query;i++)
		{
			char sol=kthCharacter(str,queries[i][0],queries[i][1],queries[i][2]);
			System.out.println("kth smallest character : "+sol);
		}
		
	}
	public static char kthCharacter(String str,int l,int r,int k)
	{
		String newStr="";
		for(int i=l-1;i<r-1;i++)
		{
			newStr=newStr+str.charAt(i);
		}
		System.out.println("Substring is : "+newStr);
		int min=256;
		char minEle;
		int index;
		if(k>0)
		{
			for(int i=0;i<newStr.length();i++)
			{
				if((int)newStr.charAt(i)<min)
				{
					minEle=newStr.charAt(i);
					min=(int)newStr.charAt(i);
					index=i;
					k--;
				}
			}
			newStr.setCharAt(index, (char)255);
			System.out.println("String after removing small character: "+newStr);
		}
		return minEle;
	}
}

