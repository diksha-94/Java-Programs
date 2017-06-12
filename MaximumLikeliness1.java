import java.util.*;
public class MaximumLikeliness1
{
	public static void main(String[] args){
		System.out.println(matching("C1(P1,4,P2,4)C2(P1,4,P2,4)C3(P3,4,P4,4)C4(P3,4,P4,4)C5(P5,9)"));
	}
	public static String matching(String input1)
    {
        input1 = input1.substring(0,input1.length()-1);
		input1 = input1.replace("(","hhh");
		input1 = input1.replace(")","ttt");
		String[] input2 = input1.split("ttt");
		int num = input2.length;
		ArrayList<String> array = new ArrayList<String>();
	    ArrayList<String> temp = new ArrayList<String>();String str="";
	    for(int i=0;i<input2.length;i++) {
	        String[] input3 = input2[i].split("hhh");
	        String[] input4 =input3[1].split(",");
		    int j=0;
	        while(j<input4.length) {
	            str+=input3[0]+",";
	            str+=input4[j]+",";
	            j++;
	            str+=input4[j];
	            j++;
	            array.add(str);
	            temp.add(str);
	            str="";
	        }
	    }
	    String output="";
	    combination(array,0,array.size(),temp,num);
		//System.out.println(result);
		if(result.size() == 0){
		    output+="Matching not possible";
			return output;
		}
		int max=Integer.MIN_VALUE;
		int sum=0;
		String indexes="";
		for(int i=0;i<result.size();i++){
			sum=0;
			String str1[] = result.get(i).split("::");
			for(int k=0;k<str1.length;k++) {
				String[] test = str1[k].split(",");
				
				sum+=Integer.parseInt(test[2]);
			}
			if(sum>max){
				//System.out.println("Inside 1: "+sum);
				indexes=i+",";
				max=sum;
			}
			else if(sum==max){
				//System.out.println("Inside 2: "+sum);
				indexes+=i+",";
			}
			
		}
		indexes=indexes.substring(0,indexes.length()-1);
		//String output = "";
		String[] indexSplit = indexes.split(",");
		if(indexSplit.length > 1) {
			for(int t=0;t<indexSplit.length;t++) {
				
		        output+=max+"(";
			
			    String[] str1 = (result.get(Integer.parseInt(indexSplit[t]))).split("::");
			    for(int n=0;n<str1.length;n++) {
				    String[] splitted = str1[n].split(",");
				    if(n==str1.length-1)
				    	output+=splitted[0]+","+splitted[1]+")";
				    else
				    	output+=splitted[0]+","+splitted[1]+")(";
			    }
			    if(t!=indexSplit.length-1)
			        output+="|";
		    }
			
		}
		else {
			output+=max+"(";
			String[] str1 = (result.get(Integer.parseInt(indexSplit[0]))).split("::");
			for(int n=0;n<str1.length;n++) {
				String[] splitted = str1[n].split(",");
				if(n==str1.length-1)
					output+=splitted[0]+","+splitted[1]+")";
				else
					output+=splitted[0]+","+splitted[1]+")(";
			}
			
		}
		//System.out.println("indexes: "+output);
		//[C1,P2,5::C2,P1,4::C3,P3,5::C4,P5,5::C5,P4,9
		return output;
		
	}
	public static void combination(ArrayList<String> a, int k, int n,ArrayList<String> temp,int num)
	{
		if(k==n-1)
		{
			a.set(k,"0");
			//a[k]="0";
			addComb(a,temp,n,num);
			a.set(k,"1");
			//a[k]="1";
			addComb(a,temp,n,num);
			return;
		}
		
		a.set(k,"0");
		//a[k]="0";
		combination(a,k+1,n,temp,num);
		a.set(k,"1");
		//a[k]="1";
		combination(a,k+1,n,temp,num);
		
	}
	public static ArrayList<String> result = new ArrayList<String>();
	public static void addComb(ArrayList<String> a, ArrayList<String> temp,int n,int num)
	{
		String dummy = "";
		int sum = 0;
		for(int i=0;i<n;i++)
		{
			if(a.get(i)=="1")
			{
				sum++;
				//dummy=dummy+"::"+temp[i];
			}
		}
		if(sum==num){
			for(int i=0;i<n;i++)
			{
				if(a.get(i)=="1")
				{
					dummy=dummy+"::"+temp.get(i);
				}
			}
			//int max = Integer.MIN_VALUE;
			Set<String> setForRow = new HashSet<String>();
			Set<String> setForColumn = new HashSet<String>();
			dummy = dummy.substring(2);
			String str[] = dummy.split("::");
		//	int sum=0;
			for(int k=0;k<str.length;k++) {
				String[] test = str[k].split(",");
				setForRow.add(test[0]);
				setForColumn.add(test[1]);
				//sum+=Integer.parseInt(test[3]);
			}
			if(setForRow.size()==num && setForColumn.size()==num){
				result.add(dummy);
				//System.out.println(dummy);
			}
		}
	}
}
