import java.math.*;
public class TestClassFact {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
		*/
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String[] line = (br.readLine()).split("");
        BigInteger n=BigInteger.valueOf(1000);
		BigInteger k=BigInteger.valueOf(3);
        BigInteger k_copy=k;
        BigInteger h=BigInteger.valueOf(1);
        BigInteger result=BigInteger.valueOf(0);
        while(k.compareTo(n) ==-1)
        {
        	
        	result=result.add(passToComb(n,k));
        	h=h.add(BigInteger.valueOf(1));
			k=k_copy.multiply(h);
        }
        BigInteger resu=BigInteger.valueOf(0);
		resu=resu.add(result);
		resu=resu.add(BigInteger.valueOf(1));
        BigInteger num=BigInteger.valueOf(0);
        BigInteger rem=BigInteger.valueOf(0);
        BigInteger a=BigInteger.valueOf(1);
        BigInteger res=BigInteger.valueOf(0);
        BigInteger p=BigInteger.valueOf(0);
        while(num.compareTo(BigInteger.valueOf(5)) ==-1)
        {
        	rem=resu.mod(BigInteger.valueOf(10));
        	resu=resu.divide(BigInteger.valueOf(10));
        	
        	rem=(rem.multiply(a)).add(p);
        	num=num.add(BigInteger.valueOf(1));
        	a=a.multiply(BigInteger.valueOf(10));
        	p=rem;
        }
        System.out.println(resu);
    }
    public static BigInteger passToComb(BigInteger n,BigInteger k)
    {
    	return ((fact(n)).divide(fact(k).multiply(fact(n.subtract(k)))));
    }
    public static BigInteger fact(BigInteger n)
    {
		BigInteger f = BigInteger.valueOf(1);

        
  
		//System.out.println("n: "+n);
    	
    	for(BigInteger i=n;i.compareTo(n) !=-1;i=i.subtract(BigInteger.valueOf(1))){
			//System.out.println("i: "+i);
			f=f.multiply(i);
		//	System.out.println("Inside f: "+f);
		}
		System.out.println("Fact: "+f);
    	return f;
    }
}
