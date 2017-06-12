public class Fibonacci{
	public static void main(String[] args){
		System.out.println(findTerm(8));
	}
	public static int findTerm(int n){
		if(n==1 || n==2){
			return 1;
		}
		return findTerm(n-1)+findTerm(n-2);
	}
}