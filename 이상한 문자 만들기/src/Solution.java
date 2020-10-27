class Solution {
	public String solution(String s) {
		String answer = "";
		
		String[] temp;
		temp = s.split(" ", -1);

		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[i].length(); j++) {
				if (j % 2 == 0) {
					answer += Character.toUpperCase(temp[i].charAt(j));
				} else {
					answer += Character.toLowerCase(temp[i].charAt(j));
				}
			}
			answer += " ";
		}
		answer = answer.substring(0, answer.length() - 1);
		return answer;
	}
}