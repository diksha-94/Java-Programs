public class IfPowerOf2 {
	public static void main(String[] args){
		System.out.println(power("128"));
	}
	public static int power(String a) {
	    Double num = Double.parseDouble(a);
	    if(num==0d || num==1d){
	        return 0;
	    }
	    return findPower(num);
	}
	public static int findPower(Double num){
	    if(num%1 != 0){
			return 0;
		}
	    if(num==1d){
	        return 1;
	    }
	    return findPower(num/2);
	}
}
