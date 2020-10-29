import java.util.*;

class Solution {
	public int[] solution(int[] arr, int divisor) {
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}
		
		if (list.size() == 0) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			Collections.sort(list);
			answer = new int[list.size()];
			for (int j = 0; j < list.size(); j++) {
				answer[j] = list.get(j);
			}

		}
		return answer;
	}
}