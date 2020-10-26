import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int len = arr.length;
        
        List <Integer> list =new ArrayList<Integer>();
        list.add(arr[0]); // 무조건들어가니깐..
        for(int i=0; i< arr.length-1 ;i++)
        {   
           if(arr[i]!=arr[i+1])
            {
                list.add(arr[i+1]);
            }
        }
        answer = new int[list.size()];
        for(int z=0; z<list.size();z++)
        {
            answer[z]=list.get(z);
        }
        
        return answer;
    }
}