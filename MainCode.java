import java.util.*;
public class MainCode
{
	public static void main(String[] args)
	{
		int arr[]={3,2,3,8};
		//Set<Integer> indexes=new HashSet<Integer>();
		//indexes.add(-1);
		System.out.println(maxElement(arr));
		
	}

static Set<Integer> indexes=new HashSet<Integer>();
        
    static int maxElement(int[] arr) {
        int max=-1;
        int index=-1;
		Boolean repeat=true;
        //int newArr[]=new int[2];
		while(repeat)
		{
			max=-1;
			index=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max && (!indexes.contains(i)))
            {
                max=arr[i];
                index=i;
            }
        }
		System.out.println("max: "+max);
		System.out.println("index: "+index);
		Boolean flag=false;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
		        if(arr[i]*arr[j]==max)
                {
					System.out.println("yes");
		
					flag=true;
                    break;
                }
            }
        }
		System.out.println("flag: "+flag);
		
		if(flag==true)
        {
			System.out.println("Inside max: "+max);
			repeat=false;
            return max;
        }
        else
        {
			if(index!=-1)
			{
				indexes.add(index);
				//arr[index]=-1;
				//maxElement(arr,indexes);    
			}
			else{
				return -1;
			}
        }
		}
		return -1;
    }
}

