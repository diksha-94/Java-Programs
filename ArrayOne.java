import java.util.Scanner;
public class ArrayOne
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter length of array:");
		int n=scan.nextInt();
		int n_copy=n;
		int array[]=new int[n];
		System.out.print("Enter array elements:");
		int i;
		for(i=0;i<n;i++)
		{
			array[i]=scan.nextInt();
		}
		System.out.print("Enter length of sub-array:");
		int k=scan.nextInt();
		int k_copy=k;
		int rev[]=new int[k];
		int sub[]=new int[k];
		i=0;
		int j=-1;
		int num=0;
		if(k>n)
		{
			
		}
		while(i<n_copy && i<k)
		{
			
			if(k_copy>n)
			{
				System.out.println("Inside n: "+n);
				sub=new int[n];
				n=100;
			}
			j++;
			System.out.println("Values: "+i+"  "+j+"  "+k);
			sub[j]=array[i];
			if(i==k-1 || k_copy>num && i==n_copy-1)
			{
				System.out.println("Sub length: "+sub.length);
				for(int m=0;m<sub.length;m++)
					System.out.println(sub[m]);
				reverse(sub,array,k-1,k_copy);
				k=k+k_copy;
				j=-1;
				n=n-k_copy;
				num=n;
				System.out.println("n= "+n);
			}
			i++;
		}
		for(i=0;i<n_copy;i++)
		{
			System.out.println(array[i]);
		}
	}
	
	public static void reverse(int[] sub,int[] array,int i,int k)
	{
		System.out.println("Entered in reverse");
		int l,j=i-k+1;
		for(l=sub.length-1;l>=0;l--)
		{
			System.out.println("------ "+l+"   "+j);
			array[j]=sub[l];
			j++;
		}
	}
}