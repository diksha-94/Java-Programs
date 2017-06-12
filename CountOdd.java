/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CountOdd {
   public static void main(String args[] ) throws Exception {

	//Write code here
    Scanner scan = new Scanner(System.in);
    int num=scan.nextInt();
    int rem=0;
    int count=0;
    while(num>0)
    {
        rem=num%10;
		System.out.print(rem);
        num/=10;
        if(rem%2!=0)
        {
            count++;
        }
    }
    System.out.println(count);
   }
}