import java.io.*;
import java.util.*;
public class FlippingBits 
{ 

    public static int nochange_bits(String input1,int input2,int input3)
    {
        //Write code here
        StringBuilder originalStr=new StringBuilder(input1);
        StringBuilder newStr=new StringBuilder(input1);
        int count=0;
        if(input2<=0 || input3<=0)
        {
            return -1;
        }
        int j=input2-1;
        char a='0';
        while(j<newStr.length())
        {
            if(newStr.charAt(j)=='1')
            {
                newStr.setCharAt(j,'0');
            }
            else if(newStr.charAt(j)=='0')
            {
                newStr.setCharAt(j,'1');
            }
            j+=input2;
        }
        j=input3-1;
        while(j<newStr.length())
        {
            if(newStr.charAt(j)=='1')
            {
                newStr.setCharAt(j,'0');
            }
            else if(newStr.charAt(j)=='0')
            {
                newStr.setCharAt(j,'1');
            }
            j+=input3;
        }
        for(int i=0;i<originalStr.length();i++)
        {
            if(originalStr.charAt(i)==newStr.charAt(i))
            {
                count++;
            }
        }
        return count;
        
    }
}