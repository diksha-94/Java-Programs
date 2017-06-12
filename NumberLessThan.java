import java.util.*;
public class NumberLessThan {
    public static void main(String[] args) {
	List<Integer> A = new ArrayList<Integer>();
	A.add(0);
	A.add(1);
	A.add(5);
	//A.add();
	int B=1;
	int C=2;
        int len = A.size();
        if(len==0)
        {
            System.out.println(0);
			System.exit(0);
        }
        int array[]=new int[len];
        int dummy[]=new int[len];
        int index = 0;
        for(Integer a : A)
        {
            array[index] = a;
			dummy[index] = a;
            index++;
        }
        System.out.println(len);
        combination(array, dummy, 0, len, B, C);
        System.out.println(count);
	}
    public static int count=0;
    public static void combination(int[] a, int[] dummy, int k, int n, int b, int c)
    {
        if(k==n-1)
        {
            a[k]=0;
            addCombination(a, dummy, b,c);
            a[k]=1;
            addCombination(a, dummy, b,c);
			return;
        }
        a[k]=0;
        combination(a, dummy, k+1,n,b,c);
        a[k]=1;
        combination(a, dummy, k+1,n,b,c);
    }
    public static void addCombination(int[] array, int[] temp, int b, int c)
    {
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
			//System.out.print(array[i]+"\t");
            if(array[i]==1)
                sum++;
        }
		//System.out.println();
        String num = "";
        if(sum==b)
        {
            for(int i=0;i<array.length;i++)
            {
			//	System.out.print(num+"\t");
                if(array[i]==1){
                    num+=temp[i];
					//System.out.println("temp[i]: "+temp[i]);
				}
            }
		//	System.out.println();
        }
		System.out.println("----: "+num);
        int number;
        if(num.equals("") || (num.startsWith("0") && num.length()>1))
        {
            number = Integer.MAX_VALUE;
        }
        
        else
        {
            number=Integer.parseInt(num);
        }
        System.out.println("Number: "+number+"      c: "+c);
        if(number<c)
        {
			System.out.println("Inside count");
            count++;
        }
    }
    
}
