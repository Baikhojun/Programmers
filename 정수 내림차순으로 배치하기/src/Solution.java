import java.util.*;

public class Solution {
	public static void main(String[] args) {
		
		long n = 118372;
	    String str = String.valueOf(n);
        int len = str.length();
        int [] arr = new int[len];
        long answer = 0;
        
        for(int i=0; i< len ; i++)
        {
            arr[i]= (int)(n%10);
            n/=10;
        }
        //Arrays.sort(arr,Collections.reverseOrder());
        System.out.println("2020-11-11");
	
	}
}
