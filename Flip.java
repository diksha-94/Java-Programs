import java.util.*;
public class Flip {
    public static void main(String[] args) {
		String A = "100101101";
        StringBuilder dummy = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int len = A.length();
        int count=0;
        int max=0;
        for(int i=0;i<len;i++)
        {
            if(A.charAt(i)=='1')
            {
                max++;
            }
        }
        
        int l=-1;
        int r=-1;
        
        for(int i=0;i<len-1;i++)
        {
            for(int j = i;j<len;j++)
            {
                dummy = new StringBuilder(A);
                count=0;
                l=i+1;
                r=j+1;
                for(int k=i;k<=j;k++)
                {
                    if(A.charAt(k) == '0')
                    {
                        dummy.setCharAt(k,'1');
                        //dummy.charAt(k) = '1';
                    }
                    else if(A.charAt(k) == '1')
                    {
                        dummy.setCharAt(k,'0');
                        //dummy.charAt(k) == '0';
                    }
                }
				System.out.println("l: "+l+"----- r: "+r+"------ dummy: "+dummy);
                //counting number of 1's in generated string
                for(int m=0;m<len;m++)
                {
                    if(dummy.charAt(m)=='1')
                    {
                        count++;
                    }
                }
				
                if(count>max && list.size()==0)
                {
					System.out.println("Inside if: list: "+ list+"----- count: "+count+"----- l: "+l+"----- r: "+r);
                    max=count;
                    list.add(l);
                    list.add(r);
                }
				else if(list.size()>0)
				{
					System.out.println("else if");
					if(count>max)
					{
						System.out.println("else if if");
						list = new ArrayList<Integer>();
                        list.add(l);
                        list.add(r);
						max=count;
					}
					else if(count == max)
					{
						System.out.println("else if else if");
						if((l>list.get(0)) || ((l == list.get(0)) && (r>list.get(1))))
						{
							System.out.println("else if else if if");
                        }
						else{
							System.out.println("else if else if else");
							list = new ArrayList<Integer>();
							list.add(l);
							list.add(r);
						}
					}
					
				}
                
            }
        }
        System.out.println(list);
    }
}
