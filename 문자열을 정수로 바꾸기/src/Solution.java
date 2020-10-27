class Solution {
	public int solution(String s) {
		int answer = 0;
		// 0 ~ 9 : 48 ~ 57 , + : 43 , - : 45

		boolean swt = true;
		int firstNum = (int) s.charAt(0);
		int len = s.length();
		// - üũ
		if (firstNum == 45)
			swt = false;

		for (int i = 0; i < len; i++) {
			if ((int) s.charAt(i) != 45 && (int) s.charAt(i) != 43) {
				answer = answer * 10 + (s.charAt(i) - '0');
			}
		}

		return (swt ? 1 : -1) * answer;
	}
}