public class GCD1 {
	public static void main(String[] args)
	{
		
		int a=350,b=136;
	    
	    if(a==0)
	    {
	        System.out.println(b);
	    }
	    if(b==0)
	    {
	        System.out.println(a);
	    }
	    if(b<a)
	    {
	        int temp=a;
	        a=b;
	        b=temp;
	    }
	    int m=a,n=b;
	    while(b>a)
	    {
	        if((b-a)>a)
	        {
	            b=b-a;
	        }
	        else
	        {
	            a=b-a;
	            b=m;
	            m=a;
	        }
	    }
	    System.out.println(b);
	}
}
