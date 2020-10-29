class Solution {
	public int[] solution(long n) {
		String nLen = Long.toString(n);
		int[] answer = new int[nLen.length()];
		int i = 0;
		while (n > 0) {
			answer[i++] = (int) (n % 10);
			n /= 10;
		}
		return answer;
	}
}